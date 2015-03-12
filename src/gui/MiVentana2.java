package gui;


import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;



public class MiVentana2 {

	private JFrame ventana;
	
	
	public MiVentana2() {
		
		this.ventana = new JFrame("Titulo de ventana");
		ventana.setTitle("Titulo de ventana");
		ventana.setSize(300, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		
		JLabel etiquete = new JLabel("Mi etiquete");
		ventana.add(etiquete, BorderLayout.NORTH);
		
		
		JButton boton = new JButton("Aceptar");
		ventana.getContentPane().add(boton, BorderLayout.WEST);
		boton.setSize((new Dimension(400,1500)));
		
		JLabel etiqueta2 = new JLabel("Mi etiquete2");
		ventana.add(etiqueta2, BorderLayout.SOUTH);
		
		JTextPane txtpnLuis = new JTextPane();
		txtpnLuis.setText("luis");
		ventana.add(txtpnLuis, BorderLayout.EAST);
		
		
		
		
	}
	
	public static void main(String[] args) {
		MiVentana2 app = new MiVentana2();
		
	}
}
