/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import codigo.RS.*;
import java.util.ArrayList;
import java.util.Stack;
import javax.script.ScriptEngine; 
import javax.script.ScriptEngineManager; 
import javax.script.ScriptException;
import javax.script.SimpleBindings;

/**
 *
 * @author jeanp
 */
public abstract class Semantic {
    public static Stack<RS> pila = new Stack<RS>();
    public static ArrayList<CeldaTabla> tabla = new ArrayList<CeldaTabla>();
    public static String errores = new String();
    public static ArrayList<String> listaErrores = new ArrayList<String>();
    public static String codigoASM = new String();
    public static String codigoElse = new String();
    
    
    //DECLARACION
    public static void recuerdaTipo(String tipo){
        //System.out.println("a");
        //System.out.println(tipo + " zzzzzz");
        RS_Tipo rsTipo = new RS_Tipo("TDato", tipo);
        pila.push(rsTipo);
        //System.out.println("EL TIPO ES: " + token);
    }
    
    public static void recuerdaId(String nombre){
        RS_Id rsId = new RS_Id("identificador", nombre);
        pila.push(rsId);
    }
    
    public static void recuerdaTSDecla(){
        RS_Tipo rsTipo = (RS_Tipo) pila.pop();
        while(!pila.isEmpty() && pila.peek().token == "identificador"){
            RS_Id rsId = (RS_Id) pila.pop();
            if (!estaEnTS(rsId.nombre)){
                tabla.add(new CeldaTabla(rsId.nombre, rsTipo.tipo, "variable global"));
            }
            else{
                errores += "SE REPITE LA VARIABLE: " + rsId.nombre + "\n";
                System.out.println("SE REPITE LA VARIABLE: " + rsId.nombre);
            }
            
        }
    }
    
    public static void recuerdaImplementacion(){
        RS_Id rsID = (RS_Id) pila.pop();
        RS_Tipo rsTipo = (RS_Tipo) pila.pop();
        if (!estaEnTS(rsID.nombre)){
                tabla.add(new CeldaTabla(rsID.nombre, rsTipo.tipo, "variable global"));
            }
            else{
                errores += "SE REPITE LA VARIABLE: " + rsID.nombre + "\n";
                System.out.println("SE REPITE LA VARIABLE: " + rsID.nombre);
            }
    }
    
    private static boolean estaEnTS(String token){
        for (int i = 0; i < tabla.size(); i++){
            if((tabla.get(i).nombre.equals(token))) {
                return true; 
            }
        }
        return false;
    }
    
    
    private static CeldaTabla buscarEnTS(String nombre){
        for (int i = 0; i < tabla.size(); i++) {
            CeldaTabla celda = tabla.get(i);
            if(celda.nombre.equals(nombre))
                return celda;
        }
        return null;
    }
    
    
    //ASIGNACION
    public static void asignarValor(String nombre){
        RS_DO rsDO = (RS_DO) pila.pop();
        CeldaTabla celda = buscarEnTS(nombre);
        if(celda == null){
            errores += "LA VARIABLE: " + nombre + " no esta declarada\n";
        }
        else{
            celda.valor = rsDO.valor;
            System.out.println(nombre+" "+celda.valor);
        }
    }
    
    
    
