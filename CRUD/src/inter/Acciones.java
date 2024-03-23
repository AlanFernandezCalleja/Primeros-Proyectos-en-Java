package inter;

public class Acciones {
	static int a;
	static int b;
	public Acciones(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public static void suma() {
		int R = a+b;
		
		System.out.println("Resultado es "+R);
	}
}
