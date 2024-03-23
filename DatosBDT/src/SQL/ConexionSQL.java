package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
	
	Connection conn;
	String url = "jdbc:postgresql://localhost/TestDB";
	String user = "postgres";
	String password = "admin";
	
	public Connection getConexion() {
		
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("Conexion Realizada");
			
		} catch (SQLException e) {
			System.out.println("Falla conexion");
			e.toString();
			
		} catch (Exception e2) {
			System.out.println("error");
			e2.toString();
			
		}
		return conn;
	}
}
