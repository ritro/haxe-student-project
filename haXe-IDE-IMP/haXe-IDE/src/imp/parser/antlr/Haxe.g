grammar Haxe;

options {
    backtrack=true;
    memoize=true;
    output=AST;
}

tokens {
    PROPERTY_DECL;
    MODULE;
    SUFFIX_EXPR;
    CALL_OR_SLICE;
    PREFIX_EXPR;
    BLOCK_SCOPE;
    PARAM_LIST;
    TYPE_TAG;
    TYPE_PARAM;
    TYPE_CONSTRAIN;
    IMPLEMENT_LIST;
    DECL_ATTR_LIST;
    IDENT;
    ASSIGN_OPERATOR;
    PACKAGE;
}

@lexer::header{
package imp.parser.antlr;

import java.util.HashMap;
//import java.util.Stack; // imported by ANTLR
}

@lexer::members {
    List tokens = new ArrayList();
    // buffer fot emitting
    public void emit(Token token) {
            state.token = token;
            tokens.add(token);
    }
    public Token nextToken() {
            super.nextToken();
            if ( tokens.size()==0 ) {
                return Token.EOF_TOKEN;
            }
            return (Token)tokens.remove(0);
    }
    // Preprocessor Data Structures - see lexer section below and PreProcessor.cs
    protected HashMap<String,String> macroDefines = new HashMap<String,String>();    
    protected Stack<Boolean> processing = new Stack<Boolean>();

    // Uggh, lexer rules don't return values, so use a stack to return values.
    protected Stack<Boolean> returns = new Stack<Boolean>();
}


@header{
package imp.parser.antlr;

import tree.HaxeTree;
import tree.specific.Module;
import tree.specific.Assignment;
import tree.specific.BinaryExpression;
import tree.specific.BlockScope;
import tree.specific.type.ClassNode;
import tree.specific.UnarExpression;
import tree.specific.type.EnumNode;
import tree.specific.ErrorNode;
import tree.specific.DoWhile;
import tree.specific.For;
import tree.specific.Function;
import tree.specific.IfNode;
import tree.specific.MethodCall;
import tree.specific.NewNode;
import tree.specific.SliceNode;
import tree.specific.SwitchNode;
import tree.specific.TryNode;
import tree.specific.Return;
import tree.specific.Declaration;
import tree.specific.Usage;
import tree.specific.TypeTag;
import tree.specific.Constant;
import tree.specific.ArrayNode;
import tree.specific.While;
}

module          : myPackage? imports* topLevelDecl* -> ^(MODULE<Module> myPackage? imports* topLevelDecl*)
                ;

imports         : IMPORT^ filepath SEMI!
                | USING^ filepath SEMI!
                ;

myPackage       : PACKAGE^ filepath SEMI!
                ;                
    
filepath        : a=IDENTIFIER (b=DOT d=IDENTIFIER{$a.setText($a.text+$b.text + $d.text);})* -> $a
                ;
////////////////////////UNCHECKED BEGIN
meta    : MONKEYS_AT metaName (LPAREN paramList? RPAREN)?
    ;

metaName
    : IDENTIFIER
//    | keyword ?
    | COLON metaName
    ;

typeDeclFlags
    : (meta)* (EXTERN | PRIVATE)*
    ;
                
//////////////////////UNCKECK END
    
/* ------------------------- Basics ---------------------------*/
topLevelAccess  : PRIVATE
                | EXTERN
                ;

declAttr        : STATIC
                | INLINE
                | DYNAMIC
                | OVERRIDE
                | PUBLIC
                | PRIVATE
                ;
                
topLevelAccessAttr
                : topLevelAccess -> ^(DECL_ATTR_LIST<HaxeTree>["Top_Level_Access"] topLevelAccess)
                ;

declAttrList    : declAttr+ -> ^(DECL_ATTR_LIST<HaxeTree>["DECL_ATTR_LIST"] declAttr+)
                ;

paramList       : param (COMMA param)* -> ^(PARAM_LIST<HaxeTree>["PARAM_LIST"] param+)
                ;

param           : QUES? IDENTIFIER typeTag? varInit? -> ^(IDENTIFIER<Declaration> typeTag? varInit? QUES?)
                ;

identifier      : IDENTIFIER<Usage>
                ;
                
id              : identifier
                | THIS<Usage>
                | SUPER<Usage>
                ;

