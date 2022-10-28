package codigo;
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
espacio=[ ,\t,\r,\n]+
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

( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}
( char ) {return new Symbol(sym.Char, yychar, yyline, yytext());}
( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());} 
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());} 
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());} 
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());} 
( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}
( long ) {return new Symbol(sym.Long, yychar, yyline, yytext());}
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}
( short ) {return new Symbol(sym.Short, yychar, yyline, yytext());}
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}
( void ) {return new Symbol(sym._Void, yychar, yyline, yytext());}
( while )  {return new Symbol(sym.While, yychar, yyline, yytext());}

( "++" ) {return new Symbol(sym.Incremento, yychar, yyline, yytext());}
( "--" ) {return new Symbol(sym.Decremento, yychar, yyline, yytext());}
( "==" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}
( ">=" ) {return new Symbol(sym.Mayor_Igual, yychar, yyline, yytext());}
( "<=" ) {return new Symbol(sym.Menor_Igual, yychar, yyline, yytext());}
( "!=" ) {return new Symbol(sym.Diferente, yychar, yyline, yytext());}
( "||" ) {return new Symbol(sym.Or_Logico, yychar, yyline, yytext());}
( "&&" ) {return new Symbol(sym.And_Logico, yychar, yyline, yytext());}
( "+=" ) {return new Symbol(sym.Suma_Asignacion, yychar, yyline, yytext());}
( "-=" ) {return new Symbol(sym.Resta_Asignacion, yychar, yyline, yytext());}
( "*=" ) {return new Symbol(sym.Multiplicacion_Asignacion, yychar, yyline, yytext());}
( "/=" ) {return new Symbol(sym.Division_Asignacion, yychar, yyline, yytext());}

( ";" ) {return new Symbol(sym.Puntoycoma, yychar, yyline, yytext());}

( ">" ) {return new Symbol(sym.Mayor, yychar, yyline, yytext());}
( "<" ) {return new Symbol(sym.Menor, yychar, yyline, yytext());}
( "!" ) {return new Symbol(sym.Not_Logico, yychar, yyline, yytext());}
( "=" ) {return new Symbol(sym.Asignacion, yychar, yyline, yytext());}
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}

( "(" ) {return new Symbol(sym.Parentesis_Izquierdo, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.Parentesis_Derecho, yychar, yyline, yytext());}
( "[" ) {return new Symbol(sym.Parentesis_Cuadrado_Izquierdo, yychar, yyline, yytext());}
( "]" ) {return new Symbol(sym.Parentesis_Cuadrado_Derecho, yychar, yyline, yytext());}
( "{" ) {return new Symbol(sym.Corchete_Izquierdo, yychar, yyline, yytext());}
( "}" ) {return new Symbol(sym.Corchete_Derecho, yychar, yyline, yytext());}
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

( read ) {return new Symbol(sym.Read, yychar, yyline, yytext());}
( write ) {return new Symbol(sym.Write, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

({D}-0)+("(-"{D}+")")|{D}+ {return new Symbol(sym.Entero, yychar, yyline, yytext());}

(\'[^\']\')|(\'\'\'\')|("#"{D}) {return new Symbol(sym.Caracter, yychar, yyline, yytext());}

(\"[^\"]*\")|(\"[^\"]*\"(\"[^\"]*\")*) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

 . {return new Symbol(sym.Error, yychar, yyline, yytext());}



