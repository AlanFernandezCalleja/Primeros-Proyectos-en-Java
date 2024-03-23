package Ventanas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.FontAttribute;
public class ventana extends JFrame{
	
	public JPanel panel;
	public ventana() 
	{	
		
		//this.setSize(win1.ancho, win1.ancho);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Colores");
		setSize(win1.ancho,win1.alto);
		//setIconImage(new Image().getSource());
		//setBounds(win1.x,win1.y, win1.ancho,win1.alto);
		setLocationRelativeTo(null);
		//setIconImage(dim_win1.icono);
		componentes();
		
		
		
	}//constructor
	
	private void componentes() {
		putPanel();
		//putLabels();
		putButtons();
		putRadioButtons();
		//obtener contenido, agregar el panel
		/*
		panel.setBackground(win1.color1);
		
		JLabel lbl = new JLabel();
		
		panel.setLayout(null);
		lbl.setText("COLOR 1");
		lbl.setForeground(Color.BLACK);
		lbl.setBackground(win1.color2);
		lbl.setBounds(10, 10, 250, 100);
		lbl.setOpaque(true);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("arial",Font.PLAIN,25));
		panel.add(lbl);
		
		JLabel lbl2= new JLabel();
		lbl2.setOpaque(true);
		lbl2.setBounds(10,120,250,100);
		lbl2.setBackground(win1.color3);
		lbl2.setText("COLOR 2");
		lbl2.setHorizontalAlignment(0);
		lbl2.setFont(new Font("calibri",Font.PLAIN,25));
		
		panel.add(lbl2);
		
		ImageIcon img =new ImageIcon("BOBESPONJA.png");
		//img
		JLabel imagen= new JLabel();
		//Imagen Icon
		imagen.setBounds(270,50,215,120);
		imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(215, 120, Image.SCALE_AREA_AVERAGING  )));
		
		panel.add(imagen);
		*/
		/*
		JLabel col1 = new JLabel ();
		JLabel col2 = new JLabel ();
		JLabel col3 = new JLabel ();
		JLabel col4 = new JLabel ();
		
		panel.setLayout(null);
		
		col1.setText("Color 1");
		col1.setHorizontalAlignment(SwingConstants.CENTER);
		col1.setBounds(10, 10,win1.sx , win1.sy);;
		col1.setBackground(win1.color2);
		col1.setOpaque(true);
		col1.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 1
		
		col2.setText("Color 2");
		col2.setHorizontalAlignment(SwingConstants.CENTER);
		col2.setBounds(20+win1.sx, 10,win1.sx , win1.sy);;
		col2.setBackground(win1.color3);
		col2.setOpaque(true);
		col2.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 2
		
		col3.setText("Color 3");
		col3.setHorizontalAlignment(SwingConstants.CENTER);
		col3.setBounds(30+win1.sx*2, 10,win1.sx , win1.sy);;
		col3.setBackground(win1.color4);
		col3.setOpaque(true);
		col3.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 3
		
		col4.setText("Color 4");
		col4.setHorizontalAlignment(SwingConstants.CENTER);
		col4.setBounds(40+win1.sx*3, 10,win1.sx , win1.sy);;
		col4.setBackground(win1.color5);
		col4.setOpaque(true);
		col4.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 4
		
		
		
		
		panel.add(col1);
		panel.add(col2);
		panel.add(col3);
		panel.add(col4);
		
		*/
		
	}
	
	private void putPanel() {
		panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setBackground(win1.color1);
		panel.setLayout(null);
	}
	
	private void putLabels() {
		JLabel col1 = new JLabel ();
		JLabel col2 = new JLabel ();
		JLabel col3 = new JLabel ();
		JLabel col4 = new JLabel ();
		
		panel.setLayout(null);
		
		col1.setText("Color 1");
		col1.setHorizontalAlignment(SwingConstants.CENTER);
		col1.setBounds(10, 10,win1.sx , win1.sy);;
		col1.setBackground(win1.color2);
		col1.setOpaque(true);
		col1.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 1
		
		col2.setText("Color 2");
		col2.setHorizontalAlignment(SwingConstants.CENTER);
		col2.setBounds(20+win1.sx, 10,win1.sx , win1.sy);;
		col2.setBackground(win1.color3);
		col2.setOpaque(true);
		col2.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 2
		
		col3.setText("Color 3");
		col3.setHorizontalAlignment(SwingConstants.CENTER);
		col3.setBounds(30+win1.sx*2, 10,win1.sx , win1.sy);;
		col3.setBackground(win1.color4);
		col3.setOpaque(true);
		col3.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 3
		
		col4.setText("Color 4");
		col4.setHorizontalAlignment(SwingConstants.CENTER);
		col4.setBounds(40+win1.sx*3, 10,win1.sx , win1.sy);;
		col4.setBackground(win1.color5);
		col4.setOpaque(true);
		col4.setFont(new Font(win1.Fuente,Font.BOLD,40));
		//color 4
		
		
		
		
		panel.add(col1);
		panel.add(col2);
		panel.add(col3);
		panel.add(col4);
	}
	
	private void putButtons() {
		JButton bot1 = new JButton();
		//bot1.setText("Pintar Color 1");
		bot1.setBounds(10, 10, 200, 200);
		//bot1.setEnabled(true);//Interaccion boton
		//bot1.setMnemonic('a');//alt + a = push button
		bot1.setFont(new Font(win1.Fuente,Font.BOLD,32));
		bot1.setBackground(win1.color3);
		
		ImageIcon img =new ImageIcon("micro.jpg");//crea imagen
		bot1.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		
		
		
		panel.add(bot1);
	}
	
	private void putRadioButtons() {
		JRadioButton rad1 = new JRadioButton("Opcion 1",true);
		rad1.setBounds(20,20,450,40);
		JRadioButton rad2 = new JRadioButton("Opcion 2",true);
		rad2.setBounds(20,50,450,40);
		
		ButtonGroup rads=new ButtonGroup();
		
		rads.add(rad1);
		rads.add(rad2);
		
		panel.add(rad2);
		panel.add(rad1);
	}
	
}
