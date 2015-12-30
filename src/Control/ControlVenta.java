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
import java.util.List;


/**
 *
 * @author hiory
 */
public class ControlVenta {
    
   
        private static Connection conn;
        private PreparedStatement ps;
        private ResultSet rs;  
   
public void AgregarVenta (Venta venta , List<Detalle> detalle) throws SQLException{
    

java.util.Date fecha = null; // crea objetos tipo util.Date y sql.Date
java.sql.Date fecha2 = null;

fecha = venta.getFecha_venta(); // convierte el string en util.Date
fecha2 = new java.sql.Date(fecha.getTime()); // convierte el util.Date en sql.Date

int clave=0;    
    
        Conexion e=new Conexion();
        conn = e.conectado();
        
        String sql="insert into venta (fecha_venta,total) values(?,?)";
        ps = conn.prepareStatement(sql);
        ps.setDate(1, fecha2);
        ps.setFloat(2, venta.getTotal());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        while(rs.next()){ 
        clave=rs.getInt(1);
        }
        
        
        
        for(int i = 0 ; i < detalle.size() ; i++){
        sql = "insert into detalle (codigo,cantidad,id_venta,numero_item) values(?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setLong(1, detalle.get(i).getCodigo());
        ps.setInt(2, detalle.get(i).getCantidad());
        ps.setInt(3, clave);
        ps.setInt(4, i);
        ps.executeUpdate();
        }
        
        
        
        for(int i=0 ; i< detalle.size() ; i++){
        
        sql="UPDATE producto SET cantidad=cantidad-? WHERE codigo=?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, detalle.get(i).getCantidad());
        ps.setLong(2, detalle.get(i).getCodigo());
        ps.executeUpdate();
        }
           
}

int BuscarId (Venta venta) throws SQLException{
    
         Conexion e=new Conexion();
        conn = e.conectado();
        
        String sql="SELECT id_venta FROM venta WHERE";
        ps = conn.prepareStatement(sql);
        
        
        
        
            return 0;
    
        
    
}

public Producto BuscarPorCodigo(Long codigo) throws SQLException{

            Producto c=new Producto();
          
            Conexion e=new Conexion();
          
          conn = e.conectado();
          
           String query="SELECT * FROM producto WHERE codigo = ?";
            ps = conn.prepareStatement(query);
            ps.setLong(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
            c.setNombre(rs.getString("nombre"));
            c.setPrecio_v(Float.parseFloat(rs.getString("precio")));
            c.setCantidad(Integer.parseInt(rs.getString("cantidad")));
            }
          
          return c;
    
}

}
