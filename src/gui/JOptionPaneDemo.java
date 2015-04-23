package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JOptionPaneDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneDemo window = new JOptionPaneDemo();
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
	public JOptionPaneDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JOptionPaneDemo.class.getResource("/imagenes/icono.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel miPanel = new JPanel();
		frame.getContentPane().add(miPanel,BorderLayout.CENTER);
		
		JButton boton1 = new JButton("Dialogo 1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Ha ocurrido un error grave!", "Error",JOptionPane.ERROR_MESSAGE);
			}
		});
		miPanel.add(boton1);
		
		JButton boton2 = new JButton("Dialogo de Mensaje");
		Object[] options = {"Opcion 1","Opcion 2","Opcion 3"};
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showOptionDialog(frame, "Selecciona una opcion", "Selecciona una opcion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,null , null);
				if(respuesta == JOptionPane.OK_OPTION)
				boton2.setVisible(false);
			}
		});
		miPanel.add(boton2);
		JButton boton3 = new JButton("Dialogo con entrada a datos");
		Object[] options2 = {"Jaen","Cordoba","Granada"};
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String ciudad = (String)JOptionPane.showInputDialog(frame,"Tu ciudad preferida","Selecciona una ciudad",JOptionPane.PLAIN_MESSAGE,null,options2,options[0]);
			if(ciudad == null)
				JOptionPane.showMessageDialog(frame, "No selecionado ciudad");
			}
		});
		miPanel.add(boton3);
		JButton boton4 = new JButton("Dialogo con entrada a datos");
		Object[] options3 = {"Jaen","Cordoba","Granada"};
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String ciudad = (String)JOptionPane.showInputDialog(frame,"Tu ciudad preferida","Selecciona una ciudad",JOptionPane.PLAIN_MESSAGE);
			if(ciudad == null)
				JOptionPane.showMessageDialog(frame, "No ciudad escrita");
			}
		});
		miPanel.add(boton4);
		JButton boton5 = new JButton("Dialogo personalido");
		Object[] options4 = {"Jaen","Cordoba","Granada"};
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialogDemo miDialogo = new JDialogDemo(frame);
			
			}
		});
		miPanel.add(boton5);
		
	}

}
