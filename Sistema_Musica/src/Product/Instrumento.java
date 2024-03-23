package Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//import Clase.Cliente;
import SQL.ConexionSQL;

public class Instrumento extends Product{
	String instrumentName;
	ConexionSQL con = new ConexionSQL();
	Connection cc;
	Statement sfc;
	ResultSet rs;
	int cantidad;
	public Instrumento() {
	}
	public Instrumento(String model, String mark, double price, String instrumentName) {
		super(model, mark, price);
		this.instrumentName = instrumentName;
	}
	public Instrumento(String model, String mark, double price, String instrumentName,int cantidad) {
		super(model, mark, price);
		this.instrumentName = instrumentName;
		this.cantidad =cantidad; 
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public void insertar () {
		try {
			cc = con.getConexionDataBase(); //Create Connection to work
			sfc = cc.createStatement(); //Create Statement F  or Connection to make Queries
			String insertar = "INSERT INTO instrumento (tipo,modelo,marca,precio) VALUES ('"+instrumentName + "','"+model + "','"+mark+"',"+price+");";
			sfc.execute(insertar);//execute Queri...
			sfc.close();//close stament for connection
			cc.close();//close main connecion
			
			//JOptionPane.showMessageDialog(null, "Datos ingresados con Exito", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e) {
			System.out.println("Error : "+ e);
		}
	}
								//Modelo, marca, 
	public Instrumento buscar(String id) {
		try {
			cc = con.getConexionDataBase();
			sfc = cc.createStatement();
			String buscar= "Select * from instrumento where id = "+id+";";
			Instrumento instrumento= new Instrumento(); 
			rs = sfc.executeQuery(buscar);
			
			if (rs.next()) {
				
				instrumento.setInstrumentName(rs.getString("tipo"));
				instrumento.setModel(rs.getString("modelo"));
				instrumento.setMark(rs.getString("marca"));
				instrumento.setPrice(Double.parseDouble(rs.getString("precio")));
				
				
			}else {
				
				
			}
			
			sfc.close();//close stament for connection
			cc.close();
			rs.close();
			return instrumento;
			
		} catch (Exception e) {
			System.out.println("error"+e);
			return new Instrumento();
		}
	}
	public ArrayList<Instrumento> listaInstrumentos(){
		ArrayList<Instrumento> listInstrumentos = new ArrayList<Instrumento>();
		try {
			cc = con.getConexionDataBase();
			sfc = cc.createStatement();
			String buscar= "select tipo, modelo, marca, count (id) as cantidad,precio from instrumento group by tipo, modelo, marca, precio;";
			
			rs = sfc.executeQuery(buscar);
			
			while(rs.next()) {
				//String model, String mark, double price, String instrumentName, cantidad
				Instrumento instrumento = new Instrumento(rs.getString("modelo"),rs.getString("marca"),Double.parseDouble(rs.getString(5)),rs.getString("tipo"),Integer.parseInt(rs.getString(4)));
				//Instrumento instrumento = new Instrumento();
				//System.out.println(rs.getString(5)); devuelve precio
				listInstrumentos.add(instrumento);
			}
			rs.close();
			sfc.close();
			cc.close();
			
			return listInstrumentos;
			
		} catch (Exception e) {
			
			System.out.println("error"+e);
			return listInstrumentos;
		}
	}

}
