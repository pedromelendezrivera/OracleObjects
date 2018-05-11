/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import controlador.Metodos;
import modelo.Player;

/**
 *
 * @author PMELENDEZ
 */
public class SuprimirObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjectContainer baseDatos = null;
           try{
                  baseDatos  = Metodos.AbrirConexion(baseDatos);
       
                 Player p = new Player("Juan Perez", 0, 0.0f);
                 ObjectSet result = baseDatos.queryByExample(p);
                 Player found = (Player)result.next();
                 baseDatos.delete(found);
           }finally {
            Metodos.cerrarConexion(baseDatos);
        } 
        
    }
    
}
