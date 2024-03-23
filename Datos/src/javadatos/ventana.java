package javadatos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECFieldF2m;
import java.sql.Connection;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicButtonListener;

public class ventana extends JFrame{
	String Titulo;
	
	
	public ventana(String titulo) {
		//super();
		Titulo = titulo;
	}
	public static void iniciar() {
		JFrame f1= new JFrame();
		f1.setVisible(true);
		f1.setBounds(200,200,500,500);
		f1.setLocationRelativeTo(null);
		f1.setLayout(new GridLayout(4,4));
		f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JTextArea t1 = new JTextArea();
		t1.setBounds(0,0,150,150);
		t1.setBackground(new Color(200,200,200));
		f1.add(t1);
		
		JTextArea t2 =  new JTextArea();
		f1.add(t2);
		
		JButton b1 = new JButton("Agregar");
		
		f1.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()!=null) {
					ConexionSQL sql=new ConexionSQL();
					Connection cc = sql.conectar();
					Usuario user1 = new Usuario("Pedrito");
					user1.insertarDatos(cc);
					
				}
				
			}
		});
		
		
	}
	
	
}
