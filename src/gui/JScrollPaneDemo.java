package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JScrollPaneDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JScrollPaneDemo window = new JScrollPaneDemo();
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
	public JScrollPaneDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ScroolPane Izquierda
		JScrollPane scrollPaneIzquierda = new JScrollPane();
		scrollPaneIzquierda.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneIzquierda.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
		JTextArea textareaIzArea = new JTextArea();
		scrollPaneIzquierda.setViewportView(textareaIzArea);
		//ScroolPane Derecha
		JScrollPane scrollPaneDerecha = new JScrollPane();
		scrollPaneDerecha.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneDerecha.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//Texto derecha
		JTextArea textareaDerecha = new JTextArea();
		scrollPaneDerecha.setViewportView(textareaDerecha);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPaneIzquierda,scrollPaneDerecha);
		//Divisor en la mitad
		splitPane.setResizeWeight(0.5);
		splitPane.setDividerLocation(1.0);
		
		
		//scrool abajo
		JScrollPane scrollPaneAbajo = new JScrollPane();
		scrollPaneIzquierda.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneIzquierda.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		//texto abajo
		JTextArea textoDerecho = new JTextArea();
		scrollPaneAbajo.setViewportView(textoDerecho);
		
		JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,splitPane,scrollPaneAbajo);
		
		splitPane2.setResizeWeight(0.5);
		splitPane2.setDividerLocation(1.0);
		
		
		frame.getContentPane().add(splitPane2,BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmAbrirTextoIzquierda = new JMenuItem("Abrir texto izquierda");
		mntmAbrirTextoIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int numero = fileChooser.showOpenDialog(frame);
				if(numero == JFileChooser.APPROVE_OPTION){
					File f =fileChooser.getSelectedFile();
					Scanner str;
					String leido="";
					try {
						str = new Scanner(f);
						while(str.hasNext())
						leido+= str.nextLine();
						str.close();
					}
						catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					textareaIzArea.setText(leido);
				}
			}
		});
		mnArchivo.add(mntmAbrirTextoIzquierda);
		
		JMenuItem mntmAbrirTextoDerecha = new JMenuItem("Abrir texto derecha");
		mntmAbrirTextoDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int numero = fileChooser.showOpenDialog(frame);
				if(numero == JFileChooser.APPROVE_OPTION){
					File f =fileChooser.getSelectedFile();
					Scanner str;
					String leido="";
					try {
						str = new Scanner(f);
						while(str.hasNext())
						leido+= str.nextLine();
						str.close();
					}
						catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					textareaDerecha.setText(leido);
				}
				
			}
		});
		mnArchivo.add(mntmAbrirTextoDerecha);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		JMenu mnComparar = new JMenu("Comparar");
		menuBar.add(mnComparar);
		
		JMenuItem mntmEjecutarCompacion = new JMenuItem("Ejecutar comparacion");
		mntmEjecutarCompacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoizquierda = textareaIzArea.getText();
				String textoDerecha = textareaDerecha.getText();
				String [] arrayTextoI = textoizquierda.split("\n");
				String [] arrayTextoD = textoDerecha.split("\n");
				
				int contador = 0;
				if(arrayTextoI.length < arrayTextoD.length)
					contador = arrayTextoI.length;
				else
					contador = arrayTextoD.length;
				for (int i = 0; i < contador; i++) {
				//	if(arrayTextoI[i].equals(arrayTextoD))
					
				}
				
			}
		});
		mnComparar.add(mntmEjecutarCompacion);
	}
}
