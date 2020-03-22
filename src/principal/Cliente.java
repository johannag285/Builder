/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import builder.Director;
import builder.Mensaje;
import builder.MensajeBuilder;
import builder.MensajeEmail;
import builder.MensajeJson;
import builder.MensajeXml;

/**
 *
 * @author Johannna
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
   // private static Director director = new Director();
    public static void main(String[] args) {
        // TODO code application logic here
   
        Director director = new Director();
        MensajeBuilder email = new MensajeEmail();
        MensajeBuilder json = new MensajeJson();
        MensajeBuilder xml = new MensajeXml();
        
        director.setMensajeBuilder(email);
        director.crearMensaje();
        Mensaje mensaje =  director.ImprimirMensaje();
        System.out.println(mensaje.toString());
    }
   
    
}
