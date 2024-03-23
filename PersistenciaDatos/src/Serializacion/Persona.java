package Serializacion;

import java.io.*;
import java.util.*;
public class Persona {
	String nombre;
	String Cedula;
	String apPaterno;
	public Persona(String nombre, String cedula, String apPaterno) {
		super();
		this.nombre = nombre;
		Cedula = cedula;
		this.apPaterno = apPaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	@Override
	public String toString() {
		return  nombre + "\t" + Cedula + "\t" + apPaterno ;
	}
	//el static sirve para : no tener que crear la clase para usar el metodo o atributo.
	//es como si estuviese en el main, sin instanciar un objeto.
	public static void escribirPersonas(int n, String Archivo) {		
		try {
			Scanner  s= new Scanner (System.in);
			FileWriter escritor = new FileWriter(Archivo,true);
			for (int i = 0 ; i<n ; i++) {
				System.out.println("Igrese cada dato");
				String ced = s.nextLine();
				String nom = s.nextLine();
				String ape = s.nextLine();
				Persona p = new Persona(ced,nom,ape);
				//cada linea que se debe guardar
				String l = p.toString().replace("\t", ";");
				escritor.write(l+"\n");
			}
			escritor.close();	
		} catch (IOException e) {
			e.printStackTrace();//imprime la pila del error
		}
		
	}
	//mostrar los datos:
	public static ArrayList<Persona> leerPersonas(String archivo){
		ArrayList <Persona>personas = new ArrayList<Persona>();
		try {
			File file =new File(archivo);
			FileInputStream lectorArchivo = new FileInputStream(file);
			InputStreamReader file2 = new InputStreamReader(lectorArchivo);
			BufferedReader bandeja = new BufferedReader(file2);//finalmente esta es la bandeja donde se almacenan los archivos
			if (file.exists()) {
				//lector del puntero de linea
				String line = bandeja.readLine();
				while(line!=null) {
					
					String []dat = line.split(";");
					Persona p = new Persona(dat[0],dat[1],dat[2]);
					
					personas.add(p);
					line = bandeja.readLine();
				}
				bandeja.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return personas;
		
	}
	
}
