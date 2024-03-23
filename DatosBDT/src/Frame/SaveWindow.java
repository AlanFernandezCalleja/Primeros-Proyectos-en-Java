package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SQL.CRUDconexion;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaveWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textName;
	private JTextField textPosition;

	/**
	 * Launch the application.
	 */
	
		
	public void run() {
			try {
				SaveWindow frame = new SaveWindow();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	

	/**
	 * Create the frame.
	 */
	public SaveWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textid = new JTextField();
		textid.setBounds(161, 55, 86, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(161, 110, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textPosition = new JTextField();
		textPosition.setBounds(161, 169, 86, 20);
		contentPane.add(textPosition);
		textPosition.setColumns(10);
		
		//setting classes 
		
		//
		JButton btnSave = new JButton("Guardar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textName.getText().isEmpty() || textPosition.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Faltan ingresar datos","Complete datos",JOptionPane.ERROR_MESSAGE);
				}else {
					CRUDconexion objcrud = new CRUDconexion(textName.getText(),textPosition.getText());
					objcrud.insertar();
					textName.setText("");
					textPosition.setText("");
				}
				
				
				
			}
		});
		btnSave.setBounds(161, 227, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchId().run2();
				dispose();
			}
		});
		btnBuscar.setBounds(335, 227, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lbl_1 = new JLabel("ID");
		lbl_1.setBounds(36, 58, 46, 14);
		contentPane.add(lbl_1);
		
		JLabel lbl_2 = new JLabel("Nombre");
		lbl_2.setBounds(36, 113, 46, 14);
		contentPane.add(lbl_2);
		
		JLabel lbl_3 = new JLabel("Position");
		lbl_3.setBounds(36, 172, 46, 14);
		contentPane.add(lbl_3);
		
		JButton Lista = new JButton("Lista");
		Lista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Lista().run();
				dispose();
				
			}
		});
		Lista.setBounds(335, 193, 89, 23);
		contentPane.add(Lista);
	}
}
