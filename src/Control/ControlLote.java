/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.Lote;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hiory
 */
public class ControlLote {
    
    
        private static Connection conn;
        private PreparedStatement ps;
        private ResultSet rs;  
   
public void AgregarLote (Lote lote) throws SQLException{
    

java.util.Date fecha = null; // crea objetos tipo util.Date y sql.Date
java.sql.Date fecha2 = null;

fecha = lote.getVencimiento(); // convierte el string en util.Date
fecha2 = new java.sql.Date(fecha.getTime()); // convierte el util.Date en sql.Date

    
    
        Conexion e=new Conexion();
        conn = e.conectado();
        
        String sql="insert into lote (lote,codigo,vencimiento) values(?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, lote.getLote());
        ps.setLong(2, lote.getCodigo());
        ps.setDate(3, fecha2);
        ps.executeUpdate();
             
}  

public void EliminarLote(Long codigo) throws SQLException{
    
    
            String sql="DELETE FROM lote WHERE codigo=?";
             Conexion e=new Conexion();
             conn = e.conectado();
            try {
                ps=conn.prepareStatement(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ControlLote.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps.setLong(1,codigo);
            ps.executeUpdate();
    
}
        
      public void ModificarLote(Lote lote) throws ClassNotFoundException{
    
     java.util.Date fecha = null; // crea objetos tipo util.Date y sql.Date
     java.sql.Date fecha2 = null;     
          
     fecha = lote.getVencimiento(); // convierte el string en util.Date
     fecha2 = new java.sql.Date(fecha.getTime()); // convierte el util.Date en sql.Date

        try{
            Conexion e=new Conexion();
            conn = e.conectado();
            String query="UPDATE lote SET lote=?, codigo=?, vencimiento=?  WHERE codigo=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, lote.getLote());
            ps.setLong(2, lote.getCodigo());
            ps.setDate(3, fecha2);
            ps.executeUpdate();
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



}
