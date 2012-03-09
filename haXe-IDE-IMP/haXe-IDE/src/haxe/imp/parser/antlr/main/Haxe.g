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
    INHERIT_LIST;
    DECL_ATTR_LIST;
    VAR_INIT;
    IDENT;
    ASSIGN_OPERATOR;
    PACKAGE;
}

@lexer::header{
package haxe.imp.parser.antlr.main;

import java.util.HashMap;
//import java.util.Stack; // imported by ANTLR
}

@lexer::members {
    // Preprocessor Data Structures - see lexer section below and PreProcessor.cs
    protected HashMap<String,String> macroDefines = new HashMap<String,String>();    
    protected Stack<Boolean> processing = new Stack<Boolean>();

    // Uggh, lexer rules don't return values, so use a stack to return values.
    protected Stack<Boolean> returns = new Stack<Boolean>();
}


@header{
package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.UnarExpressionNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.DoWhileNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.SwitchNode;
import haxe.imp.parser.antlr.tree.specific.TryNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ArrayNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;
}

module          : myPackage? imports* topLevelDecl* -> ^(MODULE<HaxeTree>["MODULE"] myPackage? imports* topLevelDecl*)
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
    | primitiveType
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

declAttrList    : declAttr+ -> ^(DECL_ATTR_LIST<HaxeTree>["DECL_ATTR_LIST"] declAttr+)
                ;

paramList       : param (COMMA param)* -> ^(PARAM_LIST<HaxeTree>["PARAM_LIST"] param+)
                ;

param           : QUES? IDENTIFIER typeTag? varInit? -> ^(VAR<VarDeclarationNode>[$IDENTIFIER] typeTag? varInit? QUES?)
                ;

identifier      : IDENTIFIER<VarUsageNode>
                ;
                
id              : identifier
                | THIS<VarUsageNode>
                ;

assignOp        : EQ       -> EQ<AssignOperationNode>
                | PLUSEQ   -> PLUSEQ<AssignOperationNode>
                | SUBEQ    -> SUBEQ<AssignOperationNode>
                | STAREQ   -> STAREQ<AssignOperationNode>
                | SLASHEQ  -> SLASHEQ<AssignOperationNode>
                | PERCENTEQ -> PERCENTEQ<AssignOperationNode>
                | AMPEQ    -> AMPEQ<AssignOperationNode>
                | BAREQ    -> BAREQ<AssignOperationNode>
                | CARETEQ  -> CARETEQ<AssignOperationNode>
                | LTLTEQ   -> LTLTEQ<AssignOperationNode>
                | GTGTEQ   -> GTGTEQ<AssignOperationNode>
                | GTGTGTEQ -> GTGTGTEQ<AssignOperationNode>
                ;
                
funcLit         : FUNCTION<FunctionNode>^ LPAREN! paramList? RPAREN! typeTag? block
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

typeTag         : COLON funcType -> ^(TYPE_TAG<HaxeTree>["TYPE_TAG"] funcType)
                ;

typeList        : funcType (COMMA! typeList)?
                | typeConstraint (COMMA! typeList)? 
                ;

funcType        : type (MINUS_BIGGER! type)*
                ;
    
anonType        : LBRACE anonTypePart? RBRACE -> ^(TYPE_TAG<HaxeTree>["AnonType"] anonTypePart?)
                ;

anonTypePart    : anonTypeFieldList
                | varDecl+
                | typeExtend COMMA! ( anonTypeFieldList | varDecl+)? 
                ;
    
anonTypeFieldList 
                : anonTypeField (COMMA anonTypeField)* -> anonTypeField+
                ;
    
primitiveType   : INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING
                ;

type            : (primitiveType^ | filepath^ | anonType^ ) typeParam?
                ;
    
typeParam       : LT typeList typeParam? GT -> ^(TYPE_PARAM<HaxeTree>["TYPE_PARAM"] typeList typeParam?)
                ;
       
typeConstraint
    : identifier COLON LPAREN typeList RPAREN -> ^(TYPE_CONSTRAIN<HaxeTree>["TYPE_CONSTRAIN"] identifier typeList?)
    ;
    
