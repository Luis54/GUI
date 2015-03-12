package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.BorderLayout;

public class MiVentana3 {

	private JFrame Ventana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana3 window = new MiVentana3();
					window.Ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiVentana3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Ventana = new JFrame();
		Ventana.setFont(new Font("DejaVu Sans", Font.ITALIC, 12));
		Ventana.setTitle("Mi ventana desde WindowsBuilder");
		Ventana.setBounds(100, 100, 450, 300);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New button");
		Ventana.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		Ventana.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("New button");
		Ventana.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("New button");
		Ventana.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("New button");
		Ventana.getContentPane().add(btnNewButton_4, BorderLayout.EAST);
	}


}
