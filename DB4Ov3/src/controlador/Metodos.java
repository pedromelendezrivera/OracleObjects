/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import java.util.List;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import modelo.*;
/**
 *
 * @author PMELENDEZ
 */
public class Metodos {
       /**
     * Permite abrir la conexion a la base de datos que se utilizara
     * @param baseDatos el ObjectContainer de la base de datos
     */
    public static ObjectContainer AbrirConexion(ObjectContainer baseDatos){
        try{
            //Almacenar los Datos
             EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            //cascadeOnDelete elimina objetos relacionados
            // config.common().objectClass(Player.class).cascadeOnDelete(true);
             //Se abre la conexión a la base de objetos congreso.db4o
             baseDatos = Db4oEmbedded.openFile(config, "ejemploTeam.db4o");
    
        }catch(Exception e){System.out.println("error al abrir la conexion");}
        return baseDatos;
    }
    
     /**
     * Permite cerrar la conexion a la base de datos que se esta utilizando
     * @param baseDatos el ObjectContainer de la base de datos
     */
    public static void cerrarConexion(ObjectContainer baseDatos){
        try{
            baseDatos.close();
        }catch(Exception e){System.out.println("error al cerrar la conexion");}
    }
    
    /**
     * Permite almacenar un Jugador (Player) en la base de datos
     * @param baseDatos el objeto que representa la base de datos en la que se almacenara el Player
     * @param ponente el Player que se desea almacear en la base de datos
     */
    public static void almacenarPlayer(ObjectContainer baseDatos, Player player){
    try{
        baseDatos.store(player);
        System.out.println("Se ha almacenado correctamente el Jugador - Player");
    }catch(Exception e)
        {System.out.println("Se ha porducido un error en la insercion");}
    }
    
      /**
     * Imprime por pantalla el resultado de una consulta sin importar el metodo
     * de consulta
     *
     * @param resultado el objeto en el que se ha almacenado el resultado de la
     * consulta
     */
    public static void imprimirResultadoConsulta(ObjectSet resultado) {
        System.out.println("Recuperados " + resultado.size() + " Objetos");
        while (resultado.hasNext()) {
            System.out.println(resultado.next());
        }

    }
    
        /**
     * Permite hacer una consulta mediante Query-by-Example a partir de un squadNumber e
     * imprimirla por pantalla
     *
     * @param baseDatos la base de datos desde la que se va a operar
     * @param squadNumber el squadNumber del jugador - player que se quiere buscar
     */
    public static void consultarQBEPlayerSquadNumber(ObjectContainer baseDatos, int squadNumber) {
        Player player = new Player(null, squadNumber, 0.0f);
        ObjectSet resultado = baseDatos.queryByExample(player);
        imprimirResultadoConsulta(resultado);

    }
    
      /**
     * Permite hacer una consulta mediante Query-by-Example a partir de un
     * nombre e imprimirla por pantalla
     *
     * @param baseDatos la base de datos desde la que se va a operar
     * @param nombre el nombre - name  del player que se desea encontrar
     */
    public static void consultarQBEPlayerName(ObjectContainer baseDatos, String name) {
        Player player = new Player(name, 0, 0.0f);
        ObjectSet resultado = baseDatos.queryByExample(player);
        imprimirResultadoConsulta(resultado);
    } 
    
    
      /**
     * Permite almacenar un Equipo (Team) en la base de datos
     * @param baseDatos el objeto que representa la base de datos en la que se almacenara el Team
     * @param ponente el Team que se desea almacear en la base de datos
     */
    public static void almacenarTeam(ObjectContainer baseDatos, Team team){
    try{
        baseDatos.store(team);
        System.out.println("Se ha almacenado correctamente el Equipo - Team");
    }catch(Exception e)
        {System.out.println("Se ha porducido un error en la insercion");}
    }
    
   /**
     * Permite hacer una consulta mediante Query-by-Example e imprimirla por pantalla
     *
     * @param baseDatos la base de datos desde la que se va a operar
     */
    public static void consultarQBEPObjetos(ObjectSet objeto) {
             imprimirResultadoConsulta(objeto);
        }
//        Player player = new Player(name, 0, 0.0f);
//        ObjectSet resultado = baseDatos.queryByExample(player);
//        imprimirResultadoConsulta(resultado);
    
    
       
    
 }


