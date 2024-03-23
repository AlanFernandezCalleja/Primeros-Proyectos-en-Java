package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class menuInstrumentos extends JFrame implements InterfaceProgram {

	private JPanel contentPane;


			public void run() {
				try {
					menuInstrumentos frame = new menuInstrumentos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	public menuInstrumentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, largo_boton1, ancho_menu);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton AgregarIns = new JButton("Nuevo Instrumento");
		AgregarIns.setBackground(BLACK_BACKGROUD);
		AgregarIns.setForeground(WHITE_FONT);
		AgregarIns.setBorderPainted(false);
		AgregarIns.setFocusPainted(false);
		AgregarIns.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		AgregarIns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new _agregarInstrumento().run();
				dispose();
			}
		});
		AgregarIns.setBounds(0, 190, largo_boton1, alto_boton);
		AgregarIns.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                AgregarIns.setBackground(GREY_SHADOW);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                AgregarIns.setBackground(BLACK_BACKGROUD);
            }
        });
		contentPane.add(AgregarIns);
		
		JButton Buscar = new JButton("Buscar Instrumento");
		Buscar.setBackground(BLACK_BACKGROUD);
		Buscar.setForeground(WHITE_FONT);
		Buscar.setBorderPainted(false);
		Buscar.setFocusPainted(false);
		Buscar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new _BuscarInstrumento().run();
				dispose();
			}
		});
		Buscar.setBounds(0, 267, largo_boton1, alto_boton);
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
		
		JButton Lista = new JButton("Lista Instrumentos");
		Lista.setBackground(BLACK_BACKGROUD);
		Lista.setForeground(WHITE_FONT);
		Lista.setFocusPainted(false);
		Lista.setBorderPainted(false);
		Lista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new _ListaInstrumentos().run();
				dispose();
			}
		});
		Lista.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Lista.setBounds(0, 345, largo_boton1, alto_boton);
		Lista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                Lista.setBackground(GREY_SHADOW);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Lista.setBackground(BLACK_BACKGROUD);
            }
        });
		contentPane.add(Lista);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.setBackground(ALERT_BUTTON);
		Regresar.setForeground(WHITE_FONT);
		Regresar.setBorderPainted(false);
		Regresar.setFocusPainted(false);
		Regresar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PantallaInicio().run();;
				dispose();
			}
		});
		Regresar.setBounds(0, 420, largo_boton1, alto_boton);
		Regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                Regresar.setBackground(new Color (170,20,20));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Regresar.setBackground(ALERT_BUTTON);
            }
        });
		contentPane.add(Regresar);
		
		JLabel lblNewLabel = new JLabel("Opciones");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(BLACK_BACKGROUD);
		lblNewLabel.setForeground(WHITE_FONT);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 500, 191);
		contentPane.add(lblNewLabel);
	}
}
