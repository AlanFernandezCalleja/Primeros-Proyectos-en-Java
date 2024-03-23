package Tienda;

import javax.swing.JOptionPane;

public class mainTienda {

	public static void main(String[] args) {
		for(;;) {
			Cliente persona=new Cliente("","","");
			String[]menu={
					"Anadir Clientes",
					"Reporte de salarios",
					"Busqueda de salario",
					"Eliminar salario",
					"Salir"
					};
			String TItulo = "Salarios" ;
			String Instruccion="Seleccione opcion";
			String valor=(String)JOptionPane.showInputDialog(null,Instruccion,TItulo,-1,null,menu,menu[0]);
			switch (valor) {
				case "Anadir Clientes":persona.crear();;break;
				//case "Reporte de salarios":leer();break;
				//case "Busqueda de salario":buscar();break;
				//case "Eliminar salario":eliminar();break;
				case "Salir":System.exit(0);
			}

		}
	}
}

