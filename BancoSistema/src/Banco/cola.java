package Banco;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class cola {
	private nodo inicioCola, finalCola;
	String Cola = "";
	private String[] tipo = {"Normal","Preferencial","Tercera Edad"};
	private String user = "";
	public cola() {
		inicioCola = null;//inicialmente no existe ningun nodo
		finalCola = null;//ningun nodo existe
	}
	//si esta vacia
	public boolean vacia() {
		return inicioCola == null && finalCola == null;
	}
	//insertar
	public void insertar(int numero) {
		nodo nuevo_nodo = new nodo();
		if (user == "Normal") {
			nuevo_nodo.informacion = "U-00"+numero;
		}else if(user == "Preferencial") {
			nuevo_nodo.informacion = "P-00"+numero;
		}else if (user == "Tercera Edad"){
			nuevo_nodo.informacion = "TE-00"+numero;
		}
		
		//nuevo_nodo.informacion = "00"+numero;
		nuevo_nodo.siguiente = null;//a donde debe apuntar
		
		if (vacia()) {
			inicioCola = nuevo_nodo;
			finalCola = nuevo_nodo;
			
		}else {
			finalCola.siguiente = nuevo_nodo;
			finalCola = nuevo_nodo;
			
		}	
	}
	
	public String extraer() {
		if (!vacia()) {
			String informacion = inicioCola.informacion;
			
			if(inicioCola == finalCola) {
				inicioCola = finalCola=null;
			}else {
				inicioCola = inicioCola.siguiente;
			}
			
			return informacion;
		}else {
			return "Cola Vacia";
		}
	}
	
	public void MostrarContenido() {
		nodo recorrido = inicioCola;
		String ColaInvertida = "";
		if (inicioCola == null &&finalCola == null) {
			System.out.println("Cola vacia");;
		}else {
			while (recorrido!=null) {
				Cola += recorrido.informacion + " ";
				recorrido = recorrido.siguiente;
				
			}
			String cadena [] = Cola.split(" ");
			for (int i = cadena.length - 1 ; i>=0;i--) {
				ColaInvertida += " " + cadena[i];
			}
			System.out.println(ColaInvertida);
			Cola = "";	
		}	
	}
	public void setUser(int a) {
		user = tipo[a];	
	}
	
}
