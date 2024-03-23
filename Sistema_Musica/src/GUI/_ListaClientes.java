package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Persona.Cliente;
import Product.Instrumento;

public class _ListaClientes extends JFrame implements InterfaceProgram{

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					_ListaClientes frame = new _ListaClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public _ListaClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, (int)(largo_boton1*2.3), alto_menu+150);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 153, 1111, 386);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(247, 247, 247));
		table.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		model = new DefaultTableModel();
		table.setModel(model);
		model.addColumn("Nombre");
		model.addColumn("Correo");
		model.addColumn("Celular");
		model.addColumn("Fecha Registro");
		model.addColumn("CI");
		table.setRowHeight(35);
		//table.setColumnModel(null);
		//TableColumnModel column= new TableColumnModel();
		//TableColumnModel col = new TableColumnModel();
		scrollPane.setViewportView(table);
		
		JLabel titulo = new JLabel("Lista Clientes");
		titulo.setOpaque(true);
		titulo.setBackground(BLACK_BACKGROUD);
		titulo.setForeground(WHITE_FONT);
		titulo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 45));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0, 0, 1150, 142);
		contentPane.add(titulo);
		
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
		salir.setBounds(0, 550, (int)(largo_boton1 * 0.4), alto_boton);
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
		
		JButton Mostrar = new JButton("Mostrar");
		Mostrar.setBackground(BLACK_BACKGROUD);
		Mostrar.setForeground(WHITE_FONT);
		Mostrar.setBorderPainted(false);
		Mostrar.setFocusPainted(false);
		Mostrar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillTable();
			}
		});
		Mostrar.setBounds(850, 550, (int)(largo_boton1*0.6), alto_boton);
		Mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                Mostrar.setBackground(GREY_SHADOW);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Mostrar.setBackground(BLACK_BACKGROUD);
            }
        });
		contentPane.add(Mostrar);
	}
	public void fillTable(){
		ArrayList <Cliente> clientes= new ArrayList<Cliente>();
		clientes = new Cliente().listaClientes();
		for (Cliente cliente : clientes) {
			Object [] row = new Object[7];
			row[0]=cliente.getName();
			row[1] =cliente.getCorreo();
			row[2] = cliente.getCel();
			row[3] = cliente.getRegistration();
			row[4] = cliente.getCi();
			model.addRow(row);
			
		}
	}
}
