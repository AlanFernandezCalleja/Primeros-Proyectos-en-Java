package Serializacion;

import java.util.ArrayList;

public class Main {
	//No olvidar el throws IOExeption
	public static void main(String[] args) {
		//el metodo leer personas reotorna un arrayList para ser leido.
		//usa el metodo sin instanciar clase, solo se pasa el nombre del archivo.
		ArrayList<Persona> personas = Persona.leerPersonas("persona.txt");
		//como el metodo e sstatic no es necesario instanciar la clase
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		//para crear o reemplazar un archivo.
		
		
		
		
	}
	
	
}
