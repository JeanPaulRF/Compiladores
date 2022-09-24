package codigo;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Explorador.*;

public class Contar {
    public static void main (String[] args) throws FileNotFoundException, IOException{
        ContarToken contador = new ContarToken();
        File archivo = view.Explorador.seleccionar();
        Reader lector = new FileReader(archivo);
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            int linea = 1;
            String newLine = "NEW_LINE";
            System.out.println("Linea 1: ");
            while (true) {
                Tokens tokens = lexer.yylex();
                //System.out.println(tokens);
                if (tokens == null) {
                    resultado += "FIN";
                    for (int i = 0; i <  contador.tokens.size(); i++) {
                       System.out.println(contador.tokens.get(i).tipo + " " +contador.tokens.get(i).cantidad + " " +contador.tokens.get(i).token );
                        
                       
                    }
                    return;
                }
                switch (tokens) {
                    case ERROR: //cambiar luego 
                        resultado += "Simbolo no definido\n";
                        Simbolo err = new Simbolo("Error",1, lexer.lexeme);
                        contador.errores.add(err);
                        break;
                    default:
                        if (contador.tokens.isEmpty()){
                            contador.tokens.add(new Simbolo(tokens.toString(), 1,lexer.lexeme));
                            break;
                        }
                        boolean flag = false;
                        for (int i = 0; i < contador.tokens.size(); i++) {
                            if (contador.tokens.get(i).token.equals(lexer.lexeme)){
                                contador.tokens.get(i).cantidad ++;
                                flag = true;
                                break;
                            }
                        }
                        if (!flag){
                            flag = false;
                            contador.tokens.add(new Simbolo(tokens.toString(), 1, lexer.lexeme));
                        }
                        System.out.println(tokens.toString());
                        
                        if (newLine.equals(tokens.toString())){
                            linea = linea + 1;   
                            System.out.println("Linea "+linea+": ");                 
                        }
                            
                }
            }
                                                   
    }
}
