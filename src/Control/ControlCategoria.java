
package Control;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juanch0x
 */
public class ControlCategoria {
 
        private static Connection conn;
        private PreparedStatement ps;
        private ResultSet rs;
        
    //Conexion conn = new Conexion();
            String name = "panificado";

    public void agregarCategoria(Categoria categoria) throws SQLException {
        
       
        Conexion e=new Conexion();
        conn = e.conectado();
        
        String sql="insert into categoria (categoria) values(?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, categoria.getCategoria());
        ps.executeUpdate();
             
        
    }
    

    

public List <Categoria> obtenerCategorias() throws ClassNotFoundException{
        Conexion e=new Conexion();
        List <Categoria> categoria = new ArrayList<Categoria>();
        try {
            conn = e.conectado();
            
            String query="SELECT * FROM categoria";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Categoria cat = new Categoria();
                
                cat.setId_categoria(Integer.parseInt(rs.getString("id_categoria")));
                cat.setCategoria(rs.getString("categoria"));
                categoria.add(cat);
                
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return categoria;
    }

      public List <Categoria> buscarCategoria() throws ClassNotFoundException{
       
    List<Categoria> categorias = new ArrayList<Categoria>();

        try {
            Conexion e=new Conexion();
            conn=e.conectado();
            
            String query="SELECT * FROM categoria";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Categoria categoria = new Categoria();
                categoria.setCategoria(rs.getString("categoria"));
                categoria.setId_categoria(Integer.parseInt(rs.getString("id_categoria")));
                categorias.add(categoria);
            }
            
        } catch (SQLException ex) {}
        return categorias;
    }
      
      public Categoria busqueda(String categoria) throws SQLException{
      
          Categoria c=new Categoria();
          
          Conexion e=new Conexion();
          
          conn = e.conectado();
          
           String query="SELECT * FROM categoria WHERE categoria = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, categoria);
            rs = ps.executeQuery();
            
            while(rs.next()){
            c.setCategoria(rs.getString("categoria"));
            c.setId_categoria(Integer.parseInt(rs.getString("id_categoria")));
            }
          
          return c;
      }

public void modificarCategoria(Categoria categoria) throws SQLException{

    Conexion e = new Conexion();
    conn = e.conectado();
    
    String query="UPDATE categoria SET categoria=? WHERE id_categoria=?";
    ps = conn.prepareStatement(query);
    ps.setString(1, categoria.getCategoria());
    ps.setInt(2, categoria.getId_categoria());
    ps.executeUpdate();
    
    
    
}
    
       
}