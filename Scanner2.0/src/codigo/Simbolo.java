
package codigo;

import java.awt.Point;
import java.util.ArrayList;
/**
 *
 * @author Mauricio
 */
public class Simbolo {
    public String token;
    public int cantidad;
    public ArrayList<Point> lineas;
    public Simbolo(String token, int cantidad) {
        this.token = token;
        this.cantidad = cantidad;
        lineas = new ArrayList<>();
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
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
