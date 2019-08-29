package clasesBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class usuariosDB {
    public boolean validaUsuario(String email,String password) throws SQLException
    {
         DBConexion conx = new DBConexion();
         
         String sql = "SELECT 1 FROM usuarios WHERE email = '" + email + "' AND password = '" + password + "'";
         
         try
         {
             Statement st = conx.getConexion().createStatement();
             ResultSet rs = st.executeQuery(sql);
             
             if(rs.next())
             {
                 return true;
             }
             return false;
             
         }
         catch (SQLException ex)
         {
             Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE,null,ex);
             return false;
         }
    }
}

