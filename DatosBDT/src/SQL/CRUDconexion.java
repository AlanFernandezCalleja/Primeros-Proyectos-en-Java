package SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Clase.Cliente;

public class CRUDconexion {
	ConexionSQL con = new ConexionSQL();
	Connection cc;
	Statement sfc;
	ResultSet rs;
	String name;
	String dir;
	
	Cliente cliente = new Cliente(null,null);
	public CRUDconexion(String name, String dir) {
		this.name= name;
		this.dir =dir;
	}
	
	public void insertar () {
		try {
			cc = con.getConexion(); //Create Connection to work
			sfc = cc.createStatement(); //Create Statement F  or Connection to make Queries
			String insertar = "INSERT INTO cliente (nombre,direccion) VALUES ('"+name + "','"+dir + "');";
			sfc.execute(insertar);//execute Queri...
			sfc.close();//close stament for connection
			cc.close();//close main connecion
			
			JOptionPane.showMessageDialog(null, "Datos ingresados con Exito", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e) {
			System.out.println("Error : "+ e);
		}
	}
	public Cliente buscar(String id) {
		try {
			cc = con.getConexion();
			sfc = cc.createStatement();
			String buscar= "Select * from cliente where id = "+id+";";
			
			rs = sfc.executeQuery(buscar);
			
			if (rs.next()) {
				
				cliente.setNombre(rs.getString("nombre"));
				cliente.setDireccion(rs.getString("direccion"));
			}else {
				
				cliente.setNombre("");
				cliente.setDireccion("");
			}
			
			sfc.close();//close stament for connection
			cc.close();
			rs.close();
			return cliente;
			
		} catch (Exception e) {
			System.out.println("error"+e);
			return cliente;
		}
	}
	
	
	public ArrayList<Cliente> listaClientes() {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		try {
			cc = con.getConexion();
			sfc = cc.createStatement();
			//Sentencia SQL
			String buscar= "Select * from cliente ;"; 
			
			rs = sfc.executeQuery(buscar);
			
			while(rs.next()) {
				Cliente client = new Cliente(rs.getString(2),rs.getString(3));
				listaClientes.add(client);
			}
			rs.close();
			sfc.close();
			cc.close();
			
			return listaClientes;
			
		} catch (Exception e) {
			
			System.out.println("error"+e);
			return listaClientes;
		}
	}
	
}
