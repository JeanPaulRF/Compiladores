/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.io.File;
import javax.swing.*;

/**
 *
 * @author jeanp
 */
public class Explorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivoSeleccionado;

        JFileChooser seleccionarArchivo;

        seleccionarArchivo= new JFileChooser();
        seleccionarArchivo.showOpenDialog(null);
        archivoSeleccionado = seleccionarArchivo.getSelectedFile();
        System.out.println(archivoSeleccionado+"");
    }
    
}
