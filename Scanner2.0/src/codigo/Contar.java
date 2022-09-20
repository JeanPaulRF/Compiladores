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
            while (true) {
                Tokens tokens = lexer.yylex();
                //System.out.println(tokens);
                if (tokens == null) {
                    resultado += "FIN";
                    for (int i = 0; i <  contador.tokens.size(); i++) {
                       System.out.println(contador.tokens.get(i).token + contador.tokens.get(i).cantidad);
                       
                    }
                    return;
                }
                switch (tokens) {
                    case ERROR: //cambiar luego 
                        resultado += "Simbolo no definido\n";
                        Simbolo err = new Simbolo("Error",1);
                        contador.errores.add(err);
                        break;
                    default:
                        if (contador.tokens.isEmpty())
                            contador.tokens.add(new Simbolo(tokens.toString(), 1));
                        boolean flag = false;
                        for (int i = 0; i < contador.tokens.size(); i++) {
                            if (contador.tokens.get(i).token.equals(tokens.toString())){
                                contador.tokens.get(i).cantidad ++;
                                flag = true;
                                break;
                            }
                        }
                        if (!flag){
                            flag = false;
                            contador.tokens.add(new Simbolo(tokens.toString(), 1));
                        }
                }
            }
                                                   
    }
}