assignOp        : EQ       -> EQ<Assignment>
                | PLUSEQ   -> PLUSEQ<Assignment>
                | SUBEQ    -> SUBEQ<Assignment>
                | STAREQ   -> STAREQ<Assignment>
                | SLASHEQ  -> SLASHEQ<Assignment>
                | PERCENTEQ -> PERCENTEQ<Assignment>
                | AMPEQ    -> AMPEQ<Assignment>
                | BAREQ    -> BAREQ<Assignment>
                | CARETEQ  -> CARETEQ<Assignment>
                | LTLTEQ   -> LTLTEQ<Assignment>
                | GTGTEQ   -> GTGTEQ<Assignment>
                | GTGTGTEQ -> GTGTGTEQ<Assignment>
                ;
                
funcLit         : FUNCTION<Function>^ LPAREN! paramList? RPAREN! typeTag? block
                ;
/*
! -------------- Preprocessor----------------------------------
! Not actually implemented as a preprocessor though.
*/
/*pp                : ppIf
                    |   ppElseIf
                    |   ppElse
                    |   ppEnd
                    |   ppError
    ;
ppIf              : PP_IF IDENTIFIER
                    |   PP_IF BANG IDENTIFIER
    ;
ppElseIf          : PP_ELSEIF IDENTIFIER
                    |  PP_ELSEIF BANG IDENTIFIER
    ;
ppElse            : PP_ELSE
    ;
ppEnd             : PP_END
    ;
ppError           : PP_ERROR
    ;
*/
    
/* --------------- Types --------------------------------------*/

typeTag         : COLON funcType -> ^(TYPE_TAG<TypeTag> funcType)
                ;

typeList        : funcType (COMMA! typeList)?
                | typeConstraint (COMMA! typeList)? 
                ;

funcType        : type (MINUS_BIGGER! type)*
                ;
    
anonType        : LBRACE anonTypePart? RBRACE -> ^(TYPE_TAG<TypeTag>["AnonType", LBRACE, RBRACE] anonTypePart?)
                ;

anonTypePart    : anonTypeFieldList
                | varDecl+
                | typeExtend COMMA! ( anonTypeFieldList | varDecl+)? 
                ;
    
anonTypeFieldList 
                : anonTypeField (COMMA anonTypeField)* -> anonTypeField+
                ;

type            : ( filepath^ | anonType^ ) typeParam?
                ;
    
typeParam       : LT typeList typeParamPart -> ^(TYPE_PARAM<HaxeTree>["TYPE_PARAM"] typeList typeParamPart)
                | LT typeList GT -> ^(TYPE_PARAM<HaxeTree>["TYPE_PARAM"] typeList )
                ;
                
typeParamPart   : LT typeList GTGT -> ^(TYPE_PARAM<HaxeTree>["TYPE_PARAM"] typeList)
                | LT typeList typeParam? GTGTGT -> ^(TYPE_PARAM<HaxeTree>["TYPE_PARAM"] typeList typeParam?)
                ;
       
typeConstraint
    : identifier COLON LPAREN typeList RPAREN -> ^(TYPE_CONSTRAIN<HaxeTree>["TYPE_CONSTRAIN"] identifier typeList?)
    ;
    
/*-------------------------Statements--------------------------*/
statement       : statementLast
                | expr SEMI!
                ;
    
statementLast   : block
                | IF<IfNode>^ parExpression (statementOrLast ELSE!)? statement
                | FOR<For>^ LPAREN! expr IN! iterExpr RPAREN! statement
                | WHILE<While>^ parExpression statement
                | DO<DoWhile>^ statement WHILE! parExpression SEMI!
                | TRY<TryNode>^ block catchStmt+
                | SWITCH<SwitchNode>^ LPAREN! expr RPAREN! LBRACE! caseStmt+ RBRACE!
                | RETURN<Return>^ expr? SEMI!
                | THROW^ expr SEMI!
                | (BREAK | CONTINUE) SEMI!
    //| IDENTIFIER COLON statement                 -> ^(COLON IDENTIFIER? statement?)
    ;
    
statementOrLast : statementLast
                | expr
                ;
   
parExpression   : LPAREN! expr RPAREN!
                ;

block           : LBRACE (blockStmt)* RBRACE -> ^(BLOCK_SCOPE<BlockScope>[$LBRACE, $RBRACE] blockStmt*)
                ;

blockStmt       : varDecl
    |    classDecl
    |    statement
    ;
    
caseStmt        : CASE^ exprList COLON! statement
                | DEFAULT^ COLON! statement
                ;
    
