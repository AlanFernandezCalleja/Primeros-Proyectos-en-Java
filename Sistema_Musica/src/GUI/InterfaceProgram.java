package GUI;

import java.awt.Color;

public interface InterfaceProgram {
	Color BLACK_BACKGROUD = new Color (10,10,10);
	Color ALERT_BUTTON = new Color (150,0,0);
	Color GREY_SHADOW = new Color(50,50,50);
	Color WHITE_FONT = new Color (245,245,245);
	//Pagina Principal
	int ANCHO_PRINCIPAL = 800;
	int ALTO_PRINCIPAL = 500;
	//Sub pagina 2
	int ANCHO_INSTRUMENTO = 500 ; 
	int ALTO_INSTRUMENTO = 600;
	//menuSIZEs
	int alto_menu=480;
	int ancho_menu=500;
	
	//Button SIZE
	int largo_boton1 = 500;
	int alto_boton = 80;
	//Pagina para Tabla
	int x_tablePage = 600;
	int y_tablePage = 550;
	
	//columnas cliente
	int NOMBRE_CLIENTE =2;
	int CORREO_CLIENTE =3;
	int CELULAR_CLIENTE =4;
	int FECHA_CLIENTE =5;
	int CI_CLIENTE =6;
	//columnas empleado
	
	int NOMBRE_EMPLEADO =2;
	int CORREO_EMPLEADO =3;
	int EDAD_EMPLEADO =4;
	int CELULAR_EMPLEADO =5;
	int FECHA_EMPLEADO =6;
	int CI_EMPLEADO =7;
	int SALARIO_EMPLEADO = 8;
	
	
}
