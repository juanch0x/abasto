
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
    
  /*  String sql2="DELETE FROM alumno WHERE id=?";
            conexion=Conexion.getConexion();
            
            ps=conexion.prepareStatement(sql2);
            ps.setString(1,p);
            ps.executeUpdate();
*/
    

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
}