grammar TinyHaxeTry1;

options {
    backtrack=true;
    memoize=true;
    output=AST;
}

tokens {
    UNARY_MINUS;
    UNARY_PLUS;
	PREFIX_EXPR;
	PROPERTY_DECL;
	MODULE;
	SUFFIX_EXPR;
	STAtEMENT;
	BLOCK_SCOPE;
	PARAM_LIST;
	TYPE_TAG;
	TYPE_PARAM_OPT;
	INHERIT_LIST_OPT;
	VAR_DECLARATION;
	DECL_ATTR_LIST;
	VAR_INIT;
} 

@members{
       class FunctionNode extends CommonTree {
        public FunctionNode() {
            super();
        }

        /**
         * @param node
         */
        public FunctionNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public FunctionNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }

    }

    class ForNode extends CommonTree {

        /**
         * 
         */
        public ForNode() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @param node
         */
        public ForNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public ForNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }

    }

    class WhileNode extends CommonTree {

        /**
         * 
         */
        public WhileNode() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @param node
         */
        public WhileNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public WhileNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }

    }

    class ClassNode extends CommonTree {

        /**
         * 
         */
        public ClassNode() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @param node
         */
        public ClassNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public ClassNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }

    }

    class IfNode extends CommonTree {

        /**
         * 
         */
        public IfNode() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @param node
         */
        public IfNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public IfNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }

    }

    class DoWhileNode extends CommonTree {

        /**
         * 
         */
        public DoWhileNode() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @param node
         */
        public DoWhileNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public DoWhileNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }
    }

    class TryNode extends CommonTree {

        /**
         * 
         */
        public TryNode() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @param node
         */
        public TryNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public TryNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }
    }

    class SwitchNode extends CommonTree {

        /**
         * 
         */
        public SwitchNode() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @param node
         */
        public SwitchNode(CommonTree node) {
            super(node);
            // TODO Auto-generated constructor stub
        }

        /**
         * @param t
         */
        public SwitchNode(Token t) {
            super(t);
            // TODO Auto-generated constructor stub
        }
    }
}

module            : myPackage topLevelList ->^(MODULE myPackage topLevelList)
                    |   topLevelList ->^(MODULE topLevelList)
	;
topLevelList      :  (topLevel)*
;
topLevel          : myImport
                    |   pp
                    |   topLevelDecl
	;
myPackage           : PACKAGE dotIdent SEMI -> ^(PACKAGE dotIdent)
	;
	
qualifiedIdentifier
    :   (  a= IDENTIFIER  ->  $a)   (   DOT ident=IDENTIFIER  ->  ^(DOT $qualifiedIdentifier $ident) )*
    ;
	
myImport            : IMPORT^ dotIdent SEMI!
	;
// -------- Basics
                    
access            : PUBLIC
                    |   PRIVATE
	;
declAttr          : STATIC
                    |  INLINE
                    |   DYNAMIC
                    |   OVERRIDE
                    |   access
	;
declAttrList      : (declAttr)+ -> ^(DECL_ATTR_LIST declAttr+)
         ;

paramList         : param (COMMA param)* -> ^(PARAM_LIST param+)
	|	->^(PARAM_LIST)
	;
param             :QUES? IDENTIFIER typeTagOpt varInitOpt -> ^(IDENTIFIER typeTagOpt varInitOpt QUES?)
	;
dotIdent          : (IDENTIFIER -> IDENTIFIER) (DOT ident=IDENTIFIER ->^(DOT $dotIdent $ident))*
	;
assignOp          : '='
                    |   '+='
                    |   '-='
                    |   '*='
                    |   '/='
                    |   '%='
                    |   '&='
                    |   '|='
                    |   '^='
                    |   '<<='
                    |   '>>='
                    |   '>>>='
	;
funcLit           : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^(FUNCTION paramList typeTagOpt block)
	;
arrayLit         : LBRACKET! exprListOpt RBRACKET!
	;
	/*
! -------- Preprocessor
! Not actually implemented as a preprocessor though.
! See "Limitations, 5." for more detailed information.
*/
pp                : ppIf
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
	
//! -------- Types

typeTag           : COLON! funcType
	;
typeTagOpt        : typeTag -> ^(TYPE_TAG typeTag)
                    | -> ^(TYPE_TAG)
	;
typeList          : funcType (COMMA! funcType)*
                    |   typeConstraint (COMMA! typeConstraint )* 
                 ;


/*
typeList          : funcType (',' typeList)
                    |   typeConstraint ',' typeList
                    |   funcType
                    |   typeConstraint
	;
	*/
funcType          : (type) (MINUS_BIGGER! type)*
	;
type              : (anonType | dotIdent) (typeParam)*
	;
typeParam         : GT! typeList LT!
	;
