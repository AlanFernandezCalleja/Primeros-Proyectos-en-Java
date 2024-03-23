package micalculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class panelCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField inputxt;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public panelCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel.add(lblNewLabel_1);
		
		final JTextPane outputtxt = new JTextPane();
		panel.add(outputtxt);
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		
		JButton btnAbrir = new JButton("Abrir");
		
		
		panel.add(btnAbrir);
		
		inputxt = new JTextField();
		
		panel.add(inputxt);
		inputxt.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		
		panel.add(btnCerrar);
		
		JButton btn_Lanzar = new JButton("Lanzar");
		
		panel.add(btn_Lanzar);
		
		JButton btnAvanzar = new JButton("Avanzar");
		panel.add(btnAvanzar);
		
		JButton btnRetroceder = new JButton("Retroceder");
		btnRetroceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputtxt.setText("Retrocediendo");
			}
		});
		panel.add(btnRetroceder);
		
		
		///Seccion de accion de cada botón
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto=inputxt.getText();
				System.out.println();
				System.out.print(texto);
				inputxt.setText("");
			}
		});
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("Cerrar");
				try {
					outputtxt.setText("Cerrando...");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println();
			}
		});
	}

}
