package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup

%type java_cup.runtime.Symbol
%public
%line
%char
%cup
%unicode

%init{ 
    yyline = 1; 
    yychar = 1; 
%init}

L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t]+
enter=[\r,\n,\r\n]+

%%

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

( "," ) {return new Symbol(sym.Coma, yyline, yychar, yytext());}

{enter} {yychar=1; /*Ignore*/;}

/* Espacion en blanco */
{espacio} {/*Ignore*/;}

( break ) {return new Symbol(sym.Break, yyline, yychar, yytext());}
( case ) {return new Symbol(sym.Case, yyline, yychar, yytext());}
( const ) {return new Symbol(sym.Const, yyline, yychar, yytext());} 
( continue ) {return new Symbol(sym.Continue, yyline, yychar, yytext());} 
( default ) {return new Symbol(sym.Default, yyline, yychar, yytext());} 
( do ) {return new Symbol(sym.Do, yyline, yychar, yytext());}
( else ) {return new Symbol(sym.Else, yyline, yychar, yytext());}
( for ) {return new Symbol(sym.For, yyline, yychar, yytext());}
( if ) {return new Symbol(sym.If, yyline, yychar, yytext());} 
( return ) {return new Symbol(sym.Return, yyline, yychar, yytext());}
( switch ) {return new Symbol(sym.Switch, yyline, yychar, yytext());}
( void ) {return new Symbol(sym._Void, yyline, yychar, yytext());}
( while )  {return new Symbol(sym.While, yyline, yychar, yytext());}

( int | long | short | char ) {return new Symbol(sym.TDato, yyline, yychar, yytext());}

( "++" | "--" | "!") {return new Symbol(sym.Op_Una, yyline, yychar, yytext());}


( "==" | ">=" | "<=" | "!=" | "||" | "&&" | "+=" | "-=" | "*=" | "/=" | ">" | "<" | "+" | "-" | "*" | "/" | "%" ) {return new Symbol(sym.Op_Bin, yyline, yychar, yytext());}

( "=" ) {return new Symbol(sym.Asignacion, yyline, yychar, yytext());}

( ";" ) {return new Symbol(sym.Puntoycoma, yyline, yychar, yytext());}

( "(" ) {return new Symbol(sym.Parentesis_Izquierdo, yyline, yychar, yytext());}
( ")" ) {return new Symbol(sym.Parentesis_Derecho, yyline, yychar, yytext());}
( "{" ) {return new Symbol(sym.Corchete_Izquierdo, yyline, yychar, yytext());}
( "}" ) {return new Symbol(sym.Corchete_Derecho, yyline, yychar, yytext());}

( ":" ) {return new Symbol(sym.Dos_Puntos, yyline, yychar, yytext());}

( read ) {return new Symbol(sym.Read, yyline, yychar, yytext());}
( write ) {return new Symbol(sym.Write, yyline, yychar, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yyline, yychar, yytext());}

({D}-0)+("(-"{D}+")")|{D}+ {return new Symbol(sym.Entero, yyline, yychar, yytext());}

(\'[^\']\')|(\'\'\'\')|("#"{D}) {return new Symbol(sym.Caracter, yyline, yychar, yytext());}

 . {Pantalla.errores += "";}



