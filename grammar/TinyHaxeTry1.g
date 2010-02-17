grammar TinyHaxeTry1;

options {
    backtrack=true;
    memoize=true;
}


module            : myPackage topLevelList
                    |   topLevelList
	;
topLevelList      :  (topLevel)*
;
topLevel          : myImport
                    |   pp
                    |   topLevelDecl
	;
myPackage           : 'package' dotIdent ';'
	;
myImport            : 'import' dotIdent ';'
	;
// -------- Basics
                    
access            : 'public'
                    |   'private'
	;
declAttr          : 'static'
                    |   'inline'
                    |   'dynamic'
                    |   'override'
                    |   access
	;
declAttrList      : (declAttr)+ 
         ;
	/*
! NOTE: Though these terms are often used interchangeably,
!        their technical meanings are:
!           "Parameter": Used in function declarations.
!           "Argument":  Used in function calls.
*/
paramListOpt      : paramList
        //            |
	;
paramList         : param (',' param)*
	;
param             :IDENTIFIER typeTagOpt varInitOpt
                    |   '?'IDENTIFIER typeTagOpt varInitOpt
	;
dotIdent          : (IDENTIFIER) ('.'IDENTIFIER)*
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
funcLit           : 'function' '(' paramListOpt ')' typeTagOpt block
	;
arrayLit         : '[' exprListOpt ']'
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
ppIf              : '#if'IDENTIFIER
                    |   '#if' '!'IDENTIFIER
	;
ppElseIf          : '#elseif'IDENTIFIER
                    |   '#elseif' '!'IDENTIFIER
	;
ppElse            : '#else'
	;
ppEnd             : '#end'
	;
ppError           : '#error'
	;
//! -------- Types

typeTag           : ':' funcType
	;
typeTagOpt        : typeTag
         //           |
	;
typeList          : funcType (',' funcType)*
                    |   typeConstraint (',' typeConstraint )*
                 ;


/*
typeList          : funcType (',' typeList)
                    |   typeConstraint ',' typeList
                    |   funcType
                    |   typeConstraint
	;
	*/
funcType          : (type) ('->' type)*
	;
type              : (anonType | dotIdent) (typeParam)*
	;
typeParam         : '<' typeList '>'
	;
typeParamOpt      : typeParam
         //           |
	;
typeConstraint    :IDENTIFIER ':' '(' typeList ')'
	;
//! -------- Statements

//stmt              : ('untyped')?( thenNotOkStmt
  //                  |   thenOkStmt)
//	;
	
statement 
    :   block
    |   'if' parExpression statement ('else' statement)?          
    |   forStmt
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   tryStmt
  //  |   'switch' parExpression '{' switchBlockStatementGroups '}'
   | switchStmt
    |   'return' (expr)? ';'
    |   'throw' expr ';'
    |   'break' (IDENTIFIER)? ';'
    |   'continue' (IDENTIFIER)? ';'
    |   expr  ';'     
    |   IDENTIFIER ':' statement
    |   ';'
    ;
    
parExpression 
    :   '(' expr ')'
    ;

/*thenNotOkStmt     : varDecl
                    |   ifStmt
                    |   forStmt
       //             |   whileStmt
	;
thenOkStmt        :  block ';'
                    |   expr ';'
		//    |   returnStmt
		    |   breakStmt
		    |   continueStmt
		    |   caseStmt
		    |   defaultStmt
		    |   switchStmt
	//	    |   throwStmt
		    |   tryStmt
		    |   pp
	;*/
block         : '{' (blockStmt)* '}'
	;
blockStmt
	:	varDecl
	|	classDecl
	|	statement
	;
//stmtList          : stmt  (';' stmt)*
                    //|   stmt ';' stmtList
  //     ;
//ifStmt            : 'if' '(' expr ')' statement ('else' stmt)? 
//	;
//thenStmt          : 'if' '(' expr ')' (thenStmt|thenOkStmt)   'else' (thenStmt|thenOkStmt)
  //                  ;
                    
