package Banco;
import java.util.Queue;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;
public class Sistema {

	public static void main(String[] args) throws InterruptedException, IOException {
		int opcion = 0;String nodo_informacion = "";
		menu men= new menu();
		cola cola = new cola();
		cola normales= new cola();
		cola preferenciales = new cola();
		cola tercera = new cola();
		
		int user1 = 1,user2 = 1,user3 = 1;
		normales.setUser(0);preferenciales.setUser(1);
		tercera.setUser(2);
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				men.show_opciones();
				opcion  = sc.nextInt();
				sc.reset();  
				switch (opcion) {
				case 1:
					normales.insertar(user1++);
					break;
				case 2:
					preferenciales.insertar(user2++);
					break;
				case 3:
					tercera.insertar(user3++);
					break;
				case 4:
					//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					if(!tercera.vacia()) {
						tercera.extraer();
					}else if(!preferenciales.vacia()) {
						preferenciales.extraer();
					}else {
						normales.extraer();
					}
					normales.MostrarContenido();
					preferenciales.MostrarContenido();
					tercera.MostrarContenido();
					break;					
				case 5:
					opcion = 5;
					break;	
				default:
					System.out.println("22");
					break;
				}
				
			} catch (NumberFormatException U) {
				System.out.println("Se dio el error "+U);
			}
		}while(opcion!=5);

	}

}
