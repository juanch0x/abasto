/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hiory
 */
public class ControlProducto {
    
        private static Connection conn;
        private PreparedStatement ps;
        private ResultSet rs;  
   
    
    public void AgregarProducto (Producto producto) throws SQLException{
    
        Conexion e=new Conexion();
        conn = e.conectado();
        
        String sql="insert into producto (codigo,nombre,precio,cantidad,id_categoria) values(?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setLong(1, producto.getCodigo() );
        ps.setString(2, producto.getNombre());
        ps.setFloat(3, producto.getPrecio());
        ps.setInt(4, producto.getCantidad());
        ps.setInt(5, producto.getId_categoria());
        ps.executeUpdate();
             
}  

          public void ModificarProducto(Producto producto) throws ClassNotFoundException{
    
        try{
            
            Conexion e=new Conexion();
            conn = e.conectado();
            
            String query="UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=?, id_categoria=?  WHERE codigo=?";
            ps = conn.prepareStatement(query);
            ps.setLong(1, producto.getCodigo() );
            ps.setString(2, producto.getNombre());
            ps.setFloat(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setInt(5, producto.getId_categoria());
            ps.executeUpdate();
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

public void EliminarProducto(Long codigo) throws SQLException{
    
    try{
            Conexion e=new Conexion();
            conn = e.conectado();
    
            String sql="DELETE from producto WHERE codigo=?";
            
            ps = conn.prepareStatement(sql);
            ps.setLong(1, codigo);
            ps.executeUpdate();
    
    }catch (SQLException ex) {
            ex.printStackTrace();
        }
} 
          
          
          
}
