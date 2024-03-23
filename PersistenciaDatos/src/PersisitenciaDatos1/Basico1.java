package PersisitenciaDatos1;
//incluye las clases para Entrada/Salida de Datos
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//Para incluir las clases de Interfaces graficas
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Basico1 {
	public static void main(String[]args) throws IOException {
		//String f="prueba.txt";
		for (;;) {
			String[]menu={
					"Almacenar salarios",
					"Reporte de salarios",
					"Busqueda de salario",
					"Eliminar salario",
					"Salir"
					};
			String TItulo = "Salarios" ;
			String Instruccion="Seleccione opcion";
			String valor=(String)JOptionPane.showInputDialog(null,Instruccion,TItulo,-1,null,menu,menu[0]);
			switch (valor) {
				case "Almacenar salarios":crear();break;
				case "Reporte de salarios":leer();break;
				case "Busqueda de salario":buscar();break;
				case "Eliminar salario":eliminar();break;
				case "Salir":System.exit(0);
				
			}
		}

	}
	
//crear escribir	
public static void crear() {
	try {
			//Objeto para escribir en un archivo prueba.txt
			FileWriter fichero=new FileWriter("prueba.txt",true); // ios::app del C++
			//escritor que usa fichero
			PrintWriter pw=new PrintWriter(fichero);
			
			int n=Integer.parseInt(JOptionPane.showInputDialog("Cuantos salarios desea almacenar:"));
			
			for (int i=0;i<n;i++) {
				//Ingresar el dato
				double sal=Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
				
				pw.println(sal);
		}
		fichero.close();
	}
	catch(Exception e) {
		JOptionPane.showMessageDialog(null,"Se produjo un error del tipo :"+e);
	}
}

//lectura 
public static void leer() {
	try {
		BufferedReader in=new BufferedReader(new FileReader("prueba.txt"));
		String cad="",aux="";
		for(;(cad=in.readLine())!=null;) {
			aux+=cad+"\n";
		}
		JTextArea area=new JTextArea();
		area.setText(aux);
		JOptionPane.showMessageDialog(null,area);
		in.close();
	}
	catch (Exception e){
		JOptionPane.showMessageDialog(null,"Se produjo un error del tipo :"+e);
	}
}

public static void buscar() {
	try {
		BufferedReader in=new BufferedReader(new FileReader("prueba.txt"));
		String cad="";
		int flag=0,c=0;
		double n=Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario a buscar:"));
		for(;(cad=in.readLine())!=null;) {
			c++;
			double aux=Double.parseDouble(cad);
			if (aux==n){
				JOptionPane.showMessageDialog(null,"Salario encontrado, esta en el registro :"+c);
				flag=1; break;
			}
		}
		if (flag==0)
			JOptionPane.showMessageDialog(null,"Salario no encontrado");
			
		in.close();
	}
	catch (Exception e){
		JOptionPane.showMessageDialog(null,"Se produjo un error del tipo :"+e);
	}
}
public static void eliminar() throws IOException 
{
  BufferedReader in=new BufferedReader(new FileReader("prueba.txt"));
  String cad="";
  FileWriter fw=null;
  PrintWriter pw=null;
  fw=new FileWriter("auxiliar.txt");
  pw=new PrintWriter(fw);
  double sal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario que desea eliminar del archivo"));
  for(;(cad=in.readLine())!=null;) {
		double aux=Double.parseDouble(cad);
		if (aux==sal){
			System.out.println("Encontrado:"+aux);  
            int opcion = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar?", "Aviso", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) 
            {   
                continue;
            }
            else
                pw.println(aux);
        }             
        else
        { 
          pw.println(aux);
        }
  }    
        fw.close();
        in.close(); 

        File b=new File("auxiliar.txt");
        File e=new File("prueba.txt");
        e.delete();
        b.renameTo(e);
  } 
}

