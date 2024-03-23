package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Product.Instrumento;

public class _BuscarInstrumento extends JFrame implements InterfaceProgram {

	private JPanel contentPane;
	private JTextField instrumento;
	private JTextField modelo;
	private JTextField marca;
	private JTextField ID;
	private JTextField precio;
	private JTextField unidades;
	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					_BuscarInstrumento frame = new _BuscarInstrumento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public _BuscarInstrumento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,(int) (largo_boton1*2) , alto_menu+120);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		instrumento = new JTextField();
		instrumento.setBounds(239, 247, 236, alto_boton);
		instrumento.setEditable(false);
		instrumento.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		contentPane.add(instrumento);
		instrumento.setColumns(10);
		
		modelo = new JTextField();
		modelo.setBounds(239, 338, 236, alto_boton);
		modelo.setEditable(false);
		modelo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		contentPane.add(modelo);
		modelo.setColumns(10);
		
		marca = new JTextField();
		marca.setBounds(239, 429, 236, alto_boton);
		marca.setEditable(false);
		marca.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		contentPane.add(marca);
		marca.setColumns(10);
		
		
		JButton Buscar = new JButton("Buscar");
		Buscar.setBackground(BLACK_BACKGROUD);
		Buscar.setForeground(WHITE_FONT);
		Buscar.setBorderPainted(false);
		Buscar.setFocusPainted(false);
		Buscar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrumento ins = new Instrumento().buscar(ID.getText());
				instrumento.setText(ins.getInstrumentName());
				modelo.setText(ins.getModel());
				marca.setText(ins.getMark());
			}
		});
		Buscar.setBounds(700, 520, (int)(largo_boton1*0.6), alto_boton);
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
		
		
		
		JLabel Tipolbl = new JLabel("Instrumento : ");
		Tipolbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Tipolbl.setBounds(29, 259, 190, 55);
		contentPane.add(Tipolbl);
		
		JLabel modelolbl = new JLabel("Modelo :");
		modelolbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		modelolbl.setBounds(29, 357, 200, 41);
		contentPane.add(modelolbl);
		
		JLabel marcalbl2 = new JLabel("Marca :");
		marcalbl2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		marcalbl2.setBounds(29, 448, 200, 41);
		contentPane.add(marcalbl2);
		
		JLabel Titulo = new JLabel("BUSCAR");
		Titulo.setOpaque(true);
		Titulo.setBackground(BLACK_BACKGROUD);
		Titulo.setForeground(WHITE_FONT);
		Titulo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 45));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setBounds(0, 0, 1000, 142);
		contentPane.add(Titulo);
		
		JLabel lblNewLabel = new JLabel("Ingrese ID:");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(29, 168, 200, 50);
		contentPane.add(lblNewLabel);
		
		ID = new JTextField();
		ID.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		ID.setEditable(true);
		ID.setColumns(10);
		ID.setBounds(239, 154, 236, 80);
		contentPane.add(ID);
		
		JLabel Preciolbl = new JLabel("Precio :");
		Preciolbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Preciolbl.setBounds(493, 259, 190, 55);
		contentPane.add(Preciolbl);
		
		JLabel lblDisponibles = new JLabel("Disponibles");
		lblDisponibles.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblDisponibles.setBounds(493, 357, 200, 41);
		contentPane.add(lblDisponibles);
		
		JButton ModificarGuardar = new JButton("Modificar");
		boolean flag =false;
		
		ModificarGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModificarGuardar.setText("Guardar");
			}
		});
		ModificarGuardar.setForeground(new Color(245, 245, 245));
		ModificarGuardar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		ModificarGuardar.setFocusPainted(false);
		ModificarGuardar.setBorderPainted(false);
		ModificarGuardar.setBackground(new Color(10, 10, 10));
		ModificarGuardar.setBounds(397, 520, 300, 80);
		contentPane.add(ModificarGuardar);
		
		precio = new JTextField();
		precio.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		precio.setEditable(false);
		precio.setColumns(10);
		precio.setBounds(628, 247, 236, 80);
		contentPane.add(precio);
		
		unidades = new JTextField();
		unidades.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		unidades.setEditable(false);
		unidades.setColumns(10);
		unidades.setBounds(628, 338, 236, 80);
		contentPane.add(unidades);
	}
}


