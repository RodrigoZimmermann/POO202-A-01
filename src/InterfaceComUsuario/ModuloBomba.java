package InterfaceComUsuario;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BLL.Modulo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class ModuloBomba extends Modulo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloBomba window = new ModuloBomba();
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
	public ModuloBomba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.isMaximumSizeSet();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		addQtdAtivacoes();

		// enigma01 = 0 enigma02 = 1 enigma03 = 2 enigma04 = 3 enigma05 = 4 engima06 = 5

		JButton btnNewButton = new JButton("Testar Estatisticas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JOptionPane.showMessageDialog(null,"Execuções: " + getExecutions(3) +" "
				 + "Acertos: " + getRightAnswers(3) +" "+ "Erros: " + getWrongAnswers(3) +" "
				  + "Está defusado: "+ isDefused());
			}
		});
		frame.getContentPane().setLayout(null);
		btnNewButton.setBounds(54, 23, 165, 23);
		frame.getContentPane().add(btnNewButton);
		
		// Pegar o PANEL 
		frame.getContentPane().add(getModulePanel(3));
	}
}
