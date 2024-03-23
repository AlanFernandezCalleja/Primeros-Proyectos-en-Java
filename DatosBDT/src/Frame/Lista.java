package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clase.Cliente;
import SQL.CRUDconexion;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista extends JFrame {

	private JPanel contentPane;
	private JTable tablaClientes;
	DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					Lista frame = new Lista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	/**
	 * Create the frame.
	 */
	public Lista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 16, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(122, 16, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion");
		lblNewLabel_2.setBounds(244, 16, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton mostrar = new JButton("Mostrar");
		mostrar.setBounds(168, 227, 89, 23);
		mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llenartabla();
				//PanelLista.setText(listaDelosClientes);
			}
		});
		contentPane.add(mostrar);
		
		JButton Volver = new JButton("Volver");
		Volver.setBounds(0, 238, 89, 23);
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SaveWindow().run();
				dispose();
			}
		});
		contentPane.add(Volver);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 41, 345, 181);
		contentPane.add(scrollPane);
		
		tablaClientes = new JTable();
		modelo = new DefaultTableModel();
		tablaClientes.setModel(modelo);
		modelo.addColumn("Nombre");
		modelo.addColumn("Direccion");
		
		scrollPane.setViewportView(tablaClientes);
		
	}
	public void llenartabla() {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes = new CRUDconexion("","").listaClientes();
		//String listaDelosClientes="";
		for (Cliente cliente : listaClientes) {
			Object [] fila = new Object[3];
			fila[0] =cliente.getNombre();
			fila[1] =cliente.getDireccion();
			modelo.addRow(fila);
		}
	}
	
	
}
