package codigo;

import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import codigo.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class ContarToken {
    public ArrayList<Simbolo> tokens;
    public ArrayList<Simbolo> errores;

    public ContarToken() {
        this.tokens = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

}
