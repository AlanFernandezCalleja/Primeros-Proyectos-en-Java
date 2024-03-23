package Tienda;

public class Venta {
	private Cliente persona;
	private String Numero;
	private String Precio;
	
	
	
	public Venta(Cliente persona, String numero, String precio) {
		super();
		this.persona = persona;
		Numero = numero;
		Precio = precio;
	}
	public Cliente getPersona() {
		return persona;
	}
	public void setPersona(Cliente persona) {
		this.persona = persona;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	
}
