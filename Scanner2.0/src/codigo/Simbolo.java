
package codigo;

import java.awt.Point;
import java.util.ArrayList;
/**
 *
 * @author Mauricio
 */
public class Simbolo {
    public String tipo;
    public String token;
    public int cantidad;
    public ArrayList<Point> lineas;
    public Simbolo(String tipo, int cantidad, String token) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        lineas = new ArrayList<>();
        this.token = token;
    }
    public String getTipo() {
        return tipo;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.tipo = token;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public ArrayList<Point> getLineas() {
        return lineas;
    }
    public void setLineas(ArrayList<Point> lineas) {
        this.lineas = lineas;
    }

}
