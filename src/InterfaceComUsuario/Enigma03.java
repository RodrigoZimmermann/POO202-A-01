package InterfaceComUsuario;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class Enigma03 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enigma03 window = new Enigma03();
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
	public Enigma03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rbtnVerdadeiro = new JRadioButton("Verdadeira");
		rbtnVerdadeiro.setBounds(10, 89, 109, 23);
		frame.getContentPane().add(rbtnVerdadeiro);
		
		JRadioButton rbtnFalso = new JRadioButton("Falsa");
		rbtnFalso.setBounds(121, 89, 109, 23);
		frame.getContentPane().add(rbtnFalso);
		
		ButtonGroup bgResposta = new ButtonGroup();
		bgResposta.add(rbtnVerdadeiro);
		bgResposta.add(rbtnFalso);
		
		JTextPane txtpnRascunho = new JTextPane();
		txtpnRascunho.setText("Rascunho:");
		txtpnRascunho.setBounds(10, 119, 414, 134);
		frame.getContentPane().add(txtpnRascunho);
		
		
		
		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(403, 7, 21, 23);
		frame.getContentPane().add(rbtnLed);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnFalso.isSelected()) {
					rbtnLed.setBackground(Color.green);
					rbtnLed.setSelected(true);
				} else {
					rbtnLed.setBackground(Color.red);
					rbtnLed.setSelected(true);
				}
			}
		});
		
		btnNewButton.setBounds(308, 89, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JEditorPane dtrpnAsCasasNa = new JEditorPane();
		dtrpnAsCasasNa.setEditable(false);
		dtrpnAsCasasNa.setBackground(Color.LIGHT_GRAY);
		dtrpnAsCasasNa.setText("As casas na rua A custam menos do que na rua B. As casas na rua C custam mais que na rua B. As casas na rua C s\u00E3o as mais caras. Se as duas primeiras senten\u00E7as s\u00E3o verdadeiras, a terceira \u00E9:");
		dtrpnAsCasasNa.setBounds(10, 7, 387, 75);
		frame.getContentPane().add(dtrpnAsCasasNa);
		
	}
}
