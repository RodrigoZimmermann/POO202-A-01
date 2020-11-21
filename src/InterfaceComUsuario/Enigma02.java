package InterfaceComUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Enigma02 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enigma02 window = new Enigma02();
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
	public Enigma02() {
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
		
		JRadioButton rbtnVerdadeiro = new JRadioButton("Verdadeiro");
		rbtnVerdadeiro.setBounds(10, 98, 114, 23);
		frame.getContentPane().add(rbtnVerdadeiro);
		
		JRadioButton rbtnFalso = new JRadioButton("Falso");
		rbtnFalso.setForeground(Color.BLACK);
		rbtnFalso.setBounds(141, 98, 76, 23);
		frame.getContentPane().add(rbtnFalso);
		
		ButtonGroup bgResposta = new ButtonGroup();
		bgResposta.add(rbtnVerdadeiro);
		bgResposta.add(rbtnFalso);
		
		JEditorPane dtrpnCasoASentena = new JEditorPane();
		dtrpnCasoASentena.setBackground(Color.LIGHT_GRAY);
		dtrpnCasoASentena.setEditable(false);
		dtrpnCasoASentena.setText("Caso a senten\u00E7a \"Cobras s\u00E3o perigosas\" tenha a interpreta\u00E7\u00E3o Falsa,  ent\u00E3o a interpreta\u00E7\u00E3o da senten\u00E7a \"Cobras s\u00E3o perigosas, logo, elas t\u00EAm veneno\" ser\u00E1 Falsa.");
		dtrpnCasoASentena.setBounds(10, 32, 414, 59);
		frame.getContentPane().add(dtrpnCasoASentena);
		
		JEditorPane dtrpnRascunho = new JEditorPane();
		dtrpnRascunho.setText("Rascunho:");
		dtrpnRascunho.setBounds(10, 128, 414, 122);
		frame.getContentPane().add(dtrpnRascunho);
		
		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(403, 2, 21, 23);
		frame.getContentPane().add(rbtnLed);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rbtnFalso.isSelected()) {
					rbtnLed.setBackground(Color.green);
					rbtnLed.setSelected(true);
				} else {
					rbtnLed.setBackground(Color.red);
					rbtnLed.setSelected(true);
				}
			}
		});
		btnNewButton.setBounds(298, 98, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
