/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 * Director
 * @author Johanna
 */
public class Director {

    private MensajeBuilder mensajeBuilder;
    
    public Director() {
    }

    public void setMensajeBuilder(MensajeBuilder mb) {
        this.mensajeBuilder = mb;
    }

   public Mensaje ImprimirMensaje(){
        return this.mensajeBuilder.getMensaje();
    }

    public void crearMensaje() {
        this.mensajeBuilder.crearNuevoMensaje();
        this.mensajeBuilder.buildEncabezado();
        this.mensajeBuilder.buildCuerpo();
        this.mensajeBuilder.buildPie();
    }
}
