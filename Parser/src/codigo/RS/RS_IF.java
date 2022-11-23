/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo.RS;

/**
 *
 * @author jeanp
 */
public class RS_IF extends RS{
    public String labelElse;
    public String labelExit;

    public RS_IF(String token, String labelElse, String labelExit) {
        this.token = token;
        this.labelElse = labelElse;
        this.labelExit = labelExit;
    }
    
}
