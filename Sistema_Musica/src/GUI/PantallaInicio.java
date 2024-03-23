package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class PantallaInicio extends JFrame implements InterfaceProgram{

	private JPanel contentPane;

	public void run() {
			try {
					PantallaInicio frameP = new PantallaInicio();
					frameP.setVisible(true);							
				} catch (Exception e) {
					e.printStackTrace();
				}
		}


	public PantallaInicio() {
		setTitle("Sistema");
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
		
		JButton menuInstrumento = new JButton("Instrumentos");
		menuInstrumento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuInstrumentos().run();
				dispose();
			}
		});
		
		JButton menuClientes = new JButton("Clientes");
		menuClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuClientes().run();
				dispose();
			}
		});
		menuClientes.setForeground(new Color(248, 248, 248));
		menuClientes.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 19));
		menuClientes.setFocusPainted(false);
		menuClientes.setBorderPainted(false);
		menuClientes.setBackground(new Color(3, 3, 3));
		menuClientes.setBounds(172, 252, largo_boton1, alto_boton);
		menuClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                menuClientes.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                menuClientes.setBackground(new Color(3, 3, 3));
            }
        });
		
		JButton xCompra = new JButton("Realizar Venta");
		xCompra.setHorizontalAlignment(SwingConstants.LEFT);
		xCompra.setBounds(171, 470, largo_boton1, alto_boton);
		xCompra.setForeground(new Color(248, 248, 248));
		xCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentaPagina().run();
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
		
		JButton btnEmpleados = new JButton("Empleados");
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuEmpleados().run();
				dispose();
			}
		});
		btnEmpleados.setForeground(new Color(248, 248, 248));
		btnEmpleados.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 19));
		btnEmpleados.setFocusPainted(false);
		btnEmpleados.setBorderPainted(false);
		btnEmpleados.setBackground(new Color(3, 3, 3));
		btnEmpleados.setBounds(171, 332, largo_boton1, alto_boton);
		panel.add(btnEmpleados);
		btnEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                btnEmpleados.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnEmpleados.setBackground(new Color(3, 3, 3));
            }
        });
		
		//xCompra.setContentAreaFilled(true);
		panel.add(xCompra);
		
		
		panel.add(menuClientes);
		
		
		menuInstrumento.setForeground(new Color(248, 248, 248));
		menuInstrumento.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 19));
		menuInstrumento.setFocusPainted(false);
		menuInstrumento.setBorderPainted(false);
		menuInstrumento.setBackground(new Color(3, 3, 3));
		menuInstrumento.setBounds(171, 98, largo_boton1, alto_boton);
		panel.add(menuInstrumento);
		
		menuInstrumento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                menuInstrumento.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                menuInstrumento.setBackground(new Color(3, 3, 3));
            }
        });
		
		
		
		panel.add(xButtonSalir);
		
		JButton menuComponente = new JButton("Componentes");
		menuComponente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuComponentes().run();
				dispose();
			}
		});
		menuComponente.setForeground(new Color(248, 248, 248));
		menuComponente.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 19));
		menuComponente.setFocusPainted(false);
		menuComponente.setBorderPainted(false);
		menuComponente.setBackground(new Color(3, 3, 3));
		menuComponente.setBounds(171, 176, largo_boton1, alto_boton);
		menuComponente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                menuComponente.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                menuComponente.setBackground(new Color(3, 3, 3));
            }
        });
		panel.add(menuComponente);
		
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
		Negro.setBounds(171, 98, largo_boton1, 450);
		panel.add(Negro);
		
		JLabel Fondo = new JLabel("New label");
		Fondo.setBounds(0, 0, 851, 550);
		Fondo.setOpaque(true);
		Fondo.setIcon(new ImageIcon(backgroundImg.getImage().getScaledInstance(850, 550, Image.SCALE_SMOOTH)));
		panel.add(Fondo);
	}
}
