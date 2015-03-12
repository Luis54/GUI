package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutDemo {
	
	JFrame ventana;
	
	public FlowLayoutDemo(String Titulo) {
		ventana = new JFrame(Titulo);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(300, 100);
		ventana.setVisible(true);
		
		JPanel panelCentral = new JPanel();
		
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JButton boton3 = new JButton("Boton 3");
		JButton boton4 = new JButton("Boton 4");
		JTextField textofiedl = new JTextField(40);
		JLabel etiqueta = new JLabel("Etiqueta");
		
		panelCentral.add(boton1);
		panelCentral.add(boton2);
		panelCentral.add(boton3);
		panelCentral.add(boton4);
		panelCentral.add(textofiedl);
		panelCentral.add(etiqueta);
		
		ventana.add(panelCentral,BorderLayout.CENTER);
		
		FlowLayout flow = new FlowLayout();
		ventana.setLayout(flow);
	}
	public static void main(String[] args) {
		new FlowLayoutDemo("Prueba FlowLayout");
	}
}
