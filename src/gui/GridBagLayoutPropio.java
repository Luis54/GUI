package gui;


import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout; 

public class GridBagLayoutPropio {
	JFrame frame;
	JFrame inicio;

	public GridBagLayoutPropio(Persona p) {
		frame = new JFrame();
		inicio = new JFrame();
		inicio.setTitle("Programa introducir datos Persona");
		inicio.setVisible(true);
		
		BoxLayout boxlayout = new BoxLayout(inicio.getContentPane(), BoxLayout.Y_AXIS);
		inicio.setLayout(boxlayout);
		JLabel textoinicio = new JLabel("Progrma para introducir datos de persona presiona continuar para iniciar el programa");
		inicio.add(textoinicio);
		
		JButton continuar = new JButton ("Continuar");
		continuar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(true);
				inicio.setVisible(false);
			}
		});
		inicio.add(continuar);
		
		frame.setTitle("Grid Layout");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(false);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		JPanel panalCentral = new JPanel();
		frame.add(panalCentral);
		panalCentral.setLayout(gridBagLayout);
		
		
		JLabel nombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		panalCentral.add(nombre, gbc_lblNombre);
	
		
		JTextField textonombre = new JTextField(p.getNombre());
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.anchor = GridBagConstraints.WEST;
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNombre.gridx = 1;
		gbc_textFieldNombre.gridy = 0;
		panalCentral.add(textonombre, gbc_textFieldNombre);
		textonombre.setColumns(10);
		
		JLabel apellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.EAST;
		gbc_lblApellido.insets = new Insets(0, 0, 0, 5);
		gbc_lblApellido.gridx = 0;
		gbc_lblApellido.gridy = 1;
		panalCentral.add(apellido, gbc_lblApellido);
		
		JTextField textoapellido = new JTextField();
		GridBagConstraints gbc_textFieldApellido = new GridBagConstraints();
		gbc_textFieldApellido.anchor = GridBagConstraints.WEST;
		gbc_textFieldApellido.gridx = 1;
		gbc_textFieldApellido.gridy = 1;
		panalCentral.add(textoapellido, gbc_textFieldApellido);
		textoapellido.setColumns(15);
		
		JLabel direccion = new JLabel("Direccion");
		GridBagConstraints gbc_lbldireccion = new GridBagConstraints();
		gbc_lbldireccion.anchor = GridBagConstraints.EAST;
		gbc_lbldireccion.insets = new Insets(0, 0, 0, 5);
		gbc_lbldireccion.gridx = 0;
		gbc_lbldireccion.gridy = 2;
		panalCentral.add(direccion, gbc_lbldireccion);
		
		JTextField textodireccion= new JTextField();
		GridBagConstraints gbc_textFielddireccion = new GridBagConstraints();
		gbc_textFielddireccion.anchor = GridBagConstraints.WEST;
		gbc_textFielddireccion.gridx = 1;
		gbc_textFielddireccion.gridy = 2;
		panalCentral.add(textoapellido, gbc_textFielddireccion);
		textodireccion.setColumns(25);
		
		JLabel telefono = new JLabel("Telefono");
		GridBagConstraints gbc_lbltelefono = new GridBagConstraints();
		gbc_lbltelefono.anchor = GridBagConstraints.EAST;
		gbc_lbltelefono.insets = new Insets(0, 0, 0, 5);
		gbc_lbltelefono.gridx = 0;
		gbc_lbltelefono.gridy = 3;
		panalCentral.add(telefono, gbc_lbltelefono);
		
		JTextField textotelefono= new JTextField();
		GridBagConstraints gbc_textFieldtelefono = new GridBagConstraints();
		gbc_textFieldtelefono.anchor = GridBagConstraints.WEST;
		gbc_textFieldtelefono.gridx = 1;
		gbc_textFieldtelefono.gridy = 3;
		panalCentral.add(textotelefono, gbc_textFieldtelefono);
		textotelefono.setColumns(25);
		
		
		
		
		
		JLabel localidad = new JLabel("Localidad");
		GridBagConstraints gbc_lblLocalidad = new GridBagConstraints();
		gbc_lblLocalidad.anchor = GridBagConstraints.EAST;
		gbc_lblLocalidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblLocalidad.gridx = 0;
		gbc_lblLocalidad.gridy = 4;
		panalCentral.add(localidad, gbc_lblLocalidad);
		
		
		JComboBox<String> ciudad = new JComboBox<String>();
		GridBagConstraints gbc_ciudad = new GridBagConstraints();
		gbc_ciudad.anchor = GridBagConstraints.WEST;
		gbc_ciudad.gridx = 1;
		gbc_ciudad.gridy = 4;
		ciudad.addItem("Jaen");
		ciudad.addItem("Madrid");
		ciudad.addItem("Cordoba");
		ciudad.addItem("Sevilla");
		panalCentral.add(ciudad,gbc_ciudad);
		
		JButton guardar = new JButton("Siguiente");
		GridBagConstraints guardar1 = new GridBagConstraints();
		guardar1.gridx = 0;
		guardar1.gridy = 5;
		panalCentral.add(guardar,guardar1);
		
		
		JButton cancelar = new JButton("Anterior");
		GridBagConstraints cancelar1 = new GridBagConstraints();
		cancelar1.gridx = 1;
		cancelar1.gridy = 5;
		panalCentral.add(cancelar,cancelar1);
		
		frame.pack();
		inicio.pack();
	}
	
	
	
	public static void main(String[] args) {
		Persona p = new Persona("Luis","Usero Reyes","Jaen","Calle de la luna","953450734");
		GridBagLayoutPropio ventana = new GridBagLayoutPropio(p);
		
		
		
	}

}