typeParamOpt      : typeParam->^(TYPE_PARAM_OPT typeParam)
	|	->^(TYPE_PARAM_OPT)
       ;
typeConstraint    : IDENTIFIER COLON LPAREN typeList RPAREN -> ^($typeConstraint IDENTIFIER typeList)
	;
	
statement 
    :   block
    |   IF parExpression st1=statement (ELSE st2=statement)? -> ^(IF parExpression $st1 ^(ELSE $st2)?)          
    |   forStmt
    |   WHILE parExpression statement -> ^(WHILE parExpression statement)
    |   DO statement WHILE parExpression SEMI -> ^(DO statement WHILE parExpression)
    |   tryStmt
  //  |   'switch' parExpression '{' switchBlockStatementGroups '}'
   | switchStmt
    |   RETURN (expr)? SEMI -> ^(RETURN expr?)
    |   THROW expr SEMI -> ^(THROW expr)
    |   BREAK (IDENTIFIER)? SEMI -> ^(BREAK IDENTIFIER?)
    |   CONTINUE (IDENTIFIER)? SEMI -> ^(CONTINUE IDENTIFIER?)
    |   expr  SEMI! 
    |   IDENTIFIER COLON statement -> ^(COLON IDENTIFIER statement)
    |   SEMI!
    ;
    
parExpression 
    :   RPAREN! expr LPAREN!
    ;

block         : LBRACE (blockStmt)* RBRACE ->^(BLOCK_SCOPE blockStmt*) 
	|	SEMI ->^(BLOCK_SCOPE)
	;
	
blockStmt
	:	varDecl
	|	classDecl
	|	statement
	;
	           
forStmt           : FOR LPAREN exp1=expr IN exp2=expr RPAREN statement -> ^(FOR ^(IN $exp1 $exp2) statement)
	;
	
breakStmt         : BREAK SEMI!
	;
continueStmt      : CONTINUE SEMI!
	;
caseStmt          : CASE exprList COLON!
	;
defaultStmt       : DEFAULT COLON!
	;
switchStmt        : SWITCH LPAREN expr RPAREN block -> ^(SWITCH expr block)
	;
tryStmt           : TRY block catchStmtList -> ^(TRY block catchStmtList)
	;
catchStmtList     : catchStmt catchStmtList
                    |
	;
catchStmt         : CATCH LPAREN param RPAREN block -> ^(CATCH param block)
	;
//! -------- Expressions

exprListOpt       : exprList
                    |
	;
exprList          : expr (COMMA! expr)*
	;
expr              : assignExpr
	;
assignExpr        : iterExpr (assignOp^ iterExpr)* 
	;
iterExpr          : ternaryExpr (ELLIPSIS^ ternaryExpr)*
       ;
ternaryExpr       : logicOrExpr (QUES^ expr COLON! logicOrExpr)*
	;
logicOrExpr       : (logicAndExpr) (BARBAR^ logicAndExpr)*
	;
logicAndExpr      : (cmpExpr) (AMPAMP^ cmpExpr)*
	;
cmpExpr           : (bitExpr) (EQEQ^ bitExpr | BANGEQ^ bitExpr | GTEQ^ bitExpr | LTEQ^ bitExpr | GT^  bitExpr | LT^  bitExpr)*
	;
bitExpr           : (shiftExpr) (BAR^ shiftExpr | AMP^ shiftExpr |CARET^ shiftExpr)*
	;
shiftExpr         : (addExpr) (LTLT^  addExpr | GTGT^  addExpr | GTGTGT^ addExpr)*
	;

addExpr           : (multExpr) ((PLUS^ | SUB^) multExpr )*
	;
multExpr          : (prefixExpr) ((STAR^|SLASH^|PERCENT^) prefixExpr)*
	;
prefixExpr        : (SUB|SUBSUB|PLUSPLUS|BANG|TILDE) prefixExpr
                    |   newExpr
                    |   cast
                    |   suffixExpr
        ;
	
/*suffixExpr
	:	value  (	LPAREN exprListOpt RPAREN 
			| 	DOT IDENTIFIER 
			|	LBRACKET expr RBRACKET
			| 	PLUSPLUS 
			| 	SUBSUB
)* -> ^(SUFFIX_EXPR value (exprListOpt| DOT IDENTIFIER | expr | PLUSPLUS|SUBSUB)*)
	;
*/
suffixExpr
	:	value LPAREN exprListOpt RPAREN -> ^(SUFFIX_EXPR value exprListOpt)
	|	value DOT IDENTIFIER 
	|	value LBRACKET expr RBRACKET
	|	value PLUSPLUS 
	|	value SUBSUB
	|	value
	
;

value	:	funcLit 
                    |   arrayLit
                    |   objLit
                    |   NULL
                    |   IDENTIFIER
                    |   elementarySymbol
                    |   LPAREN! (expr|statement) RPAREN!
                    |
        
        ;
