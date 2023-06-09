package tienda.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    //Conectar a la base de datos
    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    
    
    //Desconectar a la base de datos
    protected void desconectarBase() throws Exception {
        try {
            if (conexion != null) {
                conexion.close();
            }
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    //Insertar modificar o eliminar
    protected void insertModifyDelete(String query) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        } finally {
            desconectarBase();
        }
    }
    
    
    //Consultar tablas
    protected void consultarBase(String query) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
        } catch (Exception e) {
        }
    }
    
}
