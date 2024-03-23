package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Persona.Cliente;
import Product.Instrumento;

public class _BuscarCliente extends JFrame implements InterfaceProgram{

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField ci;
	private JTextField celular;
	private JTextField fecha;
	private JTextField correo;
	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					_BuscarCliente frame = new _BuscarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public _BuscarCliente()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,(int) (largo_boton1) , alto_menu+120);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombre = new JTextField();
		nombre.setBounds(200, 211, 275, 50);
		nombre.setEditable(false);
		nombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		
		JButton Buscar = new JButton("Buscar");
		Buscar.setBackground(BLACK_BACKGROUD);
		Buscar.setForeground(WHITE_FONT);
		Buscar.setBorderPainted(false);
		Buscar.setFocusPainted(false);
		Buscar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ciBuscado = ci.getText();
				
				Cliente cliente = new Cliente().searchClient(ciBuscado);
				
				nombre.setText(cliente.getName());
				correo.setText(cliente.getCorreo());
				celular.setText(cliente.getCel());
				Date fechaDi = cliente.getRegistration();
				System.out.println(fechaDi);
				String fechaString=fechaDi.toString(); 
				fecha.setText(fechaString);
				
				
				
			}
		});
		Buscar.setBounds(200, 520, (int)(largo_boton1*0.6), alto_boton);
		Buscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                Buscar.setBackground(GREY_SHADOW);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Buscar.setBackground(BLACK_BACKGROUD);
            }
        });
		contentPane.add(Buscar);
		
		JButton salir = new JButton("Regresar");
		salir.setBackground(ALERT_BUTTON);
		salir.setForeground(WHITE_FONT);
		salir.setBorderPainted(false);
		salir.setFocusPainted(false);
		salir.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuClientes().run();;
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
		
		JLabel Titulo = new JLabel("BUSCAR");
		Titulo.setOpaque(true);
		Titulo.setBackground(BLACK_BACKGROUD);
		Titulo.setForeground(WHITE_FONT);
		Titulo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 45));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setBounds(0, 0, 500, 142);
		contentPane.add(Titulo);
		
		JLabel lblNewLabel = new JLabel("Ingrese CI:");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 153, 180, 50);
		contentPane.add(lblNewLabel);
		
		ci = new JTextField();
		ci.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		ci.setEditable(true);
		ci.setColumns(10);
		ci.setBounds(200, 153, 275, 50);
		contentPane.add(ci);
		
		celular = new JTextField();
		celular.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		celular.setEditable(false);
		celular.setColumns(10);
		celular.setBounds(200, 334, 275, 50);
		contentPane.add(celular);
		
		fecha = new JTextField();
		fecha.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		fecha.setEditable(false);
		fecha.setColumns(10);
		fecha.setBounds(200, 395, 275, 50);
		contentPane.add(fecha);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblNombre.setBounds(10, 211, 180, 50);
		contentPane.add(lblNombre);
		
		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblCorreo.setBounds(10, 272, 180, 50);
		contentPane.add(lblCorreo);
		
		JLabel lblCelular = new JLabel("Celular :");
		lblCelular.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblCelular.setBounds(10, 334, 180, 50);
		contentPane.add(lblCelular);
		
		JLabel lblFecha = new JLabel("Fecha Registrado:");
		lblFecha.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblFecha.setBounds(10, 395, 180, 50);
		contentPane.add(lblFecha);
		
		correo = new JTextField();
		correo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		correo.setEditable(false);
		correo.setColumns(10);
		correo.setBounds(200, 273, 275, 50);
		contentPane.add(correo);
		boolean flag =false;

	}

}
