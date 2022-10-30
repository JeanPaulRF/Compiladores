package codigo;
import java.io.*;
import static codigo.Tokens.*;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
O=[0-7]+
H=[0-9A-Fa-f]
espacio=[ ,\t]+
enter=[\r,\n,\r\n]+

%{
    public String lexeme;
%}
%%
auto |
double |
enum |
extern |
float |
goto |
register |
signed |
sizeof |
static |
struct |
typedef |
union |
unsigned |
volatile {lexeme=yytext(); return Palabra_Reservada;}

break {lexeme=yytext(); return Break;}
case {lexeme=yytext(); return Case;} 
char {lexeme=yytext(); return Char;} 
const {lexeme=yytext(); return Const;}  
continue {lexeme=yytext(); return Continue;}  
default {lexeme=yytext(); return Default;}  
do {lexeme=yytext(); return Do;} 
else {lexeme=yytext(); return Else;} 
for {lexeme=yytext(); return For;} 
if {lexeme=yytext(); return If;} 
int {lexeme=yytext(); return Int;} 
long {lexeme=yytext(); return Long;} 
return {lexeme=yytext(); return Return;} 
short {lexeme=yytext(); return Short;} 
switch {lexeme=yytext(); return Switch;} 
void {lexeme=yytext(); return Void;} 
while  {lexeme=yytext(); return While;} 

"," {lexeme=yytext(); return Operador_Coma;}
{enter} {lexeme=yytext(); return New_Line;}
{espacio} {/*Ignore*/;}
"//".* {/*Ignore*/;}
"/*" {lexeme=yytext(); return Comentario_Inicio;}
"*/" {lexeme=yytext(); return Comentario_Fin;}
"0"{O} {lexeme=yytext(); return Literal_Octal;}
"0x"{H} {lexeme=yytext(); return Literal_Hexadecimal;}
{D}+{L}+ {lexeme=yytext(); return Error_Alfanumerico;}

">>" {lexeme=yytext(); return Operador_Desplazamiento_Derecha;}
"<<" {lexeme=yytext(); return Operador_Desplazamiento_Izquierda;}
"%=" {lexeme=yytext(); return Operador_Modulo_Asignacion;}
"&=" {lexeme=yytext(); return Operador_And_Asignacion;}
"^=" {lexeme=yytext(); return Operador_Xor_Asignacion;}
"|=" {lexeme=yytext(); return Operador_Or_Asignacion;}
"<<=" {lexeme=yytext(); return Operador_Desplazamiento_Izquierda_Asignacion;}
">>=" {lexeme=yytext(); return Operador_Desplazamiento_Derecha_Asignacion;}
"->" {lexeme=yytext(); return Operador_Miembro_Puntero;}
"++" {lexeme=yytext(); return Operador_Incremento;}
"--" {lexeme=yytext(); return Operador_Decremento;}
"==" {lexeme=yytext(); return Operador_Igual;}
">=" {lexeme=yytext(); return Operador_Mayor_Igual;}
"<=" {lexeme=yytext(); return Operador_Menor_Igual;}
"!=" {lexeme=yytext(); return Operador_Diferente;}
"||" {lexeme=yytext(); return Operador_OR_Logico;}
"&&" {lexeme=yytext(); return Operador_And_Logico;}
"+=" {lexeme=yytext(); return Operador_Suma_Asignacion;}
"-=" {lexeme=yytext(); return Operador_Resta_Asignacion;}
"*=" {lexeme=yytext(); return Operador_Multiplicacion_Asignacion;}
"/=" {lexeme=yytext(); return Operador_Division_Asignacion;}
"~" {lexeme=yytext(); return Operador_Not;}
";" {lexeme=yytext(); return Operador_Puntoycoma;}
">" {lexeme=yytext(); return Operador_Mayor;}
"<" {lexeme=yytext(); return Operador_Menor;}
"?" {lexeme=yytext(); return Operador_Ternacio_Pregunta;}
"!" {lexeme=yytext(); return Operador_Not_Logico;}
"=" {lexeme=yytext(); return Operador_Asignacion;}
"+" {lexeme=yytext(); return Operador_Suma;}
"-" {lexeme=yytext(); return Operador_Resta;}
"*" {lexeme=yytext(); return Operador_Multiplicacion;}
"/" {lexeme=yytext(); return Operador_Division;}
"%" {lexeme=yytext(); return Operador_Modulo;}
"(" {lexeme=yytext(); return Operador_Parentesis_Izquierdo;}
")" {lexeme=yytext(); return Operador_Parentesis_Derecho;}
"[" {lexeme=yytext(); return Operador_Parentesis_Cuadrado_Izquierdo;}
"]" {lexeme=yytext(); return Operador_Parentesis_Cuadrado_Derecho;}
"{" {lexeme=yytext(); return Operador_Corchete_Izquierdo;}
"}" {lexeme=yytext(); return Operador_Corchete_Derecho;}
":" {lexeme=yytext(); return Operador_Ternario_Puntos;}
"." {lexeme=yytext(); return Operador_Punto;}
"&" {lexeme=yytext(); return Operador_And;}
"^" {lexeme=yytext(); return Operador_Xor;}
"|" {lexeme=yytext(); return Operador_Or;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
({D}-0)+("(-"{D}+")")|{D}+ {lexeme=yytext(); return Literal_Entero;}
{D}+ "." {D}+ {lexeme=yytext(); return Literal_Float;}
(\'[^\']\')|(\'\'\'\')|("#"{D}) {lexeme=yytext(); return Literal_CARACTER;}
(\"[^\"]*\")|(\"[^\"]*\"(\"[^\"]*\")*) {lexeme=yytext(); return Literal_CADENA;}
[^L] {lexeme=yytext(); return Error_Token;}
"#"{L}+ {lexeme=yytext(); return Error_Literal;}
{D}+"."{D}+"."{D}+ {lexeme=yytext(); return Error_Numerico;}
 . {lexeme=yytext(); return Error;}