catchStmt       : CATCH<HaxeTree>^ LPAREN! param RPAREN! block
                ;
/*----------------------Expressions----------------------------*/
    
exprList        : expr (COMMA! expr)*
                ;
    
expr            : UNTYPED^ assignExpr
                | assignExpr
                ;

assignExpr      : ternaryExpr (assignOp^ ternaryExpr)?
                ;

ternaryExpr     : logicOrExpr (QUES^ expr COLON! ternaryExpr)?
                ;

logicOrExpr     : logicAndExpr (BARBAR<BinaryExpression>^ logicAndExpr)*
                ;
    
logicAndExpr    : iterExpr(AMPAMP<BinaryExpression>^ iterExpr)*
                ;
                
iterExpr        : cmpExpr (ELLIPSIS<BinaryExpression>^ cmpExpr)?
                ;
    
cmpExpr         : bitExpr ((
                      EQEQ<BinaryExpression>^ 
                    | BANGEQ<BinaryExpression>^ 
                    | GTEQ<BinaryExpression>^ 
                    | LTEQ<BinaryExpression>^ 
                    | GT<BinaryExpression>^ 
                    | LT<BinaryExpression>^) bitExpr)*
                ;
    
bitExpr         : shiftExpr ((
                      BAR<BinaryExpression>^ 
                    | AMP<BinaryExpression>^ 
                    | CARET<BinaryExpression>^) shiftExpr)*
                ;

shiftExpr       : addExpr ((
                      LTLT<BinaryExpression>^ 
                    | GTGT<BinaryExpression>^ 
                    | GTGTGT<BinaryExpression>^) addExpr)*
                ;

addExpr         : multExpr ((
                      PLUS<BinaryExpression>^ 
                    | SUB<BinaryExpression>^) multExpr )*
                ;
    
multExpr        : unarExpr ((
                      STAR<BinaryExpression>^ 
                    | SLASH<BinaryExpression>^ 
                    | PERCENT<BinaryExpression>^) unarExpr)*
                ;

unarExpr        : (
            SUB<UnarExpression>^|
            SUBSUB<UnarExpression>^|
            PLUSPLUS<UnarExpression>^|
            BANG<UnarExpression>^|
            TILDE<UnarExpression>^) prefixExpr
                | prefixExpr (PLUSPLUS<UnarExpression>^|SUBSUB<UnarExpression>^)?
                ;  
    
prefixExpr      : NEW<NewNode>^ type LPAREN! exprList? RPAREN!
                | CAST^ LPAREN! expr (COMMA! funcType)? RPAREN!
                | methodCallOrSlice
                ;

methodCallOrSlice 
                : value LPAREN exprList? RPAREN pureCallOrSlice?
            -> ^(CALL_OR_SLICE<MethodCall>[$LPAREN, $RPAREN] value exprList? pureCallOrSlice?)
                | value LBRACKET expr RBRACKET pureCallOrSlice? 
            -> ^(CALL_OR_SLICE<SliceNode>[$LBRACKET, $RBRACKET, false] value expr pureCallOrSlice?)
                | value^ pureCallOrSlice 
                | value
                ;

pureCallOrSlice : LBRACKET expr? RBRACKET pureCallOrSlice? -> ^(
                CALL_OR_SLICE<SliceNode>[$LBRACKET, $RBRACKET, true] expr? pureCallOrSlice?)
                | DOT^ methodCallOrSlice
                ;

arrayObj        : LBRACKET exprList? RBRACKET
            -> ^(SUFFIX_EXPR<ArrayNode>[$LBRACKET, $RBRACKET] exprList?)
                ;
                
value
    //|   RegexLit?
    :   objLit
    | funcLit
    | arrayObj
    | elementarySymbol
    |   LPAREN expr RPAREN '?' expr COLON expr -> ^(LPAREN<IfNode> expr+)
    |   LPAREN! expr RPAREN!
    // TODO: if id is in callAlSlice and else we can't use THIS
    |   id typeParam? 
    ;
/*-------------------- Declarations----------------------------*/

topLevelDecl    : classDecl
                | interfaceDecl
                | enumDecl
                | typedefDecl
                ;
    
enumDecl        : topLevelAccessAttr? ENUM IDENTIFIER typeParam? enumBody -> ^(IDENTIFIER<EnumNode> topLevelAccessAttr? typeParam? enumBody)
                ;

enumBody        : LBRACE (enumValueDecl)* RBRACE -> ^(BLOCK_SCOPE<BlockScope>[$LBRACE, $RBRACE] enumValueDecl*)
                ;

