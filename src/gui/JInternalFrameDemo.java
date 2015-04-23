package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JInternalFrameDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameDemo window = new JInternalFrameDemo();
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
	public JInternalFrameDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JInternalFrameDemo.class.getResource("/imagenes/icono.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JDesktopPane escritorio = new JDesktopPane();
		frame.add(escritorio);
		JButton boton2 = new JButton("Cerrar todas las ventanas");
		frame.add(boton2,BorderLayout.NORTH);
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JInternalFrame[] ventanas = escritorio.getAllFrames();
				for (int i = 0; i < ventanas.length; i++) {
					ventanas[i].dispose();
				}
				
			}
		});
		
		
		JInternalFrame v1 = new JInternalFrame("Ventana Interna 1");
		v1.setResizable(true);
		v1.setClosable(true);
		v1.setIconifiable(true);
		v1.setVisible(true);
		v1.setBounds(0, 0, 150, 50);
		JButton boton = new JButton("Boton");
		v1.add(boton,BorderLayout.CENTER);
		escritorio.add(v1);
		
		JInternalFrame v2 = new JInternalFrame("Ventana Interna 2");
		v2.setResizable(true);
		v2.setClosable(true);
		v2.setIconifiable(true);
		v2.setVisible(true);
		v2.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
		v2.setBounds(150, 0, 150, 50);
		escritorio.add(v2);
		
		v2.addInternalFrameListener(new InternalFrameListener() {
			
			@Override
			public void internalFrameOpened(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameIconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeiconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeactivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				int returnVal = JOptionPane.showConfirmDialog(frame, "Realmente quieres cerrar la ventana");
				if (returnVal == JOptionPane.OK_OPTION){
					e.getInternalFrame().setVisible(false);
					e.getInternalFrame().dispose();
				}
			}
			
			@Override
			public void internalFrameClosed(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameActivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
}


