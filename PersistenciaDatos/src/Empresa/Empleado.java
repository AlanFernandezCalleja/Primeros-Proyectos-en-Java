package Empresa;

public class Empleado {
	private String codigo;
	private int []entrada= {0,0};
	private int []salida= {0,0};
	
	
	
	public Empleado(String codigo, int entHor,int entMin, int salHor,int salMin) {
		super();
		this.codigo = codigo;
		this.entrada [0]= entHor;
		this.entrada [1]= entMin;
		
		this.salida [0]= salHor;
		this.salida [1]=salMin;
		
	}







	@Override
	public String toString() {
		return  codigo + "\t" + entrada[0]+":"+entrada[1] + "\t" + salida[0]+":"+salida[1] ;
	}
	
	
	public static int Penalizacion() {
		int pena=0;
		
		
		return pena;
	}
	
	
}
