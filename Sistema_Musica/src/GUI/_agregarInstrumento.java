package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Product.Instrumento;

import javax.sound.midi.Instrument;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class _agregarInstrumento extends JFrame implements InterfaceProgram{

	private JPanel contentPane;
	private JTextField Modelo;
	private JTextField Marca;
	private JTextField Precio;

	
	
			public void run() {
				try {
					_agregarInstrumento frame = new _agregarInstrumento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	
	public _agregarInstrumento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, (int) (largo_boton1*1.3),(int) (ancho_menu*1.2));
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//
		JComboBox NombreInstrumentos = new JComboBox();
		NombreInstrumentos.setToolTipText("Escoja el tipo de Instrumento que esta registrando, por ejemplo: \"GUITARRA\"");
		NombreInstrumentos.setModel(new DefaultComboBoxModel(new String[] {"(Seleccione)", "GUITARRA", "PIANO", "BAJO", "GUITARRA ELECTRICA", "TECLADO ELECTRICO"}));
		NombreInstrumentos.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		NombreInstrumentos.setBounds(168, 152, 270, 80);
		NombreInstrumentos.setForeground(BLACK_BACKGROUD);
		NombreInstrumentos.setBackground(WHITE_FONT);
		contentPane.add(NombreInstrumentos);
		
		
		JSpinner cantidad = new JSpinner();
		cantidad.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		cantidad.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 21));
		cantidad.setBounds(556, 440, 84, 48);
		cantidad.getValue();
		
		contentPane.add(cantidad);
		
		
		
		
		JButton Insertar = new JButton("Insertar");
		Insertar.setBackground(BLACK_BACKGROUD);
		Insertar.setForeground(WHITE_FONT);
		Insertar.setBorderPainted(false);
		Insertar.setFocusPainted(false);
		Insertar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if  ( (int) cantidad.getValue() <= 0  || Modelo.getText().isEmpty() || Marca.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Alerta",JOptionPane.ERROR_MESSAGE);
					
				}
				else {
					//Registre los datos
					int total= (int) cantidad.getValue();
				
					String tipoIns = (String) NombreInstrumentos.getSelectedItem();
					while(total>0){
						Instrumento instrumento = new Instrumento(Modelo.getText(),Marca.getText(),Double.parseDouble(Precio.getText()),tipoIns);
						instrumento.insertar();
						total --;
					}
					
					
					JOptionPane.showMessageDialog(null, "Se registro nuevo Instrumento","Alerta",JOptionPane.INFORMATION_MESSAGE);
					Precio.setText("");
					Modelo.setText("");
					Marca.setText("");
					
				}
			}
		});
		Insertar.setBounds(356, 520, (int)(largo_boton1*0.6), alto_boton);
		Insertar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                Insertar.setBackground(GREY_SHADOW);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Insertar.setBackground(BLACK_BACKGROUD);
            }
        });
		contentPane.add(Insertar);
		
		JButton salir = new JButton("Regresar");
		salir.setBackground(ALERT_BUTTON);
		salir.setForeground(WHITE_FONT);
		salir.setBorderPainted(false);
		salir.setFocusPainted(false);
		salir.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuInstrumentos().run();;
				dispose();
			}
		});
		salir.setBounds(0, 520, (int)(largo_boton1 * 0.4), alto_boton);
		salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                salir.setBackground(new Color (170,20,20));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                salir.setBackground(ALERT_BUTTON);
            }
        });
		contentPane.add(salir);
		
		Modelo = new JTextField();
		Modelo.setHorizontalAlignment(SwingConstants.LEFT);
		Modelo.setBounds(168, 243, 270, 80);
		Modelo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		contentPane.add(Modelo);
		Modelo.setColumns(10);
		
		Marca = new JTextField();
		Marca.setHorizontalAlignment(SwingConstants.LEFT);
		Marca.setBounds(168, 334, 270, 80);
		Marca.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		contentPane.add(Marca);
		Marca.setColumns(10);
		
		JLabel Tipolbl = new JLabel("Instrumento : ");
		Tipolbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Tipolbl.setBounds(10, 165, 148, 55);
		contentPane.add(Tipolbl);
		
		JLabel modelolbl = new JLabel("Modelo :");
		modelolbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		modelolbl.setBounds(10, 262, 148, 41);
		contentPane.add(modelolbl);
		
		JLabel marcalbl2 = new JLabel("Marca :");
		marcalbl2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		marcalbl2.setBounds(10, 353, 148, 41);
		contentPane.add(marcalbl2);
		
		JLabel Titulo = new JLabel("Registrar");
		Titulo.setOpaque(true);
		Titulo.setBackground(BLACK_BACKGROUD);
		Titulo.setForeground(WHITE_FONT);
		Titulo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 45));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setBounds(0, 0, 656, 142);
		contentPane.add(Titulo);
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblPrecio.setBounds(10, 444, 148, 41);
		contentPane.add(lblPrecio);
		
		Precio = new JTextField();
		Precio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (Character.isLetter(e.getKeyChar())) {
					e.consume();
				};
			}
		});
		Precio.setToolTipText("Solo Ingrear Valores Numerales en BOB.");
		Precio.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Precio.setColumns(10);
		Precio.setBounds(168, 425, 270, 80);
		
		
		contentPane.add(Precio);
		
		
		
		JLabel lblUnidades = new JLabel("Unidades :");
		lblUnidades.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblUnidades.setBounds(448, 444, 165, 41);
		contentPane.add(lblUnidades);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(BLACK_BACKGROUD);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(197, 520, 165, 80);
		contentPane.add(lblNewLabel);
		
		
	}
}
