package SQL;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
//iron Branch
public class ConexionSQL {
	Connection conector= null;
	String url = "jdbc:postgresql://localhost/tiendaInstrumentos";
	String user = "postgres";
	String password = "admin";
	public Connection getConexionDataBase() {
		
		try {
			Class.forName("org.postgresql.Driver");
			conector = DriverManager.getConnection(url,user,password);
			System.out.println("Conexion Correcta");
			
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
		return conector;
	}
	
	
	
}	
