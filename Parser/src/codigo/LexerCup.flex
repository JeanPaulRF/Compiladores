package codigo;
import java.io.*;
import java_cup.runtime.Symbol;

%%
%class LexerCup
%type java_cup.runtime.Symbol
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
volatile {lexeme=yytext(); return PALABRA_RESERVADA;}

break {lexeme=yytext(); return BREAK;}
case {lexeme=yytext(); return CASE;} 
char {lexeme=yytext(); return CHAR;} 
const {lexeme=yytext(); return CONST;}  
continue {lexeme=yytext(); return CONTINUE;}  
default {lexeme=yytext(); return DEFAULT;}  
do {lexeme=yytext(); return DO;} 
else {lexeme=yytext(); return ELSE;} 
for {lexeme=yytext(); return FOR;} 
if {lexeme=yytext(); return IF;} 
int {lexeme=yytext(); return INT;} 
long {lexeme=yytext(); return LONG;} 
return {lexeme=yytext(); return RETURN;} 
short {lexeme=yytext(); return SHORT;} 
switch {lexeme=yytext(); return SWITCH;} 
void {lexeme=yytext(); return VOID;} 
while  {lexeme=yytext(); return WHILE;} 

{espacio} {/*Ignore*/;}
"//".* {/*Ignore*/;}
"/*" {lexeme=yytext(); return COMENTARIO_INICIO;}
"*/" {lexeme=yytext(); return COMENTARIO_FIN;}
"0"{O} {lexeme=yytext(); return LITERAL_OCTAL;}
"0x"{H} {lexeme=yytext(); return LITERAL_HEXADECIMAL;}
{D}+{L}+ {lexeme=yytext(); return ERROR_ALFANUMERICO;}
"," {lexeme=yytext(); return OPERADOR_COMA;}
">>" {lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_DERECHA;}
"<<" {lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_IZQUIERDA;}
"%=" {lexeme=yytext(); return OPERADOR_MODULO_ASIGNACION;}
"&=" {lexeme=yytext(); return OPERADOR_AND_ASIGNACION;}
"^=" {lexeme=yytext(); return OPERADOR_XOR_ASIGNACION;}
"|=" {lexeme=yytext(); return OPERADOR_OR_ASIGNACION;}
"<<=" {lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_IZQUIERDA_ASIGNACION;}
">>=" {lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_DERECHA_ASIGNACION;}
"->" {lexeme=yytext(); return OPERADOR_MIEMBRO_PUNTERO;}
"++" {lexeme=yytext(); return OPERADOR_INCREMENTO;}
"--" {lexeme=yytext(); return OPERADOR_DECREMENTO;}
"==" {lexeme=yytext(); return OPERADOR_IGUAL;}
">=" {lexeme=yytext(); return OPERADOR_MAYOR_IGUAL;}
"<=" {lexeme=yytext(); return OPERADOR_MENOR_IGUAL;}
"!=" {lexeme=yytext(); return OPERADOR_DIFERENTE;}
"||" {lexeme=yytext(); return OPERADOR_OR_LOGICO;}
"&&" {lexeme=yytext(); return OPERADOR_AND_LOGICO;}
"+=" {lexeme=yytext(); return OPERADOR_SUMA_ASIGNACION;}
"-=" {lexeme=yytext(); return OPERADOR_RESTA_ASIGNACION;}
"*=" {lexeme=yytext(); return OPERADOR_MULTIPLICACION_ASIGNACION;}
"/=" {lexeme=yytext(); return OPERADOR_DIVISION_ASIGNACION;}
"~" {lexeme=yytext(); return OPERADOR_NOT;}
";" {lexeme=yytext(); return OPERADOR_PUNTOYCOMA;}
">" {lexeme=yytext(); return OPERADOR_MAYOR;}
"<" {lexeme=yytext(); return OPERADOR_MENOR;}
"?" {lexeme=yytext(); return OPERADOR_TERNARIO_PREGUNTA;}
"!" {lexeme=yytext(); return OPERADOR_NOT_LOGICO;}
"=" {lexeme=yytext(); return OPERADOR_ASIGNACION;}
"+" {lexeme=yytext(); return OPERADOR_SUMA;}
"-" {lexeme=yytext(); return OPERADOR_RESTA;}
"*" {lexeme=yytext(); return OPERADOR_MULTIPLICACION;}
"/" {lexeme=yytext(); return OPERADOR_DIVISION;}
"%" {lexeme=yytext(); return OPERADOR_MODULO;}
"(" {lexeme=yytext(); return OPERADOR_PARENTESIS_IZQUIERDO;}
")" {lexeme=yytext(); return OPERADOR_PARENTESIS_DERECHO;}
"[" {lexeme=yytext(); return OPERADOR_PARENTESIS_CUADRADO_IZQUIERDO;}
"]" {lexeme=yytext(); return OPERADOR_PARENTESIS_CUADRADO_DERECHO;}
"{" {lexeme=yytext(); return OPERADOR_CORCHETE_IZQUIERDO;}
"}" {lexeme=yytext(); return OPERADOR_CORCHETE_DERECHO;}
":" {lexeme=yytext(); return OPERADOR_TERNARIO_PUNTOS;}
"." {lexeme=yytext(); return OPERADOR_PUNTO;}
"&" {lexeme=yytext(); return OPERADOR_AND;}
"^" {lexeme=yytext(); return OPERADOR_XOR;}
"|" {lexeme=yytext(); return OPERADOR_OR;}
{L}({L}|{D})* {lexeme=yytext(); return IDENTIFICADOR;}
({D}-0)+("(-"{D}+")")|{D}+ {lexeme=yytext(); return LITERAL_ENTERO;}
{D}+ "." {D}+ {lexeme=yytext(); return LITERAL_FLOAT;}
(\'[^\']\')|(\'\'\'\')|("#"{D}) {lexeme=yytext(); return LITERAL_CARACTER;}
(\"[^\"]*\")|(\"[^\"]*\"(\"[^\"]*\")*) {lexeme=yytext(); return LITERAL_CADENA;}
[^L] {lexeme=yytext(); return ERROR_TOKEN;}
"#"{L}+ {lexeme=yytext(); return ERROR_LITERAL;}
{D}+"."{D}+"."{D}+ {lexeme=yytext(); return ERROR_NUMERICO;}
 . {lexeme=yytext(); return ERROR;}



