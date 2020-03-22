/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 * Abstract Builder
 * @author Johannna
 */
public abstract class MensajeBuilder {
      protected Mensaje mensaje;
      
       public Mensaje getMensaje(){
          return mensaje;
      }
       
      public void crearNuevoMensaje(){
       this.mensaje = new Mensaje();
      }
      
     
      public abstract void buildEncabezado();
      public abstract void buildCuerpo();
      public abstract void buildPie();
     
}
