package gui;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutPropio {
	JFrame frame;
	JFrame inicio;

	public GridLayoutPropio(Persona p) {
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
		GridLayout gridLayout = new GridLayout();
		gridLayout.setVgap(15);
		gridLayout.setHgap(20);
		gridLayout.setColumns(2);
		gridLayout.setRows(0);
		frame.setLayout(gridLayout);
		
		JLabel nombre = new JLabel("Nombre");
		frame.add(nombre);
		
		JTextField textonombre = new JTextField(p.getNombre());
		frame.add(textonombre);
		
		JLabel apellido = new JLabel("Apellido");
		frame.add(apellido);
		
		JTextField textoapellido = new JTextField(p.getApellido());
		frame.add(textoapellido);
		
		JLabel localidad = new JLabel("Localidad");
		frame.add(localidad);
		
		JComboBox<String> ciudad = new JComboBox<String>();
		ciudad.addItem("Jaen");
		ciudad.addItem("Madrid");
		ciudad.addItem("Cordoba");
		ciudad.addItem("Sevilla");
		ciudad.setSelectedItem(p.getLocalidad());
		frame.add(ciudad);
		
		JButton guardar = new JButton("Guardar");
		frame.add(guardar);
		
		JButton cancelar = new JButton("Cancelar");
		frame.add(cancelar);
		
		frame.pack();
		inicio.pack();
	}
	
	
	
	/*public static void main(String[] args) {
		Persona p = new Persona("Luis", "Usero","Madrid" );
		GridLayoutPropio ventana = new GridLayoutPropio(p);
		
		
	}*/
}
