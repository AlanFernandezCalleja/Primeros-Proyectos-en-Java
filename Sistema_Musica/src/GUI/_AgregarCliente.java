package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Persona.Cliente;
import Product.Instrumento;

import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;

public class _AgregarCliente extends JFrame  implements InterfaceProgram{

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField correo;
	private JTextField celular;
	private JTextField ci;
	protected int d,m,y;
	
	
	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					_AgregarCliente frame = new _AgregarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public _AgregarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, (int) (largo_boton1*1.3),(int) (ancho_menu*1.2));
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		JLabel Titulo = new JLabel("Registrar");
		Titulo.setBounds(0, 0, 656, 142);
		Titulo.setOpaque(true);
		Titulo.setBackground(BLACK_BACKGROUD);
		Titulo.setForeground(WHITE_FONT);
		Titulo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 45));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Titulo);
		
		
		setContentPane(contentPane);
		
		JSpinner dia = new JSpinner();
		dia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		dia.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		dia.setBounds(262, 446, 60, 50);
		contentPane.add(dia);
		JSpinner mes = new JSpinner();
		mes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		mes.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		mes.setBounds(386, 446, 60, 50);
		contentPane.add(mes);
		
		JSpinner year = new JSpinner();
		year.setModel(new SpinnerNumberModel(22, 5, 99, 1));
		year.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		year.setBounds(546, 446, 60, 50);
		contentPane.add(year);
		
		nombre = new JTextField();
		nombre.setHorizontalAlignment(SwingConstants.LEFT);
		nombre.setBounds(203, 162, 417, 50);
		nombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel N = new JLabel("Nombre :");
		N.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		N.setBounds(23, 161, 148, 50);
		contentPane.add(N);
		
		JButton salir = new JButton("Regresar");
		salir.setBounds(0, 520, (int)(largo_boton1*0.3), alto_boton);
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
		
		JButton Insertar = new JButton("Insertar");
		Insertar.setBackground(BLACK_BACKGROUD);
		Insertar.setForeground(WHITE_FONT);
		Insertar.setBorderPainted(false);
		Insertar.setFocusPainted(false);
		Insertar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nombre.getText().isEmpty() || correo.getText().isEmpty() || celular.getText().isEmpty() || ci.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);
				}else {
					Cliente cliente = new Cliente();
					cliente.setName(nombre.getText());
					cliente.setCel(celular.getText());
					cliente.setCorreo(correo.getText());
					cliente.setCi(ci.getText());
					d =(int)dia.getValue();
					m =(int) mes.getValue();
					y =(int) year.getValue();
					Date fecha_user = new Date(y+100,m-1,d);
					cliente.setRegistration(fecha_user);
					cliente.addClient();
				}
				nombre.setText("");
				celular.setText("");
				correo.setText("");
				ci.setText("");
				
			}
		});
		Insertar.setBounds(350, 520, (int)(largo_boton1*0.6), alto_boton);
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
		
		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblCorreo.setBounds(23, 230, 148, 50);
		contentPane.add(lblCorreo);
		
		JLabel lblCelular = new JLabel("Celular :");
		lblCelular.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblCelular.setBounds(23, 301, 148, 50);
		contentPane.add(lblCelular);
		
		JLabel lblNitxi = new JLabel("NIT/CI :");
		lblNitxi.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblNitxi.setBounds(23, 374, 148, 50);
		contentPane.add(lblNitxi);
		
		JLabel lblFecha = new JLabel("Fecha :");
		lblFecha.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblFecha.setBounds(23, 443, 148, 50);
		contentPane.add(lblFecha);
		
		correo = new JTextField();
		correo.setHorizontalAlignment(SwingConstants.LEFT);
		correo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		correo.setColumns(10);
		correo.setBounds(203, 231, 417, 50);
		contentPane.add(correo);
		
		celular = new JTextField();
		celular.setHorizontalAlignment(SwingConstants.LEFT);
		celular.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		celular.setColumns(10);
		celular.setBounds(203, 302, 417, 50);
		contentPane.add(celular);
		
		ci = new JTextField();
		ci.setHorizontalAlignment(SwingConstants.LEFT);
		ci.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		ci.setColumns(10);
		ci.setBounds(203, 375, 417, 50);
		contentPane.add(ci);
		
		
		
		JLabel lblDia = new JLabel("DIA:");
		lblDia.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblDia.setBounds(203, 446, 60, 50);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("MES:");
		lblMes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblMes.setBounds(332, 446, 60, 50);
		contentPane.add(lblMes);
		
		JLabel lblAo = new JLabel("AÑO : 20");
		lblAo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblAo.setBounds(456, 446, 96, 50);
		contentPane.add(lblAo);
	}
}