enumValueDecl   : IDENTIFIER<Declaration>^ LPAREN! paramList? RPAREN! SEMI!  
                | IDENTIFIER<Declaration> SEMI!
            //  |   pp
                ;
    
classDecl       : topLevelAccessAttr? CLASS IDENTIFIER typeParam?  ((extending (COMMA implementList)?)|implementList)?  classBodyScope 
                    -> ^(IDENTIFIER<ClassNode> topLevelAccessAttr? typeParam? extending? implementList? classBodyScope)
                ;

classBodyScope  : LBRACE (classMember)* RBRACE -> ^(BLOCK_SCOPE<BlockScope>[$LBRACE, $RBRACE] classMember*)
                ;
    
classMember     : varDeclClass
                | funcDecl 
            //  | pp classBody
                ;
//several decl by one var???
varDeclClass    : declAttrList? VAR IDENTIFIER<Declaration>^ propDecl? typeTag varInit? SEMI!
                ;
                
varDecl         : VAR! varDeclPartList (COMMA! varDeclPartList)* SEMI!
                ;

varDeclPartList : IDENTIFIER propDecl? typeTag? varInit? -> ^(IDENTIFIER<Declaration> propDecl? typeTag? varInit?)
                ;

propDecl        : LPAREN a1=propAccessor COMMA a2=propAccessor RPAREN -> ^(PROPERTY_DECL<HaxeTree>["PROPERTY_DECL"] $a1 $a2)
                ;

propAccessor    : IDENTIFIER  
                | NULL
                | DEFAULT
                | DYNAMIC
                | NEVER
                ;

varInit         : EQ<HaxeTree>^ expr
                ;

funcDecl        : declAttrList? FUNCTION NEW funcDeclPart 
                    -> ^(FUNCTION<Function> NEW declAttrList? funcDeclPart )
                | declAttrList? FUNCTION IDENTIFIER typeParam? funcDeclPart 
                    -> ^(FUNCTION<Function> IDENTIFIER declAttrList? funcDeclPart typeParam?)
                ;
                
funcDeclPart    : LPAREN! paramList? RPAREN! typeTag? (block | SEMI!)
                ;
    
funcProtoDecl
    :   declAttrList FUNCTION NEW LPAREN paramList? RPAREN typeTag? SEMI 
            -> ^(FUNCTION NEW? paramList? typeTag? declAttrList?)
    |   declAttrList FUNCTION IDENTIFIER typeParam? LPAREN paramList? RPAREN typeTag? SEMI 
            -> ^(FUNCTION IDENTIFIER? paramList? typeTag? declAttrList? typeParam?)
    |   FUNCTION NEW LPAREN paramList? RPAREN typeTag? SEMI 
            -> ^(FUNCTION NEW? paramList? typeTag?)
    |   FUNCTION IDENTIFIER typeParam? LPAREN paramList? RPAREN typeTag? SEMI 
            -> ^(FUNCTION IDENTIFIER? paramList? typeTag? typeParam?)
    ;
    
interfaceDecl     
    :   topLevelAccessAttr? INTERFACE type extending? implementList? LBRACE! interfaceBody RBRACE!
    ;
    
interfaceBody
    :   varDecl interfaceBody
    |   funcProtoDecl interfaceBody
//  |   pp interfaceBody
    |
    ;
                
implementList   : implementing (COMMA implementing)* -> ^(IMPLEMENT_LIST<HaxeTree>["ImplementList"] implementing+)
                ;
    
implementing    : IMPLEMENTS! type
                ;
                
extending       : EXTENDS<HaxeTree>^ type
                ;
    
typedefDecl     : TYPEDEF^ IDENTIFIER EQ! funcType
                ;
    
typeExtend      : GT^ funcType
                ;

objLit          : LBRACE! objLitElemList RBRACE!
                ;

anonTypeField   : IDENTIFIER COLON! funcType
                ;
    
objLitElemList  : objLitElem (COMMA! objLitElem)*
                ;
    
objLitElem      : IDENTIFIER COLON! expr
                ;
    
