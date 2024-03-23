package javadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
	//Connection cn;
	
	public ConexionSQL() {
		
	}
	public static Connection conectar() {
		String cadcon="jdbc:postgresql://localhost/DBT";
        String user="postgres";
        String password="admin";
       
    try{
    	Connection cn;
    	Class.forName("org.postgresql.Driver");
        cn =(Connection) DriverManager.getConnection(cadcon,user,password);
        System.out.println("Conexion Exitosa");
        return cn;
    }catch(SQLException e){
        System.out.println("Error sql: "+e.getMessage());
        return null;
    }catch (Exception e){
        System.out.println("Error: "+e.getMessage());
        return null;
        
    }
	}
}	
