package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiVentanaBorderLayoutBoxLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentanaBorderLayoutBoxLayout window = new MiVentanaBorderLayoutBoxLayout();
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
	public MiVentanaBorderLayoutBoxLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel miPanel = new JPanel();
		miPanel.setLayout(new BoxLayout(miPanel,BoxLayout.X_AXIS));
		
		frame.add(miPanel,BorderLayout.SOUTH);
		
		JLabel etiqueta1 = new JLabel("Etiqueta Izquierda");
		JLabel etiqueta2 = new JLabel("Etiqueta Izquierda");
		miPanel.add(etiqueta1);		
		miPanel.add(Box.createHorizontalGlue());
		miPanel.add(etiqueta2);	
		
	}

}
