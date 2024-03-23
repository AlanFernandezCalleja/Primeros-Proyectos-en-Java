package inter;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

public class pantalla2 extends JFrame {

	private JPanel contentPane;
	//cuadros 
	private JTextField tNombre;
	private JTextField tEdad;
	private JTextField tId;

	/**
	 * Launch the application.
	 */
		 
	public void run() {
				try {
					pantalla2 frameC = new pantalla2();
					frameC.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		;
	

	/**
	 * Create the frame.
	 */
	public pantalla2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(0, 0, 500, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		
		
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(210, 455, 194, 29);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.setVisible(false);
		
		JLabel Advertencia = new JLabel("(Llena todos los Campos)");
		Advertencia.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		Advertencia.setForeground(new Color(223, 0, 0));
		Advertencia.setBackground(new Color(0, 0, 0));
		Advertencia.setOpaque(true);
		Advertencia.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(Advertencia);
		
		
		JButton Agregar = new JButton("Agregar");
		Agregar.setBounds(210, 481, 290, 69);
		Agregar.setForeground(new Color(255, 255, 255));
		Agregar.setBackground(new Color(28, 12, 0));
		Agregar.setFocusPainted(false);
		Agregar.setBorderPainted(false);
		Agregar.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new CRUD().setVisible(true);
				if (tEdad.getText().isEmpty() || tNombre.getText().isEmpty() || tId.getText().isEmpty()) 
				{
					panel.setVisible(true);
				}else {
					panel.setVisible(false);
				}
				
				//dispose();
				
			}
		});
		Agregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                Agregar.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Agregar.setBackground(new Color(3, 3, 3));
            }
        });
		contentPane.add(Agregar);
		
		tNombre = new JTextField();
		tNombre.setBounds(210, 125, 280, 55);
		tNombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 18));
		tNombre.setBackground(new Color(250, 250, 250));
		
		
		contentPane.add(tNombre);
		tNombre.setColumns(10);
		
		tEdad = new JTextField();
		tEdad.setBounds(210, 191, 280, 55);
		tEdad.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		tEdad.setBackground(new Color(250, 250, 250));
		contentPane.add(tEdad);
		tEdad.setColumns(10);
		
		tId = new JTextField();
		tId.setBounds(210, 257, 280, 55);
		tId.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		tId.setBackground(new Color(250, 250, 250));
		contentPane.add(tId);
		tId.setColumns(10);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setBounds(23, 122, 109, 55);
		Nombre.setForeground(new Color(249, 249, 249));
		Nombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		contentPane.add(Nombre);
		
		JLabel Edad = new JLabel("Edad");
		Edad.setBounds(23, 185, 109, 55);
		Edad.setForeground(new Color(253, 253, 253));
		Edad.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		contentPane.add(Edad);
		
		JLabel CI = new JLabel("Identidad");
		CI.setBounds(23, 251, 109, 55);
		CI.setForeground(new Color(251, 251, 251));
		CI.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		contentPane.add(CI);
		
		JLabel Cliente = new JLabel("Agregar Cliente");
		Cliente.setBounds(23, 11, 480, 64);
		Cliente.setForeground(new Color(248, 248, 248));
		Cliente.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 40));
		Cliente.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(Cliente);
		
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.setBounds(0, 481, 209, 69);
		Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CRUD().setVisible(true);
				dispose();
			}
		});
		Cancelar.setFocusPainted(false);
		Cancelar.setBorderPainted(false);
		Cancelar.setForeground(new Color(255, 255, 255));
		Cancelar.setBackground(new Color(150, 0, 0));
		Cancelar.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		Cancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                Cancelar.setBackground(new Color(195, 15, 0));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Cancelar.setBackground(new Color(150, 0, 0));
            }
    });
		contentPane.add(Cancelar);
		
		JLabel Fondo = new JLabel("New label");
		Fondo.setBounds(0, 0, 500, 550);
		Fondo.setOpaque(true);
		Fondo.setBackground(new Color(28, 12, 0));
		contentPane.add(Fondo);
	}
}
