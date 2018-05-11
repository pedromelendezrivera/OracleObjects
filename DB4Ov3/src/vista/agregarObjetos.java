/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;
import controlador.Metodos;
import modelo.Player;

/**
 *
 * @author PMELENDEZ
 */
public class agregarObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ObjectContainer baseDatos = null;
        try{
            baseDatos  = Metodos.AbrirConexion(baseDatos);
      
          Player p1 = new Player("Barry Bonds", 25, 0.362f);
          Player p2 = new Player("Marquis Grissom", 9, 0.279f);
          Metodos.almacenarPlayer(baseDatos, p1);
           Metodos.almacenarPlayer(baseDatos, p2);
      
          }finally {
            Metodos.cerrarConexion(baseDatos);
        } 
    
   }
}
