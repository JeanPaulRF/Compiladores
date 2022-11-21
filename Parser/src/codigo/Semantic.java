/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author jeanp
 */
public abstract class Semantic {
    public static Stack<RS> pila = new Stack<RS>();
    public static ArrayList<CeldaTabla> tabla = new ArrayList<CeldaTabla>();
    
    //DECLARACION
    public static void recuerdaTipo(String token){
        RS registro = new RS("TDato", token);
        pila.push(registro);
        //System.out.println("EL TIPO ES: " + token);
    }
    
    public static void recuerdaId(String token){
        RS registro = new RS("identificador", token);
        pila.push(registro);
    }
    
    public static void recuerdaTS(){
        RS tipo = pila.pop();
        while(!pila.isEmpty() && pila.peek().nombre == "identificador"){
            RS id = pila.pop();
            if (!estaEnTS(id.token)){
                CeldaTabla celda = new CeldaTabla(id.token, tipo.token);
                tabla.add(celda);
            }
            else{ 
                System.out.println("SE REPITE LA VARIABLE: " + id.token);
            }
        }
        imprimirTS();
    }
    
    private static boolean estaEnTS(String token){
        for (int i = 0; i < tabla.size(); i++){
            System.out.println(tabla.get(i).nombre + "" + token);
            if(tabla.get(i).nombre == token) {
                return true; 
            }
        }
        return false;
    }
    
    public static void imprimirTS(){
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println("tipo: " + tabla.get(i).tipo + " | nombre: " + tabla.get(i).nombre);
        }
    }
}
