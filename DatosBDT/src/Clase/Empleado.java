package Clase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Interfaces.Colors;
import SQL.ConexionSQL;

public class Empleado {
	Connection con;
	Statement sc;
	ResultSet rs;
	
	private static String name;
	private static String dir;
	private static double salary;
	
	
	
	
	public void setNewEmployer(String name, String dir, String salary) {
		
		try {
			con = new ConexionSQL().getConexion();
			sc = con.createStatement();
			String consult = "INSERT INTO empleado VALUES";
			sc.execute(consult);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	public void setNewSalary() {};
	public void deleteEmployer() {};
	
	
	
}
