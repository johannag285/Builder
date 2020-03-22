/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 * Cocrete builder
 * @author Johanna
 */
public class MensajeEmail extends MensajeBuilder{

    @Override
    public void buildEncabezado() {
       mensaje.setEncabezado("Bogotá 2020");
    }

    @Override
    public void buildCuerpo() {
       mensaje.setCuerpo("Ejemplo builder mensaje tipo e-mail");
    }

    @Override
    public void buildPie() {
        mensaje.setPie("Corporation");
    }
    
}