/*-------------------------Statements--------------------------*/
statement       : block
                | IF<IfNode>^ parExpression statement (ELSE! statement)?
                | FOR<ForNode>^ LPAREN! expr IN! iterExpr RPAREN! statement
                | WHILE<WhileNode>^ parExpression statement
                | DO<DoWhileNode>^ statement WHILE! parExpression SEMI!
                | TRY<TryNode>^ block catchStmt+
                | SWITCH<SwitchNode>^ LPAREN! expr RPAREN! LBRACE! caseStmt+ RBRACE!
                | RETURN<ReturnNode>^ expr? SEMI!
                | THROW^ expr SEMI!
                | (BREAK | CONTINUE) SEMI!
                | expr SEMI!
    | IDENTIFIER COLON statement                 -> ^(COLON IDENTIFIER? statement?)
    ;
   
parExpression   : LPAREN! expr RPAREN!
                ;

block           : LBRACE (blockStmt)* RBRACE -> ^(BLOCK_SCOPE<BlockScopeNode>[$LBRACE, $RBRACE] blockStmt*)
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

logicOrExpr     : logicAndExpr (BARBAR<BinaryExpressionNode>^ logicAndExpr)*
                ;
    
logicAndExpr    : iterExpr(AMPAMP<BinaryExpressionNode>^ iterExpr)*
                ;
                
iterExpr        : cmpExpr (ELLIPSIS<BinaryExpressionNode>^ cmpExpr)?
                ;
    
cmpExpr         : bitExpr ((
                      EQEQ<BinaryExpressionNode>^ 
                    | BANGEQ<BinaryExpressionNode>^ 
                    | GTEQ<BinaryExpressionNode>^ 
                    | LTEQ<BinaryExpressionNode>^ 
                    | GT<BinaryExpressionNode>^ 
                    | LT<BinaryExpressionNode>^) bitExpr)*
                ;
    
bitExpr         : shiftExpr ((
                      BAR<BinaryExpressionNode>^ 
                    | AMP<BinaryExpressionNode>^ 
                    | CARET<BinaryExpressionNode>^) shiftExpr)*
                ;

shiftExpr       : addExpr ((
                      LTLT<BinaryExpressionNode>^ 
                    | GTGT<BinaryExpressionNode>^ 
                    | GTGTGT<BinaryExpressionNode>^) addExpr)*
                ;

addExpr         : multExpr ((
                      PLUS<BinaryExpressionNode>^ 
                    | SUB<BinaryExpressionNode>^) multExpr )*
                ;
    
multExpr        : unarExpr ((
                      STAR<BinaryExpressionNode>^ 
                    | SLASH<BinaryExpressionNode>^ 
                    | PERCENT<BinaryExpressionNode>^) unarExpr)*
                ;

unarExpr        : (
            SUB<UnarExpressionNode>^|
            SUBSUB<UnarExpressionNode>^|
            PLUSPLUS<UnarExpressionNode>^|
            BANG<UnarExpressionNode>^|
            TILDE<UnarExpressionNode>^) prefixExpr
                | prefixExpr (PLUSPLUS<UnarExpressionNode>^|SUBSUB<UnarExpressionNode>^)?
                ;  
    
prefixExpr      : NEW^ type LPAREN! exprList? RPAREN!
                | CAST^ LPAREN! expr (COMMA! funcType)? RPAREN!
                | methodCallOrSlice
                ;
                
methodCallOrSlice 
                : value LPAREN exprList? RPAREN pureCallOrSlice?
            -> ^(CALL_OR_SLICE<MethodCallNode>[$LPAREN, $RPAREN] value exprList? pureCallOrSlice?)
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
    //|   LPAREN! expr RPAREN!
    // TODO: if id is in callAlSlice and else we can't use THIS
    |   id typeParam? 
    ;
/*-------------------- Declarations----------------------------*/

topLevelDecl    : classDecl
                | interfaceDecl
                | enumDecl
                | typedefDecl
                ;
    
enumDecl        : topLevelAccess? ENUM IDENTIFIER typeParam? enumBody -> ^(IDENTIFIER<EnumNode> topLevelAccess? typeParam? enumBody)
                ;

enumBody        : LBRACE (enumValueDecl)* RBRACE -> ^(BLOCK_SCOPE<BlockScopeNode>[$LBRACE, $RBRACE] enumValueDecl*)
                ;

enumValueDecl   : IDENTIFIER<VarDeclarationNode>^ LPAREN! paramList? RPAREN! SEMI!  
                | IDENTIFIER<VarDeclarationNode> SEMI!
            //  |   pp
                ;
    
