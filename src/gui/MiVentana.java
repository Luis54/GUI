package gui;

import java.awt.Dimension;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class MiVentana {
	
	public  void creaGUI(){
		JFrame ventana = new JFrame(); //creamos un objeto JFrame ventana
		ventana.setTitle("Mi primeta ventana en swing");//definimos el titulo de la ventana
		ventana.setSize(300, 200); //definimos el tamaña de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//decirle que tiene que jacer swing al cerrar la ventana
		ventana.setLocationRelativeTo(null);//te centra la ventana en el centro
		ventana.setMinimumSize(new Dimension(100,100));//te deja un minimo de dimension
		ventana.setResizable(false);//bloqueamos la ventana para que no sa redimensionable
		ventana.setVisible(true); // que la venta se muestre ya que si no lo ponemos por defecto esta false
		JButton boton = new JButton();//crear boton
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton.setHorizontalAlignment(SwingConstants.LEFT);
		boton.setText("Pulsa aqui!!!");//crear boton y poner texto
		ventana.getContentPane().add(boton);//introducimos el boton en la ventana
		
		JButton BotonIzquirdo = new JButton("boton izquirdo");
		BotonIzquirdo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ventana.getContentPane().add(BotonIzquirdo, BorderLayout.WEST);
		
		JButton BotonDerecho = new JButton("boton derecho");
		ventana.getContentPane().add(BotonDerecho, BorderLayout.EAST);
		
		JButton BotonSur = new JButton("boton derecho ");
		BotonSur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ventana.getContentPane().add(BotonSur, BorderLayout.SOUTH);
		
		JButton BotonNorte = new JButton("Boton norte");
		ventana.getContentPane().add(BotonNorte, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		
		MiVentana app = new MiVentana();
		app.creaGUI();
	}
}
