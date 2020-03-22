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
public class MensajeJson extends  MensajeBuilder{

    @Override
    public void buildEncabezado() {
      mensaje.setEncabezado("Bogotá 18/02/2020");
    }

    @Override
    public void buildCuerpo() {
      mensaje.setCuerpo("Ejemplo builder mensaje tipo Json");
    }

    @Override
    public void buildPie() {
      mensaje.setPie("Corporation Inc");
    }
    
}
