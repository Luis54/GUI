package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutDemo window = new CardLayoutDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CardLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//establecemos el layout del frame a BorderLayout
		BorderLayout miLayout = new BorderLayout();
		frame.setLayout(miLayout);
		
		//Creamos botones
		// subimos mas arriba el cars y el cardLayout para que puede cojer los objetos
		CardLayout cardLayout = new CardLayout();
		JPanel cards = new JPanel();
		JButton boton1 = new JButton("Anterior");
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.previous(cards);
			}
		});
		JButton boton2 = new JButton("Siguiente");
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.previous(cards);
			}
		});
		JPanel panelNorte = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panelNorte,BoxLayout.X_AXIS);
		panelNorte.setLayout(boxLayout);
		panelNorte.add(boton1);
		panelNorte.add(boton2);
		frame.add(panelNorte,BorderLayout.NORTH);
		
		//creamos un cardlayout
		//CardLayout cardLayout = new CardLayout();
		
		//creamos un panel cards
		//JPanel cards = new JPanel();
		
		//creamos un cardLayout y le añadimos un layout al panel
		
		cards.setLayout(cardLayout);
		
		//creamos un panel que contiene una etiqueta
		JPanel panel1 = new JPanel();
		JLabel etiqueta1 = new JLabel("Este es el panel numero 1"); 
		panel1.add(etiqueta1);
		
		//creamos un panel que contiene una etiqueta
		JPanel panel2 = new JPanel();
		JLabel etiqueta2 = new JLabel("Este es el panel numero 2"); 
		panel2.add(etiqueta2);
		
		JPanel panel3 = new JPanel();
		JLabel etiqueta3 = new JLabel("Este es el panel numero 3"); 
		panel3.add(etiqueta3);
		
		//añadimos los paneles con los texto al cardlayout
		cards.add(panel1);
		cards.add(panel2);
		cards.add(panel3);
		
		//añadimos el cardlayout al frame principal
		frame.add(cards,BorderLayout.CENTER);
		
		/*frame.add(boton1,BorderLayout.NORTH);
		frame.add(boton2,BorderLayout.NORTH); esto no se puede hacer ya que necesitamos 
		un contendor ya que se machacaria*/
	}

}
