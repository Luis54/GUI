package gui;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JFramePruebas {
	private JFrame ventana;
	
	public JFramePruebas() {
		// TODO Auto-generated constructor stub
		ventana = new JFrame("Prueba ventana");
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.setIconImage(Toolkit.getDefaultToolkit().getImage(JFramePruebas.class.getResource("/imagenes/icono.png")));
		JButton boton = new JButton("Boton prueba");
		JButton boton2 = new JButton("Boton prueba");
		FlowLayout miFlowLayout = new FlowLayout(FlowLayout.LEFT,10,10);
		ventana.getContentPane().setLayout(miFlowLayout);
		ventana.getContentPane().add(boton);
		ventana.getContentPane().add(boton2);
		ventana.setBounds(0, 0, 300, 200);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				int valor = JOptionPane.showConfirmDialog(ventana, "Esta seguro que quieres cerrar la aplicacion");
				if(valor==JOptionPane.OK_OPTION){
					ventana.dispose();
					System.exit(1);
				}
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	public static void main(String[] args) {
		new JFramePruebas();
		
	}
}
