package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class conexion {
	String option;
	public conexion (String option) {
		this.option = option;
	}
	public Connection Conexion() throws SQLException {
		String url = "jdbc:postgresql://localhost/TestDB";
		//Properties props = new Properties();
		String user = "postgres";
		String password = "admin";
		Connection conn = DriverManager.getConnection(url, user, password);
		if (conn !=null) {
			System.out.println("Conexion Exitosa");
			
		}else {
			System.out.println("No hubo conexion");
		}
		Statement st = conn.createStatement();
		
		try {
			ResultSet rs = st.executeQuery("SELECT * FROM "+option+" where id between 1 and 10");
			while (rs.next()) {
			    
			    System.out.print(rs.getInt(1) + "\t");
			    System.out.println(rs.getString(2));
			    
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Tabla no existe");
		}
		
		
		
		
		
		st.close();
		
		
		
		return conn;
	}
}
