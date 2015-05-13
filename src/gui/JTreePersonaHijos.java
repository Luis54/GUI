package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JTreePersonaHijos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreePersonaHijos window = new JTreePersonaHijos();
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
	public JTreePersonaHijos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PersonaHijos arbol = crearArbol();
		arbol.pintaArbol();
	}
	private PersonaHijos crearArbol(){
		PersonaHijos raiz = new PersonaHijos("Antonio", "Lopez", "Sanchez");
		
		PersonaHijos Elena = new PersonaHijos("Elena", "Lopez", "Rodriguez");
		PersonaHijos Pedro = new PersonaHijos("Pedro", "Lopez", "Sanchez");
		
		raiz.addHijo(Elena);
		raiz.addHijo(Pedro);
		
		PersonaHijos pilar = new PersonaHijos("Pilar", "Molina", "Lopez");
		Elena.addHijo(pilar);
		
		return raiz;
		
	}
}
