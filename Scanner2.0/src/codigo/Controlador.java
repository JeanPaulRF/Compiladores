/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import view.*;
import codigo.*;
import java.awt.Point;

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

    public void seleccionar() {
        archivo = explorador.seleccionar();
    }

    public void scanearArchivo() {
        if (archivo == null) {
            return;
        }
        try {
            ContarToken contador = new ContarToken();
            Reader lector = new BufferedReader(new FileReader(archivo.getAbsolutePath()));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            int linea = 1;
            String newLine = "NEW_LINE";
            String coment_izq = "COMENTARIO_INICIO";
            String coment_der = "COMENTARIO_FIN";
            boolean comentario = true;
            // System.out.println("Linea 1: ");
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    for (int i = 0; i < contador.tokens.size(); i++) {
                        System.out.println("Tipo: " + contador.tokens.get(i).tipo + " Se repite: " + contador.tokens.get(i).cantidad + " Token: " + contador.tokens.get(i).token);

                        for (int j = 0; j < contador.tokens.get(i).lineas.size(); j++) {
                            System.out.println("Linea: " + contador.tokens.get(i).lineas.get(j).x + " Se repite: " + contador.tokens.get(i).lineas.get(j).y);

                        }

                    }
                    return;
                }
                switch (tokens) {
                    case NEW_LINE:
                        linea = linea + 1;
                        break;
                    case ERROR: //cambiar luego 
                        resultado += "Simbolo no definido\n";
                        Simbolo err = new Simbolo("Error", 1, lexer.lexeme);
                        contador.errores.add(err);
                        break;
                    default:
                        if (comentario) {
                            if (contador.tokens.isEmpty()) {
                                contador.tokens.add(new Simbolo(tokens.toString(), 1, lexer.lexeme));
                                contador.tokens.get(0).lineas.add(new Point(linea, 1));
                                break;
                            }
                            boolean flag = false;
                            for (int i = 0; i < contador.tokens.size(); i++) {
                                if (contador.tokens.get(i).token.equals(lexer.lexeme)) {
                                    contador.tokens.get(i).cantidad++;
                                    flag = true;
                                    if (contador.tokens.get(i).lineas.isEmpty()) {
                                        contador.tokens.get(i).lineas.add(new Point(linea, 1));
                                        break;
                                    }
                                    for (int j = 0; j < contador.tokens.get(i).lineas.size(); j++) {
                                        if (contador.tokens.get(i).lineas.get(j).x == linea) {
                                            contador.tokens.get(i).lineas.get(j).y++;
                                            break;
                                        } else {
                                            contador.tokens.get(i).lineas.add(new Point(linea, 1));
                                            break;
                                        }

                                    }
                                    //System.out.println(tokens.toString());
                                    break;
                                }
                            }
                            if (!flag) {
                                contador.tokens.add(new Simbolo(tokens.toString(), 1, lexer.lexeme));
                                Simbolo ultimo = contador.tokens.get(contador.tokens.size() - 1);
                                if (ultimo.lineas.isEmpty()) {
                                    ultimo.lineas.add(new Point(linea, 1));
                                } 
                                else {
                                    for (int i = 0; i < ultimo.lineas.size(); i++) {
                                        if (ultimo.lineas.get(i).x == linea) {
                                            ultimo.lineas.get(i).y++;

                                        } else {
                                            ultimo.lineas.add(new Point(linea, 1));
                                        }

                                    }
                                }
                                //System.out.println(tokens.toString());
                            }
                        }
                        if (coment_izq.equals(tokens.toString())) {
                            comentario = false;
                        }
                        if (coment_der.equals(tokens.toString())) {
                            comentario = true;
                        }
                }
            }

        } catch (Exception e) {
            return;
        }
    }

    public ArrayList<String> getTokens() {
        return arrayTokens;
    }

    public ArrayList<String> getErrores() {
        return arrayErrores;
    }
}
