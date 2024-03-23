package Datos;

import java.util.ArrayList;
import java.util.Scanner;

public class selector {
	public selector(){}
	
	public static String opciones() {
		String option;
		//ArrayList <String> ops = ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese nombre de la tabla");
		option = s.nextLine();
		return option;
	}
}
