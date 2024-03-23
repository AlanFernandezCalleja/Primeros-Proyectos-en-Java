package Tienda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Cliente {
	private String Nombre;
	private String CI;
	private String Direccion;
	
	public Cliente(String nombre, String cI, String direccion) {
		super();
		Nombre = nombre;
		CI = cI;
		Direccion = direccion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCI() {
		return CI;
	}
	public void setCI(String cI) {
		CI = cI;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	@Override
	public String toString() {
		return "Cliente [Nombre=" + Nombre + ", CI=" + CI + ", Direccion=" + Direccion + "]";
	}
	
	public void crear() {
		try {
			Cliente persona=null;
			FileWriter fichero = new FileWriter("Cliente.txt",true);
			PrintWriter escritor = new PrintWriter(fichero);
			int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Clientes Va a Ingresar?"));
			for (int i = 0;  i<n ; i++) {
				String nombre =(String) JOptionPane.showInputDialog("Ingrese nombre del cliente "+(i+1)+" :");
				String CI=(String) JOptionPane.showInputDialog("CI del cliente "+(i+1)+" :");
				String Direccion=(String) JOptionPane.showInputDialog("Direccion del cliente "+(i+1)+" :");
				persona.setCI(CI);
				persona.setNombre(nombre);
				persona.setDireccion(Direccion);
				escritor.println(persona);
			}
			fichero.close();
		} 
		catch (IOException e) {
			// imporime pila de ejecucion
			e.printStackTrace();
		}
		
		
	}
	
	
}
