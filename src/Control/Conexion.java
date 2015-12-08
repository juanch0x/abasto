/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.*;
//LALALA
/**
 *
 * @author ANDRES
 */
public class Conexion {

  // private static Connection conn;
   
   
   private final String url = "jdbc:mysql://localhost/abasto";
   private final String dbuser = "root";
   private final String dbpwd = "";
   
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    
    public Conexion() {
     try{  
         
         Class.forName("com.mysql.jdbc.Driver");
         
         con = DriverManager.getConnection(url,dbuser,dbpwd);
         if (con!=null){
            System.out.println("Conexión a base de datos facturacion. listo");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");

    } 

    
}