forStmt           : 'for' '(' expr 'in' expr ')' statement
	;
//whileStmt         : 'while' '(' expr ')' stmt
  //                  |   'do' stmt 'while' '(' expr ')'
//	;
//returnStmt        : 'return' ';'
  //                  |   'return' expr ';'
//	;
breakStmt         : 'break' ';'
	;
continueStmt      : 'continue' ';'
	;
caseStmt          : 'case' exprList ':'
	;
defaultStmt       : 'default' ':'
	;
switchStmt        : 'switch' '(' expr ')' block
	;
//throwStmt         : 'throw' expr ';'
//	;
tryStmt           : 'try' block catchStmtList
	;
catchStmtList     : catchStmt catchStmtList
         //           |
	;
catchStmt         : 'catch' '(' param ')' block
	;
//! -------- Expressions

exprListOpt       : exprList
  //                  |
	;
exprList          : (expr) (',' expr)*
	;
expr              : assignExpr
	;
assignExpr        : iterExpr (assignOp iterExpr)*
	;
iterExpr          : ternaryExpr ('...' ternaryExpr)?
       ;
ternaryExpr       : logicOrExpr ('?' expr ':' logicOrExpr)*
//(logicOrExpr '?' expr ':')*
//	|	 logicOrExpr

	//|	logicOrExpr '?' expr ':' ternaryExpr
          //          |   logicOrExpr
	;
logicOrExpr       : (logicAndExpr) ('||' logicAndExpr)*
	;
logicAndExpr      : (cmpExpr) ('&&' cmpExpr)*
	;
cmpExpr           : (bitExpr) ('==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>'  bitExpr | '<'  bitExpr)*
	;
bitExpr           : (shiftExpr) ('|' shiftExpr | '&' shiftExpr | '^' shiftExpr)*
	;
shiftExpr         : (addExpr) ('<<'  addExpr | '>>'  addExpr | '>>>' addExpr)*
	;
	/*
!******************************************************************
!UNSAFE ALTERNATE CMP/BIT/SHIFT
!See the documentation at the top for myImportant notes relating to this:

logicAndExpr      : logicAndExpr '&&' cmpBitShiftExpr
                    |   cmpBitShiftExpr
	;
cmpBitShiftExpr   : cmpBitShiftExpr '==' addExpr
                    |   cmpBitShiftExpr '!=' addExpr
                    |   cmpBitShiftExpr '>=' addExpr
                    |   cmpBitShiftExpr '<=' addExpr
                    |   cmpBitShiftExpr '>'  addExpr
                    |   cmpBitShiftExpr '<'  addExpr
                    |   cmpBitShiftExpr '|'  addExpr
                    |   cmpBitShiftExpr '&'  addExpr
                    |   cmpBitShiftExpr '^'  addExpr
                    |   cmpBitShiftExpr '<<'        addExpr
                    |   cmpBitShiftExpr '>' '>'     addExpr
                    |   cmpBitShiftExpr '>' '>' '>' addExpr
                    |   addExpr
	;
******************************************************************!
*/
addExpr           : (multExpr) ('+' multExpr | '-' multExpr)*
	;
multExpr          : (prefixExpr) ('*' prefixExpr | '/' prefixExpr | '%' prefixExpr)*
	;
prefixExpr        : ('-'|'--'|'++'|'!'|'~') prefixExpr
                    |   newExpr
                    |   cast
                    |   suffixExpr 
	;
suffixExpr        : (value) ('(' exprListOpt ')' | '.'IDENTIFIER | '[' expr ']' | '++' | '--')*
	;
value        :/* DecLit
                    |   HexLit
                    |   BoolLit
                    |   StrLit
                    |   RegexLit*/
                       funcLit 
                    |   arrayLit
                    |   objLit
                    |   'null'
                    |  IDENTIFIER
        //            |   '(' (expr|stmt) ')'
                    |   '(' (expr|statement) ')'
        
        ;
newExpr           : 'new' type '(' exprListOpt ')'
	;
cast              : 'cast' '(' expr (',' funcType)? ')'
//                    |   'cast' '(' expr ')'
	;
//! -------- Declarations

topLevelDecl      : classDecl
                    |   interfaceDecl
                    |   enumDecl
                    |   typedefDecl
	;
enumDecl          : 'enum'IDENTIFIER typeParamOpt '{' enumBody '}'
	;
enumBody          : (enumValueDecl)+
	;
enumValueDecl     :IDENTIFIER '(' paramListOpt ')' ';'
                    |  IDENTIFIER ';'
                    |   pp
	;
varDeclList       : varDecl varDeclList
	;
varDecl           : declAttrList 'var' varDeclPartList ';'
                    |   'var' varDeclPartList ';'
	;
varDeclPartList   : (varDeclPart) (',' varDeclPart)*
	;
varDeclPart       :IDENTIFIER propDeclOpt typeTagOpt varInitOpt
	;
propDecl          : '(' propAccessor ',' propAccessor ')'
	;
propAccessor      :IDENTIFIER
                    |   'null'
                    |   'default'
                    |   'dynamic'
	;
propDeclOpt       : propDecl
         //           |
	;
varInitOpt        : varInit
         //           |
	;
varInit           : '=' expr
	;
funcDecl          : declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block
                    |   declAttrList 'function'IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block
                    |   'function' 'new' '(' paramListOpt ')' typeTagOpt block
                    |   'function'IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block
	;
funcProtoDecl     : declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';'
                    |   declAttrList 'function'IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';'
                    |   'function' 'new' '(' paramListOpt ')' typeTagOpt ';'
                    |   'function'IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';'
	;
classDecl         : 'class'IDENTIFIER typeParamOpt inheritListOpt '{' classBody '}'
	;
classBody         : varDecl classBody
                    |   funcDecl classBody
                    |   pp classBody
         //           |
	;
interfaceDecl     : 'interface' type inheritListOpt '{' interfaceBody '}'
	;
interfaceBody     : varDecl interfaceBody
                    |   funcProtoDecl interfaceBody
                    |   pp interfaceBody
         //           |
;
inheritListOpt    : inheritList
                    //|
	;
inheritList       : (inherit) (',' inherit)*
	;
inherit           : 'extends' type
                    |   'implements' type
	;
typedefDecl       : 'typedef'IDENTIFIER '=' funcType
	;
typeExtend        : '>' funcType ','
	;
anonType          : '{'( 
                    |    anonTypeFieldList 
                    |    varDeclList 
                    |    typeExtend (
                    			|anonTypeFieldList
                    			|varDeclList) 
                    ) '}'
	;
anonTypeFieldList : (anonTypeField) (',' anonTypeField)*
	;
anonTypeField     :IDENTIFIER ':' funcType
	;
objLit            : '{' objLitElemList '}'
;
objLitElemList    : (objLitElem) (',' objLitElem)*
	;
objLitElem        :IDENTIFIER ':' expr
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

fragment
NonIntegerNumber
    :   ('0' .. '9')+ '.' ('0' .. '9')* Exponent?  
    |   '.' ( '0' .. '9' )+ Exponent?  
    |   ('0' .. '9')+ Exponent  
    |   ('0' .. '9')+ 
    |   
        HexPrefix (HexDigit )* 
        (    () 
        |    ('.' (HexDigit )* ) 
        ) 
        ( 'p' | 'P' ) 
        ( '+' | '-' )? 
        ( '0' .. '9' )+
        ;

CHARLITERAL
    :   '\'' 
        (   EscapeSequence 
        |   ~( '\'' | '\\' | '\r' | '\n' )
        ) 
        '\''
    ; 

STRINGLITERAL
    :   '"' 
        (   EscapeSequence
        |   ~( '\\' | '"' | '\r' | '\n' )        
        )* 
        '"' 
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

LT
    :   '<'
    ;     

IDENTIFIER
    :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
 INTNUM :	'0'..'9'+
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

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
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