    //EXPRESION
    public static void recuerdaConstExp(String valor){
        RS_DO rsDo = new RS_DO("expresion", valor, "constante");
        pila.push(rsDo);
    }
    
    
    public static void recuerdaVarExp(String nombre){
        RS_DO rsDo = new RS_DO("expresion", nombre, "direccion");
        if(!estaEnTS(nombre)){
            CeldaTabla celda = new CeldaTabla(rsDo.valor, rsDo.tipo, "variable local");
            celda.tagError = "Variable no declarada";
            tabla.add(celda);
            System.out.println("VARIABLE NO DECLARADA: " + nombre);
            errores += "VARIABLE NO DECLARADA: " + nombre + " en la línea: \n\r ";
        }
        pila.push(rsDo);
    }
    
    
    public static void recuerdaOperExp(String operador){
        RS_Operador rsOp = new RS_Operador("operador", operador);
        pila.push(rsOp);
    }
    
    
    public static void evalUnary(){
        RS_Operador operador = (RS_Operador) pila.pop();
        RS_DO rs = (RS_DO) pila.pop();
        if(rs.token != operador.token){
            System.out.println("VALORES Y OPERADOR DIFERENTES");
            errores += "VALORES Y OPERADOR DIFERENTES: " + operador.token  + " en la línea: \n\r";
        }
        else{
            RS_DO nuevo = null;
            if(rs.tipo == "constante"){
                ScriptEngineManager manager = new ScriptEngineManager(); 
                ScriptEngine interprete = manager.getEngineByName("js"); 
                try { 
                    String valor = (String) interprete.eval(rs.valor + operador.operador); 
                    nuevo = new RS_DO("expresion", valor, "constante");
                } 
                catch(ScriptException se) { 
                    se.printStackTrace(); 
                } 
            }
            else{
                //codigo
                nuevo = new RS_DO("expresion", "", "direccion");
            }
            pila.push(nuevo);
        } 
    }
    
    private static int calcularInt(String a, String operador, String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        switch(operador){
            case "+=":
                return num1+num2;
            case "-=":
                return num1-num2;
            case "*=": 
                return num1*num2;
            case "/=":
                return num1/num2;
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            case "%":
                return num1%num2;
            default:
                return 0;
        }
    }


    private static boolean calcularBool(String a, String operador, String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        switch(operador){
            case "==":
            case ">=":
            case "<=":
            case "!=":
            case "||":
            case "&&":
            case ">":
            case "<":
            default:
                return false;
        }
    }
    
    public static void evalBinary(){
        RS_DO rs2 = (RS_DO) pila.pop();
        if (!pila.empty() && pila.peek().token=="operador"){
            RS_Operador operador = (RS_Operador) pila.pop();
            RS_DO rs1 = (RS_DO) pila.pop();        
            /*if(rs2.token != operador.token || operador.token != rs1.token){
                System.out.println("VALORES Y OPERADOR DIFERENTES");
                errores += "VALORES Y OPERADOR DIFERENTES: " + operador.token  + " en la línea: \n\r" ;
            }
            else{*/
                RS_DO nuevo = null;
                if(rs2.tipo == rs1.tipo & rs2.tipo == "constante"){
                    System.out.println(rs1.valor + operador.operador + rs2.valor);
                    int valor = calcularInt(rs1.valor, operador.operador, rs2.valor);
                    nuevo = new RS_DO("expresion", Integer.toString(valor), "constante");
                    System.out.println(valor);
                }
                else if (rs2.tipo == rs1.tipo && rs2.tipo == "direccion"){
                    if (!estaEnTS(rs1.valor) || !estaEnTS(rs2.valor )){
                        System.out.println("No existe variable");
                    } else {
                        CeldaTabla c1 = buscarEnTS(rs1.valor);
                        CeldaTabla c2 = buscarEnTS(rs2.valor);  
                        int valor = calcularInt(c1.valor, operador.operador, c2.valor);
                        nuevo = new RS_DO("expresion", Integer.toString(valor), "direccion");       
                    }                                     
                }
                else if (rs2.tipo == "direccion"){
                    if (!estaEnTS(rs2.valor)){
                        System.out.println("No existe variable");
                    } else {
                        CeldaTabla c2 = buscarEnTS(rs2.valor);  
                        int valor = calcularInt(rs1.valor, operador.operador, c2.valor);
                        nuevo = new RS_DO("expresion", Integer.toString(valor), "direccion");       
                    }                                     
                }
                else{
                    if (!estaEnTS(rs1.valor)){
                        System.out.println("No existe variable");
                    } else {
                        CeldaTabla c2 = buscarEnTS(rs1.valor);  
                        int valor = calcularInt(rs2.valor, operador.operador, c2.valor);
                        nuevo = new RS_DO("expresion", Integer.toString(valor), "direccion");       
                    } 
                }
                pila.push(nuevo);
            //}
        }else{
            pila.push(rs2);
        }
    }
    
    
    //if-else
    public static void startIf(){
        //System.out.println("startIf");
        RS_IF rsIf = new RS_IF("if", "Else_Label", "Exit_Label");
        pila.push(rsIf);
    }
    
