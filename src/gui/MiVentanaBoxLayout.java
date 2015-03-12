package gui;

import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentanaBoxLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentanaBoxLayout window = new MiVentanaBoxLayout();
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
	public MiVentanaBoxLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS);
		frame.setLayout(boxLayout);
		
		frame.add(Box.createHorizontalStrut(25));
		
		JButton boton1 = new JButton("Boton 1");
		frame.add(boton1);
		
		frame.add(Box.createHorizontalGlue());
		
		JButton boton2 = new JButton("Boton 2");
		frame.add(boton2);
		
		frame.add(Box.createHorizontalGlue());
				
		JButton boton3 = new JButton("Boton 3");
		frame.add(boton3);
		
		frame.add(Box.createHorizontalGlue());
		
		JButton boton4 = new JButton("Boton 4");
		frame.add(boton4);
		
		frame.add(Box.createHorizontalStrut(25));
	}

}
