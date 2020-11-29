package InterfaceComUsuario;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BLL.Modulo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class BombaTeste {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public BombaTeste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.isMaximumSizeSet();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Modulo modulo = new Modulo();
		modulo.addQtdAtivacoes();

		// enigma01 = 0 enigma02 = 1 enigma03 = 2 enigma04 = 3 enigma05 = 4 engima06 = 5

		JButton btnNewButton = new JButton("Testar Estatisticas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JOptionPane.showMessageDialog(null,"Execuções: " + modulo.getExecutions(1) +" "
				 + "Acertor: " + modulo.getRightAnswers(1) +" "+ "Erros: " + modulo.getWrongAnswers(1) +" "
				  + "Está defusado: "+ modulo.isDefused());
			}
		});
		frame.getContentPane().setLayout(null);
		btnNewButton.setBounds(54, 23, 165, 23);
		frame.getContentPane().add(btnNewButton);
		
		// Pegar o PANEL 
		frame.getContentPane().add(modulo.getModulePanel(1));
	}
}
