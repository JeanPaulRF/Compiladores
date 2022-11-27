package codigo;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mauricio
 */
public class escribirEnsamblador {
    public static void escribirTraduccion(String codigo, String nombre) {
    try {
      File myObj = new File("C:/Compiladores/Parser/src/ensamblador/"+nombre+".asm");
      FileWriter writer = new FileWriter("C:/Compiladores/Parser/src/ensamblador/"+nombre+".asm");
      writer.write(codigo);
      writer.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
