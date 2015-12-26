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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
      //  ps.setFloat(3, producto.getPrecio());
        ps.setInt(4, producto.getCantidad());
        ps.setInt(5, producto.getId_categoria());
        ps.executeUpdate();
             
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

public void CrearProducto (Producto producto) throws SQLException{
    
        Conexion e=new Conexion();
        conn = e.conectado();
        
        
        String sql="insert into producto (codigo,nombre,precio,precio_compra,id_categoria) values(?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setLong(1, producto.getCodigo() );
        ps.setString(2, producto.getNombre().toLowerCase());
        ps.setFloat(3, producto.getPrecio_v());
        ps.setFloat(4, producto.getPrecio_c());
        ps.setInt(5, producto.getId_categoria());
        ps.executeUpdate();
        
        
             
        }


public List <Producto> buscarProducto() throws ClassNotFoundException{
       
    List<Producto> productos = new ArrayList<Producto>();

        try {
            Conexion e=new Conexion();
            conn=e.conectado();
            
            String query="SELECT * FROM producto";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Producto producto = new Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setCodigo(Long.parseLong(rs.getString("codigo")));
                producto.setPrecio_c(Float.parseFloat(rs.getString("precio_c")));
                producto.setPrecio_v(Float.parseFloat(rs.getString("precio")));
                producto.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                productos.add(producto);
            }
            
        } catch (SQLException ex) {}
        return productos;
    }

public List <Producto> obtenerProductos() throws ClassNotFoundException{
        Conexion e=new Conexion();
        List <Producto> productos = new ArrayList<Producto>();
        try {
            conn = e.conectado();
            
            String query="SELECT * FROM producto";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto producto = new Producto();
                
                producto.setNombre(rs.getString("nombre"));
                producto.setCodigo(Long.parseLong(rs.getString("codigo")));
                producto.setPrecio_c(Float.parseFloat(rs.getString("precio_compra")));
                producto.setPrecio_v(Float.parseFloat(rs.getString("precio")));
                producto.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                
               
                
                productos.add(producto);
                
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return productos;
    }

public void AgregarStock (int cantidad, Long codigo, String lote, Date fecha) throws SQLException{
    
    /*Convirtiendo fecha*/
    
              
    java.sql.Date fecha_sql = new java.sql.Date(fecha.getTime());
   
    
        Conexion e=new Conexion();
        conn = e.conectado();
        
      //Actualizando el Stock
        
        String sql="UPDATE producto SET cantidad=? WHERE codigo=?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, cantidad);
        ps.setLong(2, codigo );
        System.out.println(cantidad);
        System.out.println(codigo);
    
        ps.executeUpdate();
        
        String sql_lote="insert into lote (lote,codigo,vencimiento) values(?,?,?)";
        ps = conn.prepareStatement(sql_lote);
        ps.setString(1, lote);
        ps.setLong(2, (codigo));
        ps.setDate(3, fecha_sql);
        
        ps.executeUpdate();
        }


public Producto busqueda(String producto) throws SQLException{
      
          Producto c=new Producto();
          
          Conexion e=new Conexion();
          
          conn = e.conectado();
          
           String query="SELECT * FROM producto WHERE nombre = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, producto);
            rs = ps.executeQuery();
            
            while(rs.next()){
            c.setCodigo(Long.parseLong(rs.getString("codigo")));
            c.setPrecio_v(Float.parseFloat(rs.getString("precio")));
            }
          
          return c;
      }

public boolean validarDatos(Long codigo) throws SQLException{

    boolean existe=false;
    Conexion e=new Conexion();
    conn = e.conectado();
    
       
    String query="SELECT count(*) AS existe FROM producto WHERE codigo = ?";
    ps = conn.prepareStatement(query);
    ps.setLong(1, codigo);
    rs = ps.executeQuery();
    while(rs.next()){
    if(rs.getInt(1)>=1){
        
        existe=true;
    }
    }
    
return existe;
}

public boolean validarDatos(String producto) throws SQLException{

    boolean existe=false;
    Conexion e=new Conexion();
    conn = e.conectado();
    
       
    String query="SELECT count(*) AS existe FROM producto WHERE nombre = ?";
    ps = conn.prepareStatement(query);
    ps.setString(1, producto);
    rs = ps.executeQuery();
    while(rs.next()){
    if(rs.getInt(1)>=1){
        
        existe=true;
    }
    }
    
return existe;
}

public Producto busqueda(Long codigo) throws SQLException{
      
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
            c.setPrecio_c(Float.parseFloat(rs.getString("precio_compra")));
            c.setId_categoria(Integer.parseInt(rs.getString("id_categoria")));
            c.setCodigo(Long.parseLong(rs.getString("codigo")));
            }
          
          return c;
      }

public void ModificarProducto(Producto producto) throws SQLException{

Conexion e = new Conexion();

e.conectado();

String query = "UPDATE producto SET nombre=?,precio=?,id_categoria=?,precio_compra=? WHERE codigo=?";

    ps = conn.prepareStatement(query);
    ps.setString(1, producto.getNombre());
    ps.setFloat(2, producto.getPrecio_v());
    ps.setInt(3, producto.getId_categoria());
    ps.setFloat(4, producto.getPrecio_c());
    ps.setLong(5, producto.getCodigo());
    
    ps.executeUpdate();
    
}

} 
          
          
          

