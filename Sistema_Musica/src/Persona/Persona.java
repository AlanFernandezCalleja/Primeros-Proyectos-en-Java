package Persona;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Date;
public class Persona {
	//Connection con;
	
	protected String name;
	protected String correo;
	protected String cel;
	protected String ci;
	protected Date registration;
	
	public Persona()
	{}
	
	public Persona(String name, String correo, String cel, String ci, Date registration) {
		super();
		this.name = name;
		this.correo = correo;
		this.cel = cel;
		this.ci = ci;
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public Date getRegistration() {
		return registration;
	}

	public void setRegistration(Date registration) {
		this.registration = registration;
	}	
	
	
	
}
