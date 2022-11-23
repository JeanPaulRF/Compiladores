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

/**
 *
 * @author jeanp
 */
public abstract class Semantic {
    public static Stack<RS> pila = new Stack<RS>();
    public static ArrayList<CeldaTabla> tabla = new ArrayList<CeldaTabla>();
    
    //DECLARACION
    public static void recuerdaTipo(String tipo){
        RS_Tipo rsTipo = new RS_Tipo("TDato", tipo);
        pila.push(rsTipo);
        //System.out.println("EL TIPO ES: " + token);
    }
    
    public static void recuerdaId(String nombre){
        RS_Id rsId = new RS_Id("identificador", nombre);
        pila.push(rsId);
    }
    
    public static void recuerdaTS(){
        RS_Tipo rsTipo = (RS_Tipo) pila.pop();
        while(!pila.isEmpty() && pila.peek().token == "identificador"){
            RS_Id rsId = (RS_Id) pila.pop();
            if (!estaEnTS(rsId.nombre))
                tabla.add(new CeldaTabla(rsId.nombre, rsTipo.tipo));
            else
                System.out.println("SE REPITE LA VARIABLE: " + rsId.nombre);
            
        }
        imprimirTS();
    }
    
    private static boolean estaEnTS(String token){
        for (int i = 0; i < tabla.size(); i++){
            if((tabla.get(i).nombre.equals(token))) {
                return true; 
            }
        }
        return false;
    }
    
    
    
    //EXPRESION
    public static void recuerdaConstExp(String valor){
        RS_DO rsDo = new RS_DO("expresion", valor, "constante");
        pila.push(rsDo);
    }
    
    
    public static void recuerdaVarExp(String nombre){
        RS_DO rsDo = new RS_DO("expresion", nombre, "direccion");
        if(!estaEnTS(nombre)){
            CeldaTabla celda = new CeldaTabla(rsDo.valor, rsDo.tipo);
            celda.tagError = "Variable no declarada";
            tabla.add(celda);
            System.out.println("VARIABLE NO DECLARADA: " + nombre);
        }
        pila.push(rsDo);
    }
    
    
    public static void recuerdaOperExp(String operador){
        RS_Operador rsOp = new RS_Operador("expresion", operador);
        pila.push(rsOp);
    }
    
    
    public static void evalBinary(){
        RS_DO rs2 = (RS_DO) pila.pop();
        RS_Operador operador = (RS_Operador) pila.pop();
        RS_DO rs1 = (RS_DO) pila.pop();
        if(rs2.token != operador.token || operador.token != rs1.token)
            System.out.println("VALORES Y OPERADOR DIFERENTES");
        else{
            RS_DO nuevo = null;
            if(rs2.tipo == rs1.tipo & rs2.tipo == "constante"){
                ScriptEngineManager manager = new ScriptEngineManager(); 
                ScriptEngine interprete = manager.getEngineByName("js"); 
                try { 
                    String valor = (String) interprete.eval(rs1.valor + operador.operador + rs2.valor); 
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
    
    
    public static void startIf(){
        RS_IF rsIf = new RS_IF("if", "Else_Label", "Exit_Label");
        pila.push(rsIf);
    }
    
    public static void testIf(){
        RS_DO rsDo = (RS_DO) pila.pop();
        //Generar codigo
        //Generar jump
    }
    
    public static void startElse(){
        //Generar jump
        //Generar else label
    }
    
    public static void endIf(){
        //Generar exit label
        pila.pop();
    }
    
    
    
    //imprimir tabla
    public static void imprimirTS(){
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println("tipo: " + tabla.get(i).tipo + " | nombre: " + tabla.get(i).nombre);
        }
    }
}