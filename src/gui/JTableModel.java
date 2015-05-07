package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableModel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableModel window = new JTableModel();
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
	public JTableModel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String [] nombreColumnas = {"Jugador","Equipo"};
		
		List<Jugador> listaJugador = new ArrayList<Jugador>();
		
		Jugador j1=new Jugador("Casillas","Real Madrid");
		Jugador j2=new Jugador("Ronaldo","Real Madrid");
		Jugador j3=new Jugador("Messi","Barsa");
		listaJugador.add(j1);listaJugador.add(j2);listaJugador.add(j3);
		
		JTableModelJugadores tableModel = new JTableModelJugadores(listaJugador);
		JTable tablaJugadores = new JTable(tableModel);
		
		
		JScrollPane barra = new JScrollPane(tablaJugadores);
		frame.add(barra,BorderLayout.NORTH);
		
		//frame.add(tabla.getTableHeader(),BorderLayout.NORTH);//no hace falta al añadirlo al scrollpane
		//frame.add(barra,BorderLayout.CENTER);
	}

}
