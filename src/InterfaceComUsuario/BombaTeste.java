package InterfaceComUsuario;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BLL.Bomba;
import BLL.Enigma;
import BLL.ModuloA01;

public class BombaTeste extends Bomba{

	private JFrame frame;
	private ModuloA01 modulo[] = new ModuloA01[1];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BombaTeste window = new BombaTeste();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public BombaTeste() {
		modulo[0] = new ModuloA01();
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getMaximumSize();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modulo[0].attach(this);
		frame.add(modulo[0].getModulePanel(6));
		path = Paths.get("").toAbsolutePath().resolve("resources");
	}

}
