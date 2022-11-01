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

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Espacion en blanco */
{espacio} {/*Ignore*/;}

( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}
( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());} 
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());} 
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());} 
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());} 
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}
( void ) {return new Symbol(sym._Void, yychar, yyline, yytext());}
( while )  {return new Symbol(sym.While, yychar, yyline, yytext());}

( int | long | short | char ) {return new Symbol(sym.TDato, yychar, yyline, yytext());}

( "++" | "--" | "!") {return new Symbol(sym.Op_Bin, yychar, yyline, yytext());}


( "==" | ">=" | "<=" | "!=" | "||" | "&&" | "+=" | "-=" | "*=" | "/=" | ">" | "<" | "+" | "-" | "*" | "/" | "%" ) {return new Symbol(sym.Op_Una, yychar, yyline, yytext());}

( "=" ) {return new Symbol(sym.Asignacion, yychar, yyline, yytext());}

( ";" ) {return new Symbol(sym.Puntoycoma, yychar, yyline, yytext());}

( "(" ) {return new Symbol(sym.Parentesis_Izquierdo, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.Parentesis_Derecho, yychar, yyline, yytext());}
( "{" ) {return new Symbol(sym.Corchete_Izquierdo, yychar, yyline, yytext());}
( "}" ) {return new Symbol(sym.Corchete_Derecho, yychar, yyline, yytext());}

( ":" ) {return new Symbol(sym.Dos_Puntos, yychar, yyline, yytext());}

( read ) {return new Symbol(sym.Read, yychar, yyline, yytext());}
( write ) {return new Symbol(sym.Write, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

({D}-0)+("(-"{D}+")")|{D}+ {return new Symbol(sym.Entero, yychar, yyline, yytext());}

(\'[^\']\')|(\'\'\'\')|("#"{D}) {return new Symbol(sym.Caracter, yychar, yyline, yytext());}

 . {return new Symbol(sym.Error, yychar, yyline, yytext());}



