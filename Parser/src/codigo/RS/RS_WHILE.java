/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo.RS;

/**
 *
 * @author jeanp
 */
public class RS_WHILE extends RS{
    public String labelWhile;
    public String labelExit;

    public RS_WHILE(String token, String labelWhile, String labelExit) {
        this.token = token;
        this.labelWhile = labelWhile;
        this.labelExit = labelExit;
    }
    
}
