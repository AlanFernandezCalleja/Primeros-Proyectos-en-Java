package Frame;

import java.sql.Date;

public class pruebas {

	public static void main(String[] args) {
		//@SuppressWarnings("deprecation")
		//priemer numero es el valor correcto
		Date Fecha = new Date((2020-1900),(5-1),15);
		String imprimible = Fecha.toString();
		System.out.println("El valor es " + imprimible);
	}

}
