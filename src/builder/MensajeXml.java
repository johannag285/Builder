/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 * Cocrete builder
 * @author Johannna
 */
public class MensajeXml extends MensajeBuilder{

    @Override
    public void buildEncabezado() {
        mensaje.setEncabezado("Bogotá 19/02/202");
    }

    @Override
    public void buildCuerpo() {
       mensaje.setCuerpo("Ejemplo builder mensaje tipo XML");
    }

    @Override
    public void buildPie() {
        mensaje.setPie("Corporation 2020");
    }
    
}
