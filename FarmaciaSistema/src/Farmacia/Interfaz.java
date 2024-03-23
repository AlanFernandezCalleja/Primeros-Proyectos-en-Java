package Farmacia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txt_p_Antigripal;
	private JTextField txt_c_Antigripal;
	private JTextField txt_p_Antibi;
	private JTextField txt_p_Antip;
	private JTextField txt_p_vit;
	private JTextField txt_c_Antibi;
	private JTextField txt_c_Antip;
	private JTextField txt_c_vit;
	private JTextField r1;
	private JTextField r2;
	private JTextField r3;
	private JTextField r4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setTitle("Farmacia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel Background = new JPanel();
		contentPane.add(Background);
		Background.setLayout(null);
		
		JLabel t_farmacia = new JLabel("Farmacia");
		t_farmacia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		t_farmacia.setBounds(30, 30, 108, 31);
		Background.add(t_farmacia);
		
		JLabel t_farmacia_1 = new JLabel("Precio");
		t_farmacia_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		t_farmacia_1.setBounds(250, 30, 108, 31);
		Background.add(t_farmacia_1);
		
		JLabel t_farmacia_2 = new JLabel("Cantidad");
		t_farmacia_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		t_farmacia_2.setBounds(380, 30, 108, 31);
		Background.add(t_farmacia_2);
		
		JLabel lblNewLabel = new JLabel("Antigripal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(30, 100, 108, 19);
		Background.add(lblNewLabel);
		
		JLabel lblAntibiotico = new JLabel("Antibiotico");
		lblAntibiotico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAntibiotico.setBounds(30, 150, 108, 19);
		Background.add(lblAntibiotico);
		
		JLabel lblAnepietico = new JLabel("Anepietico");
		lblAnepietico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnepietico.setBounds(30, 200, 108, 19);
		Background.add(lblAnepietico);
		
		JLabel lblVitamina = new JLabel("Vitamina");
		lblVitamina.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVitamina.setBounds(30, 250, 108, 19);
		Background.add(lblVitamina);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_c_Antibi.setText("0");
				txt_c_Antigripal.setText("0");
				txt_c_Antip.setText("0");
				txt_c_vit.setText("0");
				
				txt_p_Antibi.setText("0.0");
				txt_p_Antigripal.setText("0.0");
				txt_p_Antip.setText("0.0");
				txt_p_vit.setText("0.0");
				
				r1.setText("");
				r2.setText("");
				r3.setText("");
				r4.setText("");
				
			}
		});
		btnNewButton.setBounds(30, 336, 120, 30);
		Background.add(btnNewButton);
		
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//precio
				double p_anti = Double.parseDouble(txt_p_Antigripal.getText());
				double p_bio = Double.parseDouble(txt_p_Antibi.getText());
				double p_ane = Double.parseDouble(txt_p_Antip.getText());
				double p_vit = Double.parseDouble(txt_p_vit.getText());
				//cantidad
				double c_anti = Double.parseDouble(txt_c_Antigripal.getText());
				double c_bio = Double.parseDouble(txt_c_Antibi.getText());
				double c_ane = Double.parseDouble(txt_c_Antip.getText());
				double c_vit = Double.parseDouble(txt_c_vit.getText());
				//resultados
				double r_1= p_anti * c_anti ;
				double r_2= p_bio * c_bio ;
				double r_3= p_ane * c_ane ;
				double r_4= p_vit * c_vit ;
				
				r_1 = Math.round(r_1*100.0)/100.0;
				r_2 = Math.round(r_2*100.0)/100.0;
				r_3 = Math.round(r_3*100.0)/100.0;
				r_4 = Math.round(r_4*100.0)/100.0;
				//Print Resultados
				r1.setText(String.valueOf(r_1));

				r2.setText(String.valueOf(r_2));

				r3.setText(String.valueOf(r_3));

				r4.setText(String.valueOf(r_4));
			}
		});
		calcular.setBounds(554, 336, 120, 30);
		Background.add(calcular);
		
		txt_p_Antigripal = new JTextField();
		txt_p_Antigripal.setText("0.0");
		txt_p_Antigripal.setBounds(250, 101, 86, 20);
		Background.add(txt_p_Antigripal);
		txt_p_Antigripal.setColumns(10);
		
		txt_c_Antigripal = new JTextField();
		txt_c_Antigripal.setText("0");
		txt_c_Antigripal.setColumns(10);
		txt_c_Antigripal.setBounds(380, 101, 86, 20);
		Background.add(txt_c_Antigripal);
		
		txt_p_Antibi = new JTextField();
		txt_p_Antibi.setText("0.0");
		txt_p_Antibi.setBounds(250, 151, 86, 20);
		Background.add(txt_p_Antibi);
		txt_p_Antibi.setColumns(10);
		
		txt_p_Antip = new JTextField();
		txt_p_Antip.setText("0.0");
		txt_p_Antip.setBounds(250, 201, 86, 20);
		Background.add(txt_p_Antip);
		txt_p_Antip.setColumns(10);
		
		txt_p_vit = new JTextField();
		txt_p_vit.setText("0.0");
		txt_p_vit.setBounds(250, 251, 86, 20);
		Background.add(txt_p_vit);
		txt_p_vit.setColumns(10);
		
		txt_c_Antibi = new JTextField();
		txt_c_Antibi.setText("0");
		txt_c_Antibi.setBounds(380, 151, 86, 20);
		Background.add(txt_c_Antibi);
		txt_c_Antibi.setColumns(10);
		
		txt_c_Antip = new JTextField();
		txt_c_Antip.setText("0");
		txt_c_Antip.setBounds(380, 201, 86, 20);
		Background.add(txt_c_Antip);
		txt_c_Antip.setColumns(10);
		
		txt_c_vit = new JTextField();
		txt_c_vit.setText("0");
		txt_c_vit.setBounds(380, 251, 86, 20);
		Background.add(txt_c_vit);
		txt_c_vit.setColumns(10);
		
		r1 = new JTextField();
		r1.setBounds(588, 101, 86, 20);
		Background.add(r1);
		r1.setColumns(10);
		
		r2 = new JTextField();
		r2.setBounds(588, 151, 86, 20);
		Background.add(r2);
		r2.setColumns(10);
		
		r3 = new JTextField();
		r3.setBounds(588, 201, 86, 20);
		Background.add(r3);
		r3.setColumns(10);
		
		r4 = new JTextField();
		r4.setBounds(588, 251, 86, 20);
		Background.add(r4);
		r4.setColumns(10);
	}
}
