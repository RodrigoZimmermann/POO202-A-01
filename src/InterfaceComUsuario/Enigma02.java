package InterfaceComUsuario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import BLL.Enigma;

public class Enigma02 extends Enigma {

	/**
	 * Create the panel.
	 */
	public Enigma02() {
		initialize();
		this.addQtdUso();
	}
	
	private void initialize() {
		panel = new JPanel();
		panel.setBounds(100, 100, 450, 300);
		panel.setLayout(null);
		
		JRadioButton rbtnVerdadeiro = new JRadioButton("Verdadeiro");
		rbtnVerdadeiro.setBounds(10, 98, 114, 23);
		panel.add(rbtnVerdadeiro);
		
		JRadioButton rbtnFalso = new JRadioButton("Falso");
		rbtnFalso.setForeground(Color.BLACK);
		rbtnFalso.setBounds(141, 98, 76, 23);
		panel.add(rbtnFalso);
		
		ButtonGroup bgResposta = new ButtonGroup();
		bgResposta.add(rbtnVerdadeiro);
		bgResposta.add(rbtnFalso);
		
		JEditorPane dtrpnCasoASentena = new JEditorPane();
		dtrpnCasoASentena.setBackground(Color.LIGHT_GRAY);
		dtrpnCasoASentena.setEditable(false);
		dtrpnCasoASentena.setText("Caso a senten\u00E7a \"Cobras s\u00E3o perigosas\" tenha a interpreta\u00E7\u00E3o Falsa,  ent\u00E3o a interpreta\u00E7\u00E3o da senten\u00E7a \"Cobras s\u00E3o perigosas, logo, elas t\u00EAm veneno\" ser\u00E1 Falsa.");
		dtrpnCasoASentena.setBounds(10, 32, 414, 59);
		panel.add(dtrpnCasoASentena);
		
		JEditorPane dtrpnRascunho = new JEditorPane();
		dtrpnRascunho.setText("Rascunho:");
		dtrpnRascunho.setBounds(10, 128, 414, 122);
		panel.add(dtrpnRascunho);
		
		JScrollPane scroll = new JScrollPane(dtrpnRascunho);
		scroll.setBounds(10, 128, 414, 122);
		panel.add(scroll);
		
		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(403, 2, 21, 23);
		rbtnLed.setEnabled(false);
		panel.add(rbtnLed);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rbtnFalso.isSelected()) {
					rbtnLed.setBackground(Color.green);
					rbtnLed.setSelected(true);
					addQtdAcertos();
					setDefused(true);
				} else {
					rbtnLed.setBackground(Color.red);
					rbtnLed.setSelected(true);
					addQtdErros();
					setDefused(false);
				}
				btnNewButton.setEnabled(false);
			}
		});
		btnNewButton.setBounds(298, 98, 89, 23);
		panel.add(btnNewButton);
	}

}
