/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 * Product
 * @author Johanna
 */
public class Mensaje {
    
    private String encabezado;
    private String cuerpo;
    private String pie;

    public Mensaje() {
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }


    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }


    public void setPie(String pie) {
        this.pie = pie;
    }   
   
    @Override
    public String toString(){
       return "Mensaje: " + " encanezado= " + encabezado + ", cuerpo= " + cuerpo + ", piePagina= " + pie ;
    }
    
}
