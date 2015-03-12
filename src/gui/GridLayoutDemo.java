package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GridLayoutDemo {

	private JFrame frame;
	private JTextField Textonombre;
	private JTextField Textoapellido;
	private JLabel direccion;
	private JTextField Textodirrecion;
	private JLabel localidad;
	private JComboBox listalocalidad;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutDemo window = new GridLayoutDemo();
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
	public GridLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.setVgap(15);
		gridLayout.setHgap(20);
		gridLayout.setColumns(2);
		gridLayout.setRows(0);
		frame.getContentPane().setLayout(gridLayout);
		
		JLabel nombre = new JLabel("Nombre");
		frame.getContentPane().add(nombre);
		
		Textonombre = new JTextField();
		frame.getContentPane().add(Textonombre);
		Textonombre.setColumns(10);
		
		JLabel Apellido = new JLabel("Apelldio");
		frame.getContentPane().add(Apellido);
		
		Textoapellido = new JTextField();
		Textoapellido.setText("");
		frame.getContentPane().add(Textoapellido);
		Textoapellido.setColumns(10);
		
		localidad = new JLabel("Localidad");
		frame.getContentPane().add(localidad);
		
		Textodirrecion = new JTextField();
		frame.getContentPane().add(Textodirrecion);
		Textodirrecion.setColumns(10);
		
		direccion = new JLabel("Direccion");
		frame.getContentPane().add(direccion);
		
		listalocalidad = new JComboBox();
		listalocalidad.setModel(new DefaultComboBoxModel(new String[] {"Jaen", "Madrid", "Sevilla", "Cordoba"}));
		frame.getContentPane().add(listalocalidad);
		
		btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		}

}