newExpr           : NEW type LPAREN exprListOpt RPAREN ->^(NEW type exprListOpt)
	;
cast              : CAST LPAREN expr (COMMA funcType)? RPAREN -> ^(CAST expr funcType?)
	|	CAST LPAREN expr RPAREN ->^(CAST expr)
	;
//! -------- Declarations

topLevelDecl      : classDecl
                    |   interfaceDecl
                    |   enumDecl
                    |   typedefDecl
	;
enumDecl          : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^(ENUM IDENTIFIER typeParamOpt enumBody)
	;
enumBody          : (enumValueDecl)+
	;
enumValueDecl     :IDENTIFIER LPAREN! paramList RPAREN! SEMI!
                    |  IDENTIFIER SEMI!
                    |   pp
	;
varDeclList       : varDecl varDeclList
	;
	
varDecl           : (declAttrList)? VAR varDeclPartList SEMI ->^(VAR_DECLARATION declAttrList? varDeclPartList )
	;
	
varDeclPartList   : varDeclPart (COMMA! varDeclPart)*
	;
varDeclPart       :IDENTIFIER propDeclOpt typeTagOpt varInitOpt
	;
propDecl          : LPAREN a1=propAccessor COMMA a2=propAccessor RPAREN -> ^(PROPERTY_DECL $a1 $a2)
	;
propAccessor      :IDENTIFIER
                    |   NULL
                    |   DEFAULT
                    |   DYNAMIC
	;
propDeclOpt       : propDecl
                    |
	;
varInitOpt        : varInit 
                    | ->^(VAR_INIT)
	;
varInit           : EQ expr ->^(VAR_INIT expr)
	;
funcDecl          : declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^(FUNCTION<FunctionNode> NEW paramList typeTagOpt block declAttrList)
                    |   declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block ->^(FUNCTION<FunctionNode> IDENTIFIER paramList typeTagOpt block typeParamOpt)
                    |   FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block ->^(FUNCTION<FunctionNode> NEW paramList typeTagOpt block)
                    |   FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block ->^(FUNCTION<FunctionNode> IDENTIFIER paramList typeTagOpt block typeParamOpt)
	;
funcProtoDecl     : declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^(FUNCTION NEW paramList typeTagOpt declAttrList)
                    |   declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI ->^(FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt)
                    |   FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^(FUNCTION NEW paramList typeTagOpt)
                    |   FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI ->^(FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt)
	;
classDecl         : EXTERN? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE ->^(CLASS IDENTIFIER EXTERN? typeParamOpt inheritListOpt classBody)
	;
classBody         : varDecl classBody
                    |   funcDecl classBody
                    |   pp classBody
                    |
	;
interfaceDecl     : INTERFACE type inheritListOpt LBRACE! interfaceBody RBRACE!
	;
interfaceBody     : varDecl interfaceBody
                    |   funcProtoDecl interfaceBody
                    |   pp interfaceBody
                    |
;

inheritList       : inherit (COMMA! inherit)*
	;
inheritListOpt    : inheritList ->^(INHERIT_LIST_OPT inheritList)
	|	->^(INHERIT_LIST_OPT)
    	;
inherit           : EXTENDS type
                    |   IMPLEMENTS type
	;
typedefDecl       : TYPEDEF IDENTIFIER EQ funcType
	;
typeExtend        : GT funcType COMMA!
	;
anonType          : LBRACE!
			( 
                    	|    anonTypeFieldList 
                   	|    varDeclList 
                    	|    typeExtend (
                    			|anonTypeFieldList
                    			|varDeclList) 
                    	) 
                    RBRACE!
	;
anonTypeFieldList : anonTypeField (COMMA! anonTypeField)*
	;

objLit            : '{'! objLitElemList '}'!
;
anonTypeField     :IDENTIFIER COLON! funcType
	;
objLitElemList    : objLitElem (COMMA! objLitElem)*
	;
objLitElem        :IDENTIFIER COLON! expr
	;
	
elementarySymbol
	:	LONGLITERAL
	|	INTLITERAL
	|	STRINGLITERAL
	|	CHARLITERAL
	|	FLOATNUM
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

ABSTRACT
    :   'abstract'
    ;
      
BOOLEAN
    :   'boolean'
    ;
    
BREAK
    :   'break'
    ;
    
BYTE
    :   'byte'
    ;
    
CASE
    :   'case'
    ;
    
CATCH
    :   'catch'
    ;
    
CHAR
    :   'char'
    ;
    
CLASS
    :   'class'
    ;
    
CONST
    :   'const'
    ;

CONTINUE
    :   'continue'
    ;

DEFAULT
    :   'default'
    ;

DO
    :   'do'
    ;

DOUBLE
    :   'double'
    ;

ELSE
    :   'else'
    ;

