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
    PREFIX_EXPR;
    BLOCK_SCOPE;
    PARAM_LIST;
    TYPE_TAG;
    TYPE_PARAM_OPT;
    INHERIT_LIST_OPT;
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
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.DoWhileNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.SwitchNode;
import haxe.imp.parser.antlr.tree.specific.TryNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe.imp.parser.antlr.tree.specific.Constant;
import haxe.imp.parser.antlr.tree.specific.WhileNode;
}

module
    : myPackage? topLevelList -> ^(MODULE<HaxeTree>["MODULE",true] myPackage? topLevelList?)
    ;
    
topLevelList
    : (topLevel)*
    ;

topLevel
    : myImport
//    |   pp
    | topLevelDecl
    ;

myPackage
    : PACKAGE dotIdent SEMI -> ^(PACKAGE dotIdent?)
    ;

meta    : MONKEYS_AT metaName (LPAREN paramList RPAREN)?
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
    
qualifiedIdentifier
    : (a=IDENTIFIER  ->  $a) (DOT ident=IDENTIFIER  ->  ^(DOT $qualifiedIdentifier $ident) )*
    ;
    
myImport
    : IMPORT^ dotIdent SEMI!
    | USING^ dotIdent SEMI!
    ;
// -------- Basics

access
    : PUBLIC
    | PRIVATE
    ;

declAttr
    : STATIC
    | INLINE
    | DYNAMIC
    | OVERRIDE
    | access
    ;

declAttrList
    : (declAttr)+ -> ^(DECL_ATTR_LIST<HaxeTree>["DECL_ATTR_LIST", true] declAttr+)
    ;

paramList
    : param (COMMA param)* -> ^(PARAM_LIST<HaxeTree>["PARAM_LIST", true] param+)
    |
    ;

param
    : QUES? IDENTIFIER typeTagOpt varInit -> ^(VAR<VarDeclaration>[$IDENTIFIER, true] IDENTIFIER<VarUsage>? typeTagOpt? varInit? QUES?)
    ;
    
id  :    IDENTIFIER //-> ^(IDENTIFIER<VarUsage>)
    |    THIS //-> ^(THIS<VarUsage>)
    ;

dotIdent
    :    id DOT a=dotIdent ->  ^(DOT<VarUsage>[true] id $a)
    |    id -> ^(DOT<VarUsage>[true] id)
    ;

assignOp
    :    EQ        -> EQ<AssignOperationNode>[$EQ]
    |    PLUSEQ     -> PLUSEQ<AssignOperationNode>[$PLUSEQ]
    |    SUBEQ    -> SUBEQ<AssignOperationNode>[$SUBEQ]
    |    SLASHEQ    -> SLASHEQ<AssignOperationNode>[$SLASHEQ]
    |    PERCENTEQ    -> PERCENTEQ<AssignOperationNode>[$PERCENTEQ]
    |    AMPEQ    -> AMPEQ<AssignOperationNode>[$AMPEQ]
    ;

    
funcLit : FUNCTION LPAREN paramList RPAREN typeTagOpt? block -> ^(FUNCTION<FunctionNode> paramList? typeTagOpt? block?)
        ;
arrayLit    : LBRACKET! exprListOpt RBRACKET!
            ;
/*
! -------- Preprocessor
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
    
//! -------- Types

typeTag : COLON! funcType
        ;
    
typeTagOpt
    :    typeTag -> ^(TYPE_TAG<HaxeTree>["TYPE_TAG",true] typeTag?)
    |
    ;
    
typeList
    :    type (COMMA! type)*    
    |    typeConstraint (COMMA! typeConstraint )* 
    ;

funcType
    :    (type) (MINUS_BIGGER! type)*
    |    VOID
    ;
    
primitiveType
    :    INT | FLOAT | DYNAMIC | BOOLEAN | VOID
    ;

type    :    (anonType^ | dotIdent^ | primitiveType^ ) (typeParam)*
        |    				//????
        ;
    
typeParam
    :    LT! typeList GT!
    |    LT! typeList LT! typeList GTGT!
    |    LT! typeList LT! typeList LT! typeList GTGTGT!
//    :    LT! typeList GT!
    ;
    
typeParamOpt      
    :    typeParam -> ^(TYPE_PARAM_OPT<HaxeTree>["TYPE_PARAM_OPT",true] typeParam?)
    |    
    ;
       
typeConstraint
    :   IDENTIFIER COLON LPAREN typeList RPAREN -> ^($typeConstraint IDENTIFIER? typeList?)
    ;
    

functionReturn
    :    declAttrList? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^(FUNCTION<FunctionNode> NEW declAttrList? paramList? typeTagOpt? block? )
    ;    

statement 
    :    block
    |    assignExpr SEMI!
    |    varDecl
    |    IF parExpression st1=statement (ELSE st2=statement)?     -> ^(IF<IfNode> parExpression $st1 ^(ELSE $st2)?)          
    |    FOR LPAREN exp1=expr IN exp2=expr RPAREN statement     -> ^(FOR<ForNode> ^(IN $exp1 $exp2) statement?)
    |    WHILE parExpression statement                 -> ^(WHILE<WhileNode> parExpression? statement?)
    |    DO statement WHILE parExpression SEMI             -> ^(DO<DoWhileNode> parExpression? statement?)
    |    TRY block catchStmtList                 -> ^(TRY<TryNode> block? catchStmtList?)
    |    SWITCH LPAREN expr RPAREN LBRACE caseStmt+ RBRACE     -> ^(SWITCH<SwitchNode> expr? caseStmt+)
    |    RETURN (expr)? SEMI                    -> ^(RETURN expr?)
    |    THROW expr SEMI                     -> ^(THROW expr?)
    |    BREAK (IDENTIFIER)? SEMI                -> ^(BREAK IDENTIFIER?)
    |    CONTINUE (IDENTIFIER)? SEMI                 -> ^(CONTINUE IDENTIFIER?)
    |    expr  SEMI!
    |    IDENTIFIER COLON statement                 -> ^(COLON IDENTIFIER? statement?)
    |    SEMI!
    ;
   
parExpression 
    :   LPAREN! expr RPAREN!
    ;

block   :    LBRACE (blockStmt)* RBRACE -> ^(BLOCK_SCOPE<BlockScopeNode>["BLOCK_SCOPE", true, $LBRACE] blockStmt* RBRACE<HaxeTree>[$RBRACE, true]) 
        |    SEMI!
        ;
    
blockStmt
    :    varDecl
    |    classDecl
    |    statement
    ;
    
breakStmt
    :    BREAK SEMI!
    ;
    
continueStmt
    :    CONTINUE SEMI!
    ;
    
caseStmt
    :    CASE exprList COLON statement  -> ^(CASE exprList? statement?)
    |    DEFAULT COLON statement        -> ^(DEFAULT statement?)
    ;
    
defaultStmt
    :    DEFAULT COLON!
    ;
    
catchStmtList
    : catchStmt catchStmtList
    |
    ;
    
catchStmt
    :    CATCH LPAREN param RPAREN block -> ^(CATCH param? block?)
    ;
    
//! -------- Expressions

exprListOpt
    :    exprList
    |
    ;
    
exprList
    :    expr (COMMA! expr)*
    ;
    
expr
    :    assignExpr
    |    UNTYPED assignExpr    -> ^(UNTYPED assignExpr)
    ;

assignExpr
    :     iterExpr (assignOp^ iterExpr)? 
    ;

iterExpr
    :    ternaryExpr (ELLIPSIS^ ternaryExpr)?
    ;

ternaryExpr
    :    logicOrExpr (QUES^ expr COLON! logicOrExpr)? //????
    ;

logicOrExpr
    :    logicAndExpr (BARBAR^ logicAndExpr)*
    ;
    
logicAndExpr
    :    (cmpExpr) (AMPAMP^ cmpExpr)*
    ;
    
cmpExpr :    (bitExpr) ((EQEQ^| BANGEQ^ | GTEQ^ | LTEQ^ | GT^ | LT^)  bitExpr)*
    ;
    
bitExpr :    (shiftExpr) (BAR^ shiftExpr | AMP^ shiftExpr |CARET^ shiftExpr)*  //???????
        ;

shiftExpr
    :    (addExpr) (LTLT^  addExpr | (GT GT)^  addExpr | GTGTGT^ addExpr)*
    ;

addExpr :     (multExpr) ((PLUS^ | SUB^) multExpr )*
        ;
    
multExpr:    (psExpr) ((STAR^|SLASH^|PERCENT^) psExpr)*
        ;
        
psExpr
    	:	prefixExpr
    	|	suffixExpr
    	| 	value
    	;
    
prefixExpr
	:    (SUB|SUBSUB|PLUS|PLUSPLUS|BANG|TILDE)^ value
	|	newExpr
    	|	cast    	
    	|	funcLit 
	;
    
suffixExpr
    :    value methodCallOrSliceList -> ^(SUFFIX_EXPR<HaxeTree>["CallOrSlice",true] value? methodCallOrSliceList?)
    |    value PLUSPLUS             -> ^(SUFFIX_EXPR<HaxeTree>["SUFFIX_EXPR",true] value? PLUSPLUS?)
    |    value SUBSUB             -> ^(SUFFIX_EXPR<HaxeTree>["SUFFIX_EXPR",true] value? SUBSUB)
    ;

methodCallOrSlice
    :    LPAREN exprListOpt RPAREN -> ^(SUFFIX_EXPR<HaxeTree>["MethodCall",true] exprListOpt?)
    |    LBRACKET expr RBRACKET -> ^(SUFFIX_EXPR<HaxeTree>["Slice",true] expr?)
    ;

methodCallOrSliceList
    :    methodCallOrSlice methodCallOrSliceList
    |    methodCallOrSlice
    ;

value
    //:   funcLit 
    //|   arrayLit //Slice???
    :   objLit
    |   elementarySymbol
    |   LPAREN! (expr|statement) RPAREN!
    |   dotIdent typeParamOpt
    ;

newExpr           
    :   NEW type LPAREN exprListOpt RPAREN -> ^(NEW type? exprListOpt?)
    ;

cast    :   CAST LPAREN expr (COMMA funcType)? RPAREN   -> ^(CAST expr? funcType?)
        |   CAST LPAREN expr RPAREN                     -> ^(CAST expr?)
    //  |   CAST expr                                   -> ^(CAST expr?)
        ;

//! -------- Declarations

topLevelDecl      
    :   classDecl
    |   interfaceDecl
    |   enumDecl
    |   typedefDecl
    ;
    
enumDecl:   typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody -> ^(IDENTIFIER<EnumNode> typeParamOpt? enumBody?)
        ;

enumBody:   LBRACE (enumValueDecl)* RBRACE
            -> ^(BLOCK_SCOPE<BlockScopeNode>["BLOCK_SCOPE", true, $LBRACE] enumValueDecl* RBRACE<HaxeTree>[$RBRACE, true])
        ;

enumValueDecl     
    :   IDENTIFIER LPAREN paramList RPAREN SEMI -> ^(IDENTIFIER<VarDeclaration>[$IDENTIFIER] IDENTIFIER<VarUsage>? paramList? )    
    |   IDENTIFIER SEMI                         -> ^(IDENTIFIER<VarDeclaration>[$IDENTIFIER] IDENTIFIER<VarUsage>?)
//  |   pp
    ;

varDeclList
    :   varDecl varDeclList
    ;

varDecl :   (declAttrList)? VAR varDeclPartList SEMI -> ^(VAR<VarDeclaration>[$VAR] declAttrList? varDeclPartList?)
        ;
    
varDeclPartList   
    :   varDeclPart (COMMA! varDeclPart)*
    ;

varDeclPart
    :   IDENTIFIER<VarUsage> propDeclOpt typeTagOpt varInit
    ;

propDecl:   LPAREN a1=propAccessor COMMA a2=propAccessor RPAREN -> ^(PROPERTY_DECL<HaxeTree>["PROPERTY_DECL",true] $a1? $a2?)
        ;

propAccessor    
        :   IDENTIFIER  
        |   NULL
        |   DEFAULT
        |   DYNAMIC
        ;
    
propDeclOpt
    :   propDecl    
    |
    ;

varInit :   EQ expr -> ^(VAR_INIT<HaxeTree>["VAR_INIT",true] expr?)
        |   
        ;
    
funcDecl:   declAttrList? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block 
                -> ^(FUNCTION<FunctionNode> NEW declAttrList? paramList? typeTagOpt? block? )
        |   declAttrList? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block 
                -> ^(FUNCTION<FunctionNode> IDENTIFIER declAttrList? paramList? typeTagOpt? block? typeParamOpt?)
        ;
    
funcProtoDecl
    :   declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI 
            -> ^(FUNCTION NEW? paramList? typeTagOpt? declAttrList?)
    |   declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI 
            -> ^(FUNCTION IDENTIFIER? paramList? typeTagOpt? declAttrList? typeParamOpt?)
    |   FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI 
            -> ^(FUNCTION NEW? paramList? typeTagOpt?)
    |   FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI 
            -> ^(FUNCTION IDENTIFIER? paramList? typeTagOpt? typeParamOpt?)
    ;
    
classDecl
    :   typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            -> ^(IDENTIFIER<ClassNode> typeDeclFlags? typeParamOpt? inheritListOpt? classBodyScope?)
    ;
    
classBodyScope
    :   LBRACE (classMember)* RBRACE -> ^(BLOCK_SCOPE<BlockScopeNode>["BLOCK_SCOPE", true, $LBRACE] classMember* RBRACE<HaxeTree>[$RBRACE, true])
    ;

classMember
    :   varDecl 
    |   funcDecl 
//  |   pp classBody
    |   enumDecl 
    ;
    
interfaceDecl     
    :   typeDeclFlags INTERFACE type inheritListOpt LBRACE! interfaceBody RBRACE!
    ;
    
interfaceBody
    :   varDecl interfaceBody
    |   funcProtoDecl interfaceBody
//  |   pp interfaceBody
    |
    ;

inheritList       
    :    inherit (COMMA! inherit)*
    ;
    
inheritListOpt    
    :    inheritList -> ^(INHERIT_LIST_OPT<HaxeTree>["INHERIT_LIST_OPT",true] inheritList?)
    |    
    ;
    
inherit    :    EXTENDS type     -> ^(EXTENDS type?)
        |    IMPLEMENTS type -> ^(IMPLEMENTS type?)
    ;
    
typedefDecl       
    :    TYPEDEF IDENTIFIER EQ funcType
    ;
    
typeExtend
    :    GT funcType COMMA!
    ;
    
anonType
    :   LBRACE!
            ( 
            |   anonTypeFieldList 
            |   varDeclList 
            |   typeExtend (
                        |   anonTypeFieldList
                        |   varDeclList) 
            ) 
        RBRACE!
    ;
    
anonTypeFieldList 
    :    anonTypeField (COMMA! anonTypeField)*
    ;

objLit  : '{'! objLitElemList '}'!
        ;

anonTypeField
    :    IDENTIFIER COLON! funcType
    ;
    
objLitElemList    
    :    objLitElem (COMMA! objLitElem)*
    ;
    
objLitElem
    :    IDENTIFIER COLON! expr
    ;
    
elementarySymbol
    :   LONGLITERAL    -> LONGLITERAL<Constant>[$LONGLITERAL, "INT"]
    |   NULL -> ^(NULL<Constant>[$NULL,"Unknown<0>"])
    |   INTLITERAL    -> INTLITERAL<Constant>[$INTLITERAL, "INT"]
    |   STRINGLITERAL    -> STRINGLITERAL<Constant>[$STRINGLITERAL,"STRING"]
    |   CHARLITERAL    -> CHARLITERAL<Constant>[$CHARLITERAL, "STRING"]
    |   FLOATNUM    -> FLOATNUM<Constant>[$FLOATNUM, "FLOAT"]
    |   TRUE        -> TRUE<Constant>[$TRUE,"BOOL"]
    |   FALSE        -> FALSE<Constant>[$FALSE,"BOOL"]
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
/*--------------------------------
LEXER SECTION (????? ? ?????)
--------------------------------*/
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
    
fragment 
Exponent    
    :   ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ 
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
PERCENTDLQ  :   '%%<<%%=';
PERCENTDBQ  :   '%%>>%%=';
PERCENTDBBQ :   '%%>>>%%=';
EQEQEQ      :   '===';
PERCENTLESQ :   '%%<=%%';
BANGEQQ     :   '!==';
MONKEYS_AT  :   '@';
BANGEQ      :   '!=';
MINUS_BIGGER:   '->';
PERCENTLL   :   '%%<<%%';
PERCENTBB   :   '%%>>%%';
PERCENTBBB  :   '%%>>>%%';
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
    :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
    
INTNUM    :    '0'..'9'+
    ;

FLOATNUM
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
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