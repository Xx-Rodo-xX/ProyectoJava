package clasesBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConexion {
    private Connection con;
    
    public DBConexion() throws SQLException
    {
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         String db = "jdbc:mysql://localhost/ventas";
         con = (com.mysql.jdbc.Connection) DriverManager.getConnection(db,"rood","");
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE,null,ex);
        }
    } 
    public Connection getConexion()
    {
        return this.con;
    }
    public void cerrarConexion()
    {
        try
        {
            con.close();
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
