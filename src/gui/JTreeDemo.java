package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreeDemo window = new JTreeDemo();
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
	public JTreeDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DefaultMutableTreeNode datosJugadores = crearArbol();
		JTree arbolJugadores = new JTree(datosJugadores);
		
		JScrollPane scrool = new JScrollPane(arbolJugadores);
		
		frame.getContentPane().add(scrool,BorderLayout.CENTER);
	}
	
	private DefaultMutableTreeNode crearArbol(){
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Equipos");
		
		DefaultMutableTreeNode juve = new DefaultMutableTreeNode("Juve");
		DefaultMutableTreeNode barsa = new DefaultMutableTreeNode("Barsa");
		DefaultMutableTreeNode jaen = new DefaultMutableTreeNode("Jaen");
		
		raiz.add(juve);raiz.add(barsa);raiz.add(jaen);
		
		DefaultMutableTreeNode jnando = new DefaultMutableTreeNode("Nando");
		DefaultMutableTreeNode montero = new DefaultMutableTreeNode("Montero");
		jaen.add(jnando); jaen.add(montero);
		
		DefaultMutableTreeNode morata = new DefaultMutableTreeNode("Morata");
		juve.add(morata);
		
		DefaultMutableTreeNode messi = new DefaultMutableTreeNode("Messi");
		DefaultMutableTreeNode xavi = new DefaultMutableTreeNode("Xavi");
		DefaultMutableTreeNode iniesta = new DefaultMutableTreeNode("Iniesta");
		barsa.add(messi);
		barsa.add(xavi);
		barsa.add(iniesta);
		
		return raiz;
	}

}
