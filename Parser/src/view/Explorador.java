/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import javax.swing.*;

/**
 *
 * @author jeanp
 */
public class Explorador {

    public Explorador() {
    }
    

    public static File seleccionar() {
        File archivoSeleccionado;

        JFileChooser seleccionarArchivo;

        seleccionarArchivo= new JFileChooser();
        seleccionarArchivo.showOpenDialog(null);
        archivoSeleccionado = seleccionarArchivo.getSelectedFile();
        return(archivoSeleccionado);
    }
}
