/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author hiory
 */
public class ControlVenta {
    
   
        private static Connection conn;
        private PreparedStatement ps;
        private ResultSet rs;  
   
public void AgregarVenta (Venta venta , Detalle detalle) throws SQLException{
    

java.util.Date fecha = null; // crea objetos tipo util.Date y sql.Date
java.sql.Date fecha2 = null;

fecha = venta.getFecha_venta(); // convierte el string en util.Date
fecha2 = new java.sql.Date(fecha.getTime()); // convierte el util.Date en sql.Date

    
    
        Conexion e=new Conexion();
        conn = e.conectado();
        
        String sql="insert into venta (fecha,total) values(?,?)";
        ps = conn.prepareStatement(sql);
        ps.setDate(1, fecha2);
        ps.setFloat(2, venta.getTotal());
        ps.executeUpdate();
        
        
        //falta buscar el idventa y agregarlo en el detalle
           
}

int BuscarId (Venta venta) throws SQLException{
    
         Conexion e=new Conexion();
        conn = e.conectado();
        
        String sql="SELECT id_venta FROM venta WHERE";
        ps = conn.prepareStatement(sql);
        
        
        
        
            return 0;
    
        
    
}

}
