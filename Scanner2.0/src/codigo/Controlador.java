/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import view.*;
import codigo.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.FilerException;

/**
 *
 * @author jeanp
 */
public class Controlador {
    Pantalla pantalla;
    Explorador explorador;
    public File archivo;
    ArrayList<String> arrayTokens;
    ArrayList<String> arrayErrores;

    public Controlador(Pantalla pantalla) {
        this.pantalla = pantalla;
        explorador = new Explorador();
        arrayTokens = new ArrayList<String>();
        arrayErrores = new ArrayList<String>();
    }
    
    public void seleccionar(){
        archivo = explorador.seleccionar();
    }
    
    public void scanearArchivo(){
        if(archivo == null) return;
        try {
            Reader lector = new BufferedReader(new FileReader(archivo.getAbsolutePath()));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        arrayErrores.add("Simbolo no definido\n");
                        break;
                    case IDENTIFICADOR: case LITERAL_ENTERO: case PALABRA_RESERVADA:
                        arrayTokens.add(lexer.lexeme + ": Es un " + tokens + "\n");
                        break;
                    case  NEW_LINE:
                        break;
                    default:
                        arrayTokens.add("Token: " + tokens + "\n");
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> getTokens(){
        return arrayTokens;
    }
    
    public ArrayList<String> getErrores(){
        return arrayErrores;
    }
}
