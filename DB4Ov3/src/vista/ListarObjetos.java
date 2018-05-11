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
public class ListarObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjectContainer baseDatos = null;
        try{
            baseDatos  = Metodos.AbrirConexion(baseDatos);
       
            Query q = baseDatos.query();
            ObjectSet result = q.execute();
            while(result.hasNext()) {
            // Print Player
            Player p = (Player) result.next();
            System.out.println(p); 
            }
           }finally {
            Metodos.cerrarConexion(baseDatos);
        } 
    }
}
    

