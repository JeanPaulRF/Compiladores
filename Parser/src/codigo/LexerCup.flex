package codigo;
import java.io.*;
import java_cup.runtime.Symbol;

%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
O=[0-7]+
H=[0-9A-Fa-f]
espacio=[ ,\t, \r,\n,\r\n]+

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacion en blanco */
{espacio} {/*Ignore*/;}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

( break ) {return new Symbol(sym.BREAK, yychar, yyline, yytext());}
( case ) {return new Symbol(sym.CASE, yychar, yyline, yytext());}
( char ) {return new Symbol(sym.CHAR, yychar, yyline, yytext());}
( const ) {return new Symbol(sym.CONST, yychar, yyline, yytext());} 
( continue ) {return new Symbol(sym.CONTINUE, yychar, yyline, yytext());} 
( default ) {return new Symbol(sym.DEFAULT, yychar, yyline, yytext());} 
( do ) {return new Symbol(sym.DO, yychar, yyline, yytext());}
( else ) {return new Symbol(sym.ELSE, yychar, yyline, yytext());}
( for ) {return new Symbol(sym.FOR, yychar, yyline, yytext());}
( if ) {return new Symbol(sym.IF, yychar, yyline, yytext());} 
( int ) {return new Symbol(sym.INT, yychar, yyline, yytext());}
( long ) {return new Symbol(sym.LONG, yychar, yyline, yytext());}
( return ) {return new Symbol(sym.RETURN, yychar, yyline, yytext());}
( short ) {return new Symbol(sym.SHORT, yychar, yyline, yytext());}
( switch ) {return new Symbol(sym.SWITCH, yychar, yyline, yytext());}
( void ) {return new Symbol(sym.VOID, yychar, yyline, yytext());}
( while )  {return new Symbol(sym.WHILE, yychar, yyline, yytext());}

( "," ) {return new Symbol(sym.COMA, yychar, yyline, yytext());}

( "++" ) {return new Symbol(sym.INCREMENTO, yychar, yyline, yytext());}
( "--" ) {return new Symbol(sym.DECREMENTO, yychar, yyline, yytext());}
( "==" ) {return new Symbol(sym.IGUAL, yychar, yyline, yytext());}
( ">=" ) {return new Symbol(sym.MAYOR_IGUAL, yychar, yyline, yytext());}
( "<=" ) {return new Symbol(sym.MENOR_IGUAL, yychar, yyline, yytext());}
( "!=" ) {return new Symbol(sym.DIFERENTE, yychar, yyline, yytext());}
( "||" ) {return new Symbol(sym.OR_LOGICO, yychar, yyline, yytext());}
( "&&" ) {return new Symbol(sym.AND_LOGICO, yychar, yyline, yytext());}
( "+=" ) {return new Symbol(sym.SUMA_ASIGNACION, yychar, yyline, yytext());}
( "-=" ) {return new Symbol(sym.RESTA_ASIGNACION, yychar, yyline, yytext());}
( "*=" ) {return new Symbol(sym.MULTIPLICACION_ASIGNACION, yychar, yyline, yytext());}
( "/=" ) {return new Symbol(sym.DIVISION_ASIGNACION, yychar, yyline, yytext());}

( ";" ) {return new Symbol(sym.PUNTOYCOMA, yychar, yyline, yytext());}

( ">" ) {return new Symbol(sym.MAYOR, yychar, yyline, yytext());}
( "<" ) {return new Symbol(sym.MENOR, yychar, yyline, yytext());}
( "!" ) {return new Symbol(sym.NOT_LOGICO, yychar, yyline, yytext());}
( "=" ) {return new Symbol(sym.ASIGNACION, yychar, yyline, yytext());}
( "+" ) {return new Symbol(sym.SUMA, yychar, yyline, yytext());}
( "-" ) {return new Symbol(sym.RESTA, yychar, yyline, yytext());}
( "*" ) {return new Symbol(sym.MULTIPLICACION, yychar, yyline, yytext());}
( "/" ) {return new Symbol(sym.DIVISION, yychar, yyline, yytext());}
( "%" ) {return new Symbol(sym.MODULO, yychar, yyline, yytext());}
( "(" ) {return new Symbol(sym.PARENTESIS_IZQUIERDO, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.PARENTESIS_DERECHO, yychar, yyline, yytext());}
( "[" ) {return new Symbol(sym.PARENTESIS_CUADRADO_IZQUIERDO, yychar, yyline, yytext());}
( "]" ) {return new Symbol(sym.PARENTESIS_CUADRADO_DERECHO, yychar, yyline, yytext());}
( "{" ) {return new Symbol(sym.CORCHETE_IZQUIERDO, yychar, yyline, yytext());}
( "}" ) {return new Symbol(sym.CORCHETE_DERECHO, yychar, yyline, yytext());}

( "." ) {return new Symbol(sym.PUNTO, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());}

({D}-0)+("(-"{D}+")")|{D}+ {return new Symbol(sym.NTERO, yychar, yyline, yytext());}

(\'[^\']\')|(\'\'\'\')|("#"{D}) {return new Symbol(sym.CARACTER, yychar, yyline, yytext());}

(\"[^\"]*\")|(\"[^\"]*\"(\"[^\"]*\")*) {return new Symbol(sym.CADENA, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}