// TODO: REGEXPR
elementarySymbol
    : LONGLITERAL   -> LONGLITERAL<Constant>[$LONGLITERAL, "Int"]
    | NULL          -> NULL<Constant>[$NULL,"Unknown<0>"]
    | INTLITERAL    -> INTLITERAL<Constant>[$INTLITERAL, "Int"]
    | STRINGLITERAL -> STRINGLITERAL<Constant>[$STRINGLITERAL,"String"]
    | CHARLITERAL   -> CHARLITERAL<Constant>[$CHARLITERAL, "String"]
    | FLOATNUM      -> FLOATNUM<Constant>[$FLOATNUM, "Float"]
    //| TRUE          -> TRUE<Constant>[$TRUE,"Bool"]
    //| FALSE         -> FALSE<Constant>[$FALSE,"Bool"]
    ;

WS      : ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;}
        ;
    
/*-------------------------LEXER SECTION-------------------------*/
CHARLITERAL
    :   '\'' 
        (   EscapeSequence 
        |   ~( '\'' | '\\' | '\r' | '\n' )
        ) 
        '\''
    ; 


fragment
EscapeSequence 
    :   '\\' (
                 'b' 
             |   't' 
             |   'n' 
             |   'f' 
             |   'r' 
             |   '\"' 
             |   '\'' 
             |   '\\' 
             |       
                 ('0'..'3') ('0'..'7') ('0'..'7')
             |       
                 ('0'..'7') ('0'..'7') 
             |       
                 ('0'..'7')
             )          
;     

ABSTRACT:   'abstract';
BREAK:      'break';
BYTE:       'byte';
CASE:       'case';
CATCH:      'catch';
CHAR:       'char';
CLASS:      'class';
CONST:      'const';
CONTINUE:   'continue';
DEFAULT:    'default';
DO:         'do';
DOUBLE:     'double';
ELSE:       'else';
ENUM:       'enum';
EXTENDS:    'extends';
EXTERN:     'extern';
FINAL:      'final';
FINALLY:    'finally';
FOR:        'for';
GOTO:       'goto';
IF:         'if';
IMPLEMENTS: 'implements';
IMPORT:     'import';
INSTANCEOF: 'instanceof';
INTERFACE:  'interface';
LONG:       'long';
NATIVE:     'native';
NEW:        'new';
PACKAGE:    'package';
PRIVATE:    'private';
PROTECTED:  'protected';
PUBLIC:     'public';
RETURN:     'return';
SHORT:      'short';
STATIC:     'static';
INLINE:     'inline';
DYNAMIC:    'dynamic';
OVERRIDE:   'override';
STRICTFP:   'strictfp';
SUPER:      'super';
SWITCH:     'switch';
THIS:       'this';
THROW:      'throw';
THROWS:     'throws';
TRANSIENT:  'transient';
TRY:        'try';
TYPEDEF:    'typedef';
UNTYPED:    'untyped';
USING:      'using';
VAR:        'var';
VOLATILE:   'volatile';
WHILE:      'while';
TRUE:       'true';
FALSE:      'false';
NULL:       'null';
NEVER:      'never';
CAST:       'cast';
FUNCTION:   'function';
IN:         'in';
    
LPAREN      :   '(';
RPAREN      :   ')';
LBRACE      :   '{';
RBRACE      :   '}';
LBRACKET    :   '[';
RBRACKET    :   ']';
SEMI        :   ';';
COMMA       :   ',';
ELLIPSIS    :   '...';
DOT         :   '.';
EQ          :   '=';
BANG        :   '!';
TILDE       :   '~';
QUES        :   '?';
COLON       :   ':';
EQEQ        :   '==';
AMPAMP      :   '&&';
BARBAR      :   '||';
PLUSPLUS    :   '++';
SUBSUB      :   '--';
PLUS        :   '+';
SUB         :   '-';
STAR        :   '*';
SLASH       :   '/';
AMP         :   '&';
BAR         :   '|';
CARET       :   '^';
PERCENT     :   '%';
PLUSEQ      :   '+=';
SUBEQ       :   '-=';
STAREQ      :   '*=';
SLASHEQ     :   '/=';
AMPEQ       :   '&=';
BAREQ       :   '|=';
CARETEQ     :   '^=';
PERCENTEQ   :   '%=';
BANGEQQ     :   '!==';
MONKEYS_AT  :   '@';
BANGEQ      :   '!=';
MINUS_BIGGER:   '->';
GT      :   '>';
GTGT    :   '>>';
LTLT    :   '<<';
GTGTGT  :   '>>>';
LTLTEQ  :   '<<=';
GTGTEQ  :   '>>=';
GTGTGTEQ:   '>>>=';
GTEQ    :   '>=';
LTEQ    :   '<=';
LT      :   '<';    
 
LONGLITERAL
    :   IntegerNumber LongSuffix
    ;
    
INTLITERAL
    :   IntegerNumber 
    |   HexPrefix HexDigit+ 
    ;
    
fragment
IntegerNumber
    :   DIGIT+      
    ;

fragment
HexPrefix
    :   '0x' | '0X'
    ;
        
fragment
HexDigit
    :   ('0'..'9'|'a'..'f'|'A'..'F')
    ;

fragment
LongSuffix
    :   'l' | 'L'
    ;
    
IDENTIFIER
    :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|DIGIT|'_')*
    ;

fragment
DIGIT : '0'..'9' ;

            //haxe allow .1 as a float, but for antlr it's hard to
            //properly forsee that, so we restrict to have a num first
FLOATNUM  : IntegerNumber EXPONENT
          | d=IntegerNumber r=ELLIPSIS
              {
              $d.setType(INTLITERAL);
              emit($d);
              $r.setType(ELLIPSIS);
              emit($r);
              }
          | d=IntegerNumber DOT IntegerNumber
          ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

STRINGLITERAL
    :   '"' 
        (   EscapeSequence
        |   ~( '\\' | '"' | '\r' | '\n' )        
        )* 
        '"' 
    ;

/*    
PROCESSORCOMMAND
    :  '#if' ( options {greedy=false;} : . )* '#end' {$channel=HIDDEN;}
    ;
*/
    
//For Prepoccecor
PP_IF    :    '#if'
    ;
PP_ELSEIF
    :    '#elseif'
    ;
PP_ELSE    :    '#else'
    ;
PP_END    :    '#end'
    ;
PP_ERROR:    '#error'
    ;


//------------

fragment
TS:
    (' '  |  '\t'  ) 
    { skip(); } ;

PREPROCESSOR_DIRECTIVE
    :
    | PP_CONDITIONAL
    ;

fragment
PP_CONDITIONAL:
    (IF_TOKEN
    | ELSE_TOKEN
    | ENDIF_TOKEN); //  TS*   (LINE_COMMENT?  |  ('\r' | '\n')+) ;

fragment
IF_TOKEN
    @init { boolean process = true; }:
    ('#'   TS*  'if'   TS+   ppe = PP_EXPRESSION)
{
    // if our parent is processing check this if
    //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing.  IF_TOKEN");
    if (!processing.empty() && processing.peek())
        processing.push(returns.pop());
    else
        processing.push(false);
} ;
fragment
ELSE_TOKEN:
    ( '#'   TS*   e = 'else'
    | '#'   TS*   'elseif'   TS+   PP_EXPRESSION)
    {
        // We are in elseif
           if ($e == null)
    {
        //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing.  ELIF_TOKEN");
        if (!processing.empty() && !processing.peek())
        {
            processing.pop();
            // if our parent was processing, do else logic
            //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing.  ELIF_TOKEN2");
            if (!processing.empty() && processing.peek())
                processing.push(returns.pop());
            else
                processing.push(false);
        }
        else
        {
            processing.pop();
            processing.push(false);
        }
    }
    else
    {
        // we are in a else
        if (!processing.empty())
        {
            boolean bDoElse = !processing.pop();

            // if our parent was processing                
            //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing, ELSE_TOKEN");
            if (!processing.empty() && processing.peek())
                processing.push(bDoElse);
            else
                processing.push(false);
        }
    }
    skip();
    } ;
fragment
ENDIF_TOKEN:
    '#'   'end'
    {
        if (!processing.empty())
            processing.pop();
        skip();
    } ;
    
    
    
    
fragment
PP_EXPRESSION:
    PP_OR_EXPRESSION;

fragment
PP_OR_EXPRESSION:
    PP_AND_EXPRESSION   TS*   ('||'   TS*   PP_AND_EXPRESSION   TS* )* ;

fragment
PP_AND_EXPRESSION:
    PP_UNARY_EXPRESSION   TS*   ('&&'   TS*   PP_UNARY_EXPRESSION   TS* )* ;

fragment
PP_UNARY_EXPRESSION:
    pe = PP_PRIMARY_EXPRESSION
    | '!'   TS*   ue = PP_UNARY_EXPRESSION  { returns.push(!returns.pop()); } 
    ;

fragment
PP_PRIMARY_EXPRESSION:
    IDENTIFIER    
    { 
        //returns.push(MacroDefines.ContainsKey($IDENTIFIER.Text));
        returns.push(false); // TODO
    }
    | '('   PP_EXPRESSION   ')'
    ;


//-------------


fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
;