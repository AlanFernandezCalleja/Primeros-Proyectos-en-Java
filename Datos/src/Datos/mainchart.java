package Datos;

import java.util.Scanner;
import java.sql.*;

public class mainchart {

	public static void main(String[] args) throws SQLException {
		/*

		Scanner s= new Scanner(System.in);
		System.out.println("Desesa tomar una foto? Y/N");
		String opcion=s.next();
		
		if (opcion.equals("si")) {
			System.out.println("Entro");
			ScreenShot.takephoto();
		}else {
			System.out.println("No se tomo una foto");
		}
		
		*/
		conexion d = new conexion(new selector().opciones());
		d.Conexion();
		//abrir data
		
	
		
	}

}
