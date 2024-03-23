package inter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CRUD extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUD frameP = new CRUD();
					frameP.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CRUD() {
		setTitle("Programa CRUD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 850, 550);
		ImageIcon backgroundImg =new ImageIcon("C:\\Users\\alan\\Documents\\BD(MisBasesdeDatos)\\CRUD\\src\\assets\\background.jpg");
		//panel.setIcon(new ImageIcon(backgroundImg.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
		contentPane.add(panel);
		
		JButton xButtonSalir = new JButton("");
		xButtonSalir.setBounds(831, 0, 20, 20);
		ImageIcon img =new ImageIcon("C:\\Users\\alan\\Documents\\BD(MisBasesdeDatos)\\CRUD\\src\\assets\\remove.png");
		xButtonSalir.setIcon(new ImageIcon(img.getImage().getScaledInstance(14, 14, Image.SCALE_SMOOTH)));
		xButtonSalir.setForeground(new Color(0, 128, 192));
		xButtonSalir.setFocusPainted(false);
		xButtonSalir.setBorderPainted(false);
		xButtonSalir.setContentAreaFilled(false);
		xButtonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		xButtonSalir.setFont(new Font("Tahoma", Font.PLAIN, 9));
		xButtonSalir.setOpaque(false);
		
		panel.setLayout(null);
		
		JButton xCliente = new JButton("Nuevo Cliente");
		xCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla2 p2 = new pantalla2();
				p2.run();
				dispose();
			}
		});
		
		JButton xAlmacen = new JButton("Almacen");
		xAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		xAlmacen.setForeground(new Color(248, 248, 248));
		xAlmacen.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 19));
		xAlmacen.setFocusPainted(false);
		xAlmacen.setBorderPainted(false);
		xAlmacen.setBackground(new Color(3, 3, 3));
		xAlmacen.setBounds(171, 261, 496, 80);
		xAlmacen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                xAlmacen.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                xAlmacen.setBackground(new Color(3, 3, 3));
            }
        });
		
		
		panel.add(xAlmacen);
		
		
		xCliente.setForeground(new Color(248, 248, 248));
		xCliente.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 19));
		xCliente.setFocusPainted(false);
		xCliente.setBorderPainted(false);
		xCliente.setBackground(new Color(3, 3, 3));
		xCliente.setBounds(171, 98, 496, 80);
		panel.add(xCliente);
		
		xCliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                xCliente.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                xCliente.setBackground(new Color(3, 3, 3));
            }
        });
		
		
		
		panel.add(xButtonSalir);
		
		JButton xCompra = new JButton("Realizar Venta");
		xCompra.setHorizontalAlignment(SwingConstants.LEFT);
		xCompra.setBounds(171, 470, 496, 80);
		xCompra.setForeground(new Color(248, 248, 248));
		xCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		xCompra.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 19));
		xCompra.setBackground(new Color(3, 3, 3));
		xCompra.setFocusPainted(false);
		xCompra.setBorderPainted(false);
		
		xCompra.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent arg0) {
	                xCompra.setBackground(new Color(30, 30, 30));
	            }
	            @Override
	            public void mouseExited(MouseEvent e) {
	                xCompra.setBackground(new Color(3, 3, 3));
	            }
	    });
		
		
		//xCompra.setContentAreaFilled(true);
		panel.add(xCompra);
		
		JButton xRegistrar = new JButton("Agregar Instrumento");
		xRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		xRegistrar.setForeground(new Color(248, 248, 248));
		xRegistrar.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 19));
		xRegistrar.setFocusPainted(false);
		xRegistrar.setBorderPainted(false);
		xRegistrar.setBackground(new Color(3, 3, 3));
		xRegistrar.setBounds(171, 176, 496, 80);
		xRegistrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                xRegistrar.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                xRegistrar.setBackground(new Color(3, 3, 3));
            }
        });
		panel.add(xRegistrar);
		
		JLabel Titulo = new JLabel("Sistema Tienda de Instrumentos");
		Titulo.setBounds(0, 0, 851, 99);
		Titulo.setBackground(new Color(0, 0, 0));
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 49));
		Titulo.setOpaque(true);
		panel.add(Titulo);
		
		JLabel Negro = new JLabel("");
		Negro.setBackground(new Color(0, 0, 0));
		Negro.setOpaque(true);
		Negro.setBounds(171, 98, 496, 452);
		panel.add(Negro);
		
		JLabel Fondo = new JLabel("New label");
		Fondo.setBounds(0, 0, 851, 550);
		Fondo.setOpaque(true);
		Fondo.setIcon(new ImageIcon(backgroundImg.getImage().getScaledInstance(850, 550, Image.SCALE_SMOOTH)));
		panel.add(Fondo);
	}
}
