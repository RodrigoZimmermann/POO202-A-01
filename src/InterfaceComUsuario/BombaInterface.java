package InterfaceComUsuario;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BLL.Bomba;
import BLL.Enigma;
import BLL.Modulo;

public class BombaInterface extends Bomba{

	private JFrame frame;
	private ModuloA01 modulo[] = new ModuloA01[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BombaInterface window = new BombaInterface();
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
	public BombaInterface() {
		modulo[0] = new ModuloA01();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getMaximumSize();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modulo[0].attach(this);
		frame.add(modulo[0].getPanel());
		
	}

}
