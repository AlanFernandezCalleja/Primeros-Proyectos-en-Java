package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clase.Cliente;
import SQL.CRUDconexion;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchId extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscador;
	private JTextField TxtID;
	private JTextField txtDireccion;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	
	public void run2() {
				try {
					SearchId frame = new SearchId();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public SearchId() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblt = new JLabel("ID : ");
		lblt.setBounds(27, 23, 46, 14);
		contentPane.add(lblt);
		
		txtBuscador = new JTextField();
		txtBuscador.setBounds(83, 20, 218, 20);
		contentPane.add(txtBuscador);
		txtBuscador.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente ClienteBuscado = new CRUDconexion(null,null).buscar(txtBuscador.getText());
				txtDireccion.setText(ClienteBuscado.getDireccion());
				txtName.setText(ClienteBuscado.getNombre());
			}
		});
		btnBuscar.setBounds(318, 19, 89, 23);
		contentPane.add(btnBuscar);
		
		TxtID = new JTextField();
		TxtID.setBounds(144, 183, 140, 20);
		contentPane.add(TxtID);
		TxtID.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(144, 128, 140, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(144, 77, 140, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE");
		lblNewLabel_1.setBounds(27, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DIRECCION");
		lblNewLabel_2.setBounds(27, 131, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setBounds(27, 186, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SaveWindow().run();
				dispose();
			}
		});
		btnVolver.setBounds(2, 238, 89, 23);
		contentPane.add(btnVolver);
	}


	
}
