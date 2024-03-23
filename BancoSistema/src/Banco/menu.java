package Banco;

public class menu {
	String menu = "MENU DE OPCIONES:\n"
				+"1.\tAtencion Normal.\n"
				+"2.\tAtencion Preferencial.\n"
				+"3.\tAtencion Persona de la Tercera Edad.\n"
				+"4.\tAtender al cliente."
				+"5.\tMostrar las listas."
				+"6.\tSalir.";
	
	public void show_opciones() {
		System.out.println(menu);
	}
	public void show_message(String info){
	    System.out.println("Se atendio al cliente : "+ info);
	}
}
