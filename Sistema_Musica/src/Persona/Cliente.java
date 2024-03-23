package Persona;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import GUI.InterfaceProgram;
import Product.Instrumento;
import SQL.ConexionSQL;

public class Cliente extends Persona implements InterfaceProgram{
	protected double descuento;
	
	protected ConexionSQL getterSQLcon = new ConexionSQL();
	protected Connection con = null;
	protected Statement sc;
	protected ResultSet rs;
	Connection cc;
	
	public Cliente(){
	};
	
	
	
	
	public Cliente(String name, String correo, String cel, String ci, Date registration) {
		super(name, correo, cel, ci, registration);
		// TODO Auto-generated constructor stub
	}




	public void addClient() {
		try {
			con = getterSQLcon.getConexionDataBase();
			sc = con.createStatement();
			String consult= "insert into cliente (nombre,correo,celular,\"FechaRegistro\",\"NIToCI\") VALUES ('"+name+"', '"+correo+"','"+cel+"', '"+registration+"','"+ci+"');";
			sc.execute(consult);
			
			sc.close();
			con.close();
			
			JOptionPane.showMessageDialog(null, "Se agrego el empleado Exitosamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
		} 
		catch (Exception e) 
		{
			
		}
	}
	
	public Cliente searchClient(String ciBuscado) {
		try {
			con = getterSQLcon.getConexionDataBase();
			sc= con.createStatement();
			String buscar= "Select * from cliente where  \"NIToCI\" = '123456789';";
			Cliente cliente= new Cliente(); 
			rs = sc.executeQuery(buscar);
			
			if (rs.next()) {
				
				cliente.setName(rs.getString(NOMBRE_CLIENTE));
				cliente.setCel(rs.getString(CELULAR_CLIENTE));
				cliente.setCi(rs.getString(CI_CLIENTE));
				cliente.setCorreo(rs.getString(CORREO_CLIENTE));
				cliente.setRegistration(rs.getDate(FECHA_CLIENTE));
				
				
				
			}else {
				
				
			}
			
			sc.close();//close stament for connection
			con.close();
			rs.close();
			return cliente;
			
		} catch (Exception e) {
			System.out.println("error"+e);
			return new Cliente();
		}
	}
	public ArrayList<Cliente> listaClientes(){
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		try {
			con = getterSQLcon.getConexionDataBase();
			sc = con.createStatement();
			String buscar= "SELECT * From cliente;";
			
			rs = sc.executeQuery(buscar);
			
			while(rs.next()) {
				//String model, String mark, double price, String instrumentName, cantidad
				Cliente cli = new Cliente();
				cli.setName(rs.getString(NOMBRE_CLIENTE));
				cli.setCel(rs.getString(CELULAR_CLIENTE));
				cli.setCi(rs.getString(CI_CLIENTE));
				cli.setCorreo(rs.getString(CORREO_CLIENTE));
				cli.setRegistration(rs.getDate(FECHA_CLIENTE));
				//Instrumento instrumento = new Instrumento();
				//System.out.println(rs.getString(5)); devuelve precio
				listaClientes.add(cli);
			}
			rs.close();
			sc.close();
			con.close();
			
			
			
		} catch (Exception e) {
			
			System.out.println("error"+e);
			
		}
		return listaClientes;
	}
	
	
}