    public static void testIf(){
        //System.out.println("testIf");
        //RS_DO rsDo = (RS_DO) pila.pop();
        codigoASM+= "codigo de evaluacion del RS_DO\n";
        RS_IF rsIf = (RS_IF) pila.pop();
        //Generar jump
        codigoASM += "jump condicional " + rsIf.labelElse + "\n";
        pila.push(rsIf);
    }
    
    public static void startElse(){
        //System.out.println("startElse");
        codigoElse = "\tjump Exit_Label\nElse_Label:\n";
    }
    
    public static void endIf(){
        //System.out.println("endIf");
        //Generar exit label
        codigoASM+= codigoElse + "\n";
        codigoASM+= "Exit_Label:\n";
        pila.pop();
    }
    
    
    //while
    public static void startWhile(){
        RS_WHILE rsWhile = new RS_WHILE("while", "While_Label", "Exit_Label");
        codigoASM+= rsWhile.labelWhile + ":\n";
        pila.push(rsWhile);
    }
    
    public static void testWhile(){
        //RS_DO rsDo = (RS_DO) pila.pop();
        codigoASM+= "\tcodigo de evaluacion del RS_DO\n";
        //Generar jump
        RS_WHILE rsWhile = (RS_WHILE) pila.pop();
        codigoASM+= "\tjump condicional a " + rsWhile.labelExit + "\n";
        pila.push(rsWhile);
    }
    
    public static void endWhile(){
        RS_WHILE rsWhile = (RS_WHILE) pila.pop();
        //Generar Jump
        codigoASM+= "\tjump " + rsWhile.labelWhile + "\n";
        //Generar label exit
        codigoASM+= rsWhile.labelExit + ":\n";
        //pila.pop();
    }
    
    
    
    //funciones
    public static void recuerdaTSFunc(){
        System.out.println("HOLAAAAAA");
        RS_Tipo rsTipo = (RS_Tipo) pila.pop();
        RS_Id rsId = (RS_Id) pila.pop();
        if (!estaEnTS(rsId.nombre)){
            System.out.println("En tabla FUNCION");
            tabla.add(new CeldaTabla(rsId.nombre, rsTipo.tipo, "funcion"));
        }
        else{
            errores += "SE REPITE LA FUNCION: " + rsId.nombre + " en la línea: \n\r";
            System.out.println("SE REPITE LA FUNCION: " + rsId.nombre);
        }
        imprimirTS();
    }
    
   
    
    
    /*
    //for
    public static void startFor(){
        RS_FOR rsFor = new RS_FOR("for", "For_Label", "Exit_Label");
        pila.push(rsFor);
    }
    
    public static void exp1For(){
        pila.pop();
        //Generar label
    }
    
    public static void exp2For(){
        RS_DO rsDO = (RS_DO) pila.pop();
        //Generar codigo segun RS_DO
        //Generar jump
        //Cambiar el archivo a uno temporal
        //Guardar el nombre del archivo en RS_FOR
    }
    
    public static void exp3For(){
        //Cambiar el archivo
        pila.pop();
    }
    
    public static void endFor(){
        //copiar el archivo de la exp3
        //eliminar el archivo temporal
        //Generar jump + for_label
        //Generar exit label
        pila.pop();
    }
    */
    
    //imprimir tabla
    public static void imprimirTS(){
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println("tipo: " + tabla.get(i).tipo + " | nombre: " + tabla.get(i).nombre);
        }
    }
}
