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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Persona.Cliente;
import Persona.Empleado;

public class _AgregarEmpleado extends JFrame implements InterfaceProgram{

	private JPanel contentPane;

	private JTextField nombre;
	private JTextField correo;
	private JTextField celular;
	private JTextField ci;
	protected int d,m,y;
	private JTextField salario;
	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					_AgregarEmpleado frame = new _AgregarEmpleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public _AgregarEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, (int) (largo_boton1*1.3),(int) (ancho_menu*1.5));
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		JSpinner edad = new JSpinner();
		edad.setModel(new SpinnerNumberModel(Integer.valueOf(18), Integer.valueOf(18), null, Integer.valueOf(1)));
		edad.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		edad.setBounds(203, 619, 118, 50);
		contentPane.add(edad);
		
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
		dia.setBounds(261, 538, 60, 50);
		contentPane.add(dia);
		JSpinner mes = new JSpinner();
		mes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		mes.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		mes.setBounds(386, 538, 60, 50);
		contentPane.add(mes);
		
		JSpinner year = new JSpinner();
		year.setModel(new SpinnerNumberModel(22, 5, 99, 1));
		year.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		year.setBounds(548, 538, 60, 50);
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
		salir.setBounds(0, 670, 192, 80);
		salir.setBackground(ALERT_BUTTON);
		salir.setForeground(WHITE_FONT);
		salir.setBorderPainted(false);
		salir.setFocusPainted(false);
		salir.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuEmpleados().run();;
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
					Empleado empleado = new Empleado();
					empleado.setName(nombre.getText());
					empleado.setCel(celular.getText());
					empleado.setCorreo(correo.getText());
					empleado.setCi(ci.getText());
					d =(int)dia.getValue();
					m =(int) mes.getValue();
					y =(int) year.getValue();
					Date fecha_user = new Date(y+100,m-1,d);
					empleado.setRegistration(fecha_user);
					empleado.setSalary(Double.parseDouble(salario.getText()));
					empleado.setEdad((int)edad.getValue());
					empleado.addEmployer();
					
					
				}
				nombre.setText("");
				celular.setText("");
				correo.setText("");
				ci.setText("");
				salario.setText("");
				
			}
		});
		Insertar.setBounds(356, 670, (int)(largo_boton1*0.6), alto_boton);
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
		
		JLabel lblNitxi = new JLabel("CI :");
		lblNitxi.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblNitxi.setBounds(23, 374, 148, 50);
		contentPane.add(lblNitxi);
		
		JLabel lblFecha = new JLabel("Fecha :");
		lblFecha.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblFecha.setBounds(23, 538, 148, 50);
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
		lblDia.setBounds(203, 538, 60, 50);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("MES:");
		lblMes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblMes.setBounds(334, 538, 60, 50);
		contentPane.add(lblMes);
		
		JLabel lblAo = new JLabel("AÑO : 20");
		lblAo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblAo.setBounds(456, 538, 96, 50);
		contentPane.add(lblAo);
		
		salario = new JTextField();
		salario.setHorizontalAlignment(SwingConstants.LEFT);
		salario.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		salario.setColumns(10);
		salario.setBounds(203, 446, 417, 50);
		contentPane.add(salario);
		
		JLabel lblSalario = new JLabel("SALARIO  :");
		lblSalario.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblSalario.setBounds(23, 446, 148, 50);
		contentPane.add(lblSalario);
		
		JLabel lblEdad = new JLabel("Edad :");
		lblEdad.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblEdad.setBounds(23, 609, 148, 50);
		contentPane.add(lblEdad);
		
		
	}

}
