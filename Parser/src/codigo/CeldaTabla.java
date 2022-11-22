/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

/**
 *
 * @author jeanp
 */
public class CeldaTabla {
    public String nombre;
    public String tipo;
    public String valor;
    public String tagError;

    public CeldaTabla(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = "";
        this.tagError = "";
    }
}
