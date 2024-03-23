package Persona;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import GUI.InterfaceProgram;
import Product.Instrumento;
import SQL.ConexionSQL;

public class Empleado extends Persona implements InterfaceProgram{
	protected ConexionSQL getterSQLcon = new ConexionSQL();
	protected Connection con = null;
	protected Statement sc;
	protected ResultSet rs;
	protected double salary;
	protected int edad;
	
	

	public Empleado() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(String name, String correo, String cel, String ci, Date registration) {
		super(name, correo, cel, ci, registration);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void addEmployer() {
		try {
			con = getterSQLcon.getConexionDataBase();
			sc = con.createStatement();
			String consult= "INSERT INTO empleado (nombre, correo,edad,celular,\"FechaIngreso\",ci,salario)values ('"+name+"','"+correo+"','"+edad+"','"+cel+"','"+registration+"','"+ci+"','"+salary+"');";
			sc.execute(consult);
			
			sc.close();
			con.close();
			
			JOptionPane.showMessageDialog(null, "Se agrego el empleado Exitosamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
		} 
		catch (Exception e) 
		{
			System.out.println("Error : " + e );
		}
	}
	public void showEmployers() 
	{
		try {
			con = getterSQLcon.getConexionDataBase();
			sc = con.createStatement();
			String consult= "SELECT * FROM empleado WHERE id = 1;";
			sc.execute(consult);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteEmployer() {
		
	}
	public Empleado searchEmployer(String codEmployee) {
		try {
			con = getterSQLcon.getConexionDataBase();
			sc= con.createStatement();
			String buscar= "Select * from empleado where  ci = '"+codEmployee+"';";
			Empleado empleado= new Empleado(); 
			rs = sc.executeQuery(buscar);
			
			if (rs.next()) {
				
				empleado.setName(rs.getString(NOMBRE_EMPLEADO));
				empleado.setCel(rs.getString(CELULAR_EMPLEADO));
				empleado.setCi(rs.getString(CI_EMPLEADO));
				empleado.setCorreo(rs.getString(CORREO_EMPLEADO));
				empleado.setRegistration(rs.getDate(FECHA_EMPLEADO));
				empleado.setEdad(rs.getInt(EDAD_EMPLEADO));
				empleado.setSalary(rs.getDouble(SALARIO_EMPLEADO));
				
				
				
				
			}else {
				
				
			}
			
			sc.close();//close stament for connection
			con.close();
			rs.close();
			return empleado;
			
		} catch (Exception e) {
			System.out.println("error"+e);
			return new Empleado();
		}
	}
	
	public ArrayList<Empleado> listaEmpleados(){
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		try {
			con = getterSQLcon.getConexionDataBase();
			sc = con.createStatement();
			String buscar= "select * from empleado;";
			///VOlVEREMOS
			rs = sc.executeQuery(buscar);
			
			while(rs.next()) {
				//String model, String mark, double price, String instrumentName, cantidad
												
				Empleado empleado = new Empleado();
				empleado.setName(rs.getString(NOMBRE_EMPLEADO));
				empleado.setCel(rs.getString(CELULAR_EMPLEADO));
				empleado.setCi(rs.getString(CI_EMPLEADO));
				empleado.setCorreo(rs.getString(CORREO_EMPLEADO));
				empleado.setRegistration(rs.getDate(FECHA_EMPLEADO));
				empleado.setEdad(rs.getInt(EDAD_EMPLEADO));
				empleado.setSalary(rs.getDouble(SALARIO_EMPLEADO));
				//Instrumento instrumento = new Instrumento();
				//System.out.println(rs.getString(5)); devuelve precio
				listaEmpleados.add(empleado);
			}
			rs.close();
			sc.close();
			con.close();
			
			return listaEmpleados;
			
		} catch (Exception e) {
			
			System.out.println("error"+e);
			return listaEmpleados;
		}
	}
	
	
	
}