ENUM
    :   'enum'
    ;             

EXTENDS
    :   'extends'
    ;

FINAL
    :   'final'
    ;

FINALLY
    :   'finally'
    ;

FLOAT
    :   'float'
    ;

FOR
    :   'for'
    ;

GOTO
    :   'goto'
    ;

IF
    :   'if'
    ;

IMPLEMENTS
    :   'implements'
    ;

IMPORT
    :   'import'
    ;

INSTANCEOF
    :   'instanceof'
    ;

INT
    :   'int'
    ;

INTERFACE
    :   'interface'
    ;

LONG
    :   'long'
    ;

NATIVE
    :   'native'
    ;

NEW
    :   'new'
    ;

PACKAGE
    :   'package'
    ;

PRIVATE
    :   'private'
    ;

PROTECTED
    :   'protected'
    ;

PUBLIC
    :   'public'
    ;

RETURN
    :   'return'
    ;

SHORT
    :   'short'
    ;

STATIC
    :   'static'
    ;

INLINE
	: 'inline'
	;

DYNAMIC
	:'dynamic'
	;
	
OVERRIDE
	:'override'
	;
	
STRICTFP
    :   'strictfp'
    ;

SUPER
    :   'super'
    ;

SWITCH
    :   'switch'
    ;

THIS
    :   'this'
    ;

THROW
    :   'throw'
    ;

THROWS
    :   'throws'
    ;

TRANSIENT
    :   'transient'
    ;

TRY
    :   'try'
    ;

VOID
    :   'void'
    ;

VOLATILE
    :   'volatile'
    ;

WHILE
    :   'while'
    ;

TRUE
    :   'true'
    ;

FALSE
    :   'false'
    ;

NULL
    :   'null'
    ;
CAST	:	'cast'
	;
    
FUNCTION
	: 'function'
	;
	
IN	:	'in'
	;
VAR	:	'var'
	;
TYPEDEF	:	'typedef'
	;
EXTERN	:	'extern'
	;

LPAREN
    :   '('
    ;

RPAREN
    :   ')'
    ;

LBRACE
    :   '{'
    ;

RBRACE
    :   '}'
    ;

LBRACKET
    :   '['
    ;

RBRACKET
    :   ']'
    ;

SEMI
    :   ';'
    ;

COMMA
    :   ','
    ;

DOT
    :   '.'
    ;

ELLIPSIS
    :   '...'
    ;

EQ
    :   '='
    ;

BANG
    :   '!'
    ;

TILDE
    :   '~'
    ;

QUES
    :   '?'
    ;

COLON
    :   ':'
    ;

EQEQ
    :   '=='
    ;

AMPAMP
    :   '&&'
    ;

BARBAR
    :   '||'
    ;

PLUSPLUS
    :   '++'
    ;

SUBSUB
    :   '--'
    ;

PLUS
    :   '+'
    ;

SUB
    :   '-'
    ;

STAR
    :   '*'
    ;

SLASH
    :   '/'
    ;

AMP
    :   '&'
    ;

BAR
    :   '|'
    ;

CARET
    :   '^'
    ;

PERCENT
    :   '%'
    ;

PLUSEQ
    :   '+='
    ; 
    
SUBEQ
    :   '-='
    ;

STAREQ
    :   '*='
    ;

SLASHEQ
    :   '/='
    ;

AMPEQ
    :   '&='
    ;

BAREQ
    :   '|='
    ;

CARETEQ
    :   '^='
    ;

PERCENTEQ
    :   '%='
    ;
    
PERCENTDLQ
	: '%%<<%%='
	;
PERCENTDBQ
	: '%%>>%%='
	;
PERCENTDBBQ
	: '%%>>>%%='
	;
EQEQEQ
	:'==='
	;
	
PERCENTLESQ
: '%%<=%%'
	;

BANGEQQ	
	:'!=='
	;

MONKEYS_AT
    :   '@'
    ;

BANGEQ
    :   '!='
    ;
MINUS_BIGGER
	:	'->'
	;

PERCENTLL
	:'%%<<%%'
	;
PERCENTBB
	:'%%>>%%'
	;
PERCENTBBB
	:'%%>>>%%'
	;
GT
    :   '>'
    ;
GTGT	:	'>>'
	;
LTLT	:	'<<'
	;
GTGTGT	:	'>>>'
	;

GTEQ	:	'>='
	;
LTEQ	:	'<='
	;

LT
    :   '<'
    ;     

IDENTIFIER
    :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
    
INTNUM	:	'0'..'9'+
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
    
//For Prepoccecor
PP_IF	:	'#if'
	;
PP_ELSEIF
	:	'#elseif'
	;
PP_ELSE	:	'#else'
	;
PP_END	:	'#end'
	;
PP_ERROR:	'#error'
	;

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