classDecl       : topLevelAccess? CLASS IDENTIFIER typeParam? inheritList? classBodyScope 
                    -> ^(IDENTIFIER<ClassNode> topLevelAccess? typeParam? inheritList? classBodyScope)
                ;

classBodyScope  : LBRACE (classMember)* RBRACE -> ^(BLOCK_SCOPE<BlockScopeNode>[$LBRACE, $RBRACE] classMember*)
                ;
    
classMember     : varDeclClass
                | funcDecl 
            //  | pp classBody
                ;
//several decl by one var???
varDeclClass    : declAttrList? VAR IDENTIFIER propDecl? typeTag varInit? SEMI -> ^(IDENTIFIER<VarDeclarationNode> declAttrList? propDecl? typeTag varInit?)
                ;
                
varDecl         : VAR! varDeclPartList (COMMA! varDeclPartList)* SEMI!
                ;

varDeclPartList : IDENTIFIER propDecl? typeTag? varInit? -> ^(IDENTIFIER<VarDeclarationNode> propDecl? typeTag? varInit?)
                ;

propDecl        : LPAREN a1=propAccessor COMMA a2=propAccessor RPAREN -> ^(PROPERTY_DECL<HaxeTree>["PROPERTY_DECL"] $a1 $a2)
                ;

propAccessor    : IDENTIFIER  
                | NULL
                | DEFAULT
                | DYNAMIC
                | NEVER
                ;

varInit         : EQ expr -> ^(VAR_INIT<HaxeTree>["VAR_INIT"] expr)
                ;

funcDecl        : declAttrList? FUNCTION NEW funcDeclPart 
                    -> ^(FUNCTION<FunctionNode> NEW declAttrList? funcDeclPart )
                | declAttrList? FUNCTION IDENTIFIER typeParam? funcDeclPart 
                    -> ^(FUNCTION<FunctionNode> IDENTIFIER declAttrList? funcDeclPart typeParam?)
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
    :   topLevelAccess? INTERFACE type inheritList? LBRACE! interfaceBody RBRACE!
    ;
    
interfaceBody
    :   varDecl interfaceBody
    |   funcProtoDecl interfaceBody
//  |   pp interfaceBody
    |
    ;

inheritList     : inherit (COMMA inherit)* -> ^(INHERIT_LIST<HaxeTree>["INHERIT_LIST"] inherit+)
                ;
    
inherit         : EXTENDS^ type
                | IMPLEMENTS^ type
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
    : LONGLITERAL   -> LONGLITERAL<ConstantNode>[$LONGLITERAL, "INT"]
    | NULL          -> NULL<ConstantNode>[$NULL,"Unknown<0>"]
    | INTLITERAL    -> INTLITERAL<ConstantNode>[$INTLITERAL, "INT"]
    | STRINGLITERAL -> STRINGLITERAL<ConstantNode>[$STRINGLITERAL,"STRING"]
    | CHARLITERAL   -> CHARLITERAL<ConstantNode>[$CHARLITERAL, "STRING"]
    | FLOATNUM      -> FLOATNUM<ConstantNode>[$FLOATNUM, "FLOAT"]
    | TRUE          -> TRUE<ConstantNode>[$TRUE,"BOOL"]
    | FALSE         -> FALSE<ConstantNode>[$FALSE,"BOOL"]
    ;

WS      : ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;}
        ;
    
/*-------------------------LEXER SECTION-------------------------*/
LONGLITERAL
    :   IntegerNumber LongSuffix
    ;
    
INTLITERAL
    :   IntegerNumber 
    ;
    
fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' ('0'..'9')*    
    |   '0' ('0'..'7')+         
    |   HexPrefix HexDigit+        
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
BOOLEAN:    'Bool';
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
FLOAT:      'Float';
FOR:        'for';
GOTO:       'goto';
IF:         'if';
IMPLEMENTS: 'implements';
IMPORT:     'import';
INSTANCEOF: 'instanceof';
INT:        'Int';
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
STRING:     'String';
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
VOID:       'Void';
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
DOT         :   '.';
ELLIPSIS    :   '...';
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

IDENTIFIER
    :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|DIGIT|'_')*
    ;
    
INTNUM      : DIGIT+
            ;

fragment
DIGIT : '0'..'9' ;

            //haxe allow .1 as a float, but for antlr it's hard to
            //properly forsee that, so we restrict to have a num first
FLOATNUM    : DIGIT+ (EXPONENT | DOT DIGIT DIGIT*)
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