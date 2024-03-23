package javadatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Usuario {
	String nombre;

	public Usuario(String nombre) {
		//super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void insertarDatos(Connection con) {
		try {
			Statement stmnt = con.prepareStatement("insert into usuarios (nombre)values ('"+nombre+"');");
			//stmnt.executeQuery(nombre);
			System.out.println("se agrego el dato");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
