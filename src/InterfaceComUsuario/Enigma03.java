package InterfaceComUsuario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import BLL.Enigma;

public class Enigma03 extends Enigma {

	/**
	 * Create the panel.
	 */
	public Enigma03() {
		this.addQtdUso();
		initialize();
	}

	private void initialize() {
		JPanel panel = new JPanel();
		this.panel = panel;
		panel.setSize(350, 250);
		panel.setLayout(null);

		JRadioButton rbtnVerdadeiro = new JRadioButton("Verdadeira");
		rbtnVerdadeiro.setBounds(10, 89, 109, 23);
		panel.add(rbtnVerdadeiro);

		JRadioButton rbtnFalso = new JRadioButton("Falsa");
		rbtnFalso.setBounds(121, 89, 109, 23);
		panel.add(rbtnFalso);

		ButtonGroup bgResposta = new ButtonGroup();
		bgResposta.add(rbtnVerdadeiro);
		bgResposta.add(rbtnFalso);

		JTextPane txtpnRascunho = new JTextPane();
		txtpnRascunho.setText("Rascunho:");
		txtpnRascunho.setBounds(13, 117, 306, 122);
		panel.add(txtpnRascunho);

		JScrollPane scroll = new JScrollPane(txtpnRascunho);
		scroll.setBounds(13, 117, 306, 122);
		panel.add(scroll);

		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(310, 6, 21, 23);
		rbtnLed.setEnabled(false);
		panel.add(rbtnLed);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbtnVerdadeiro.isSelected()) {
					rbtnLed.setBackground(Color.green);
					rbtnLed.setSelected(true);
					addQtdAcertos();
					setDefused(true);
				} else {
					rbtnLed.setBackground(Color.red);
					rbtnLed.setSelected(true);
					addQtdErros();
					setDefused(false);
					bomba.addError();
				}
				btnNewButton.setEnabled(false);
				try {
					modulo.gravarModuloA01(modulo, bomba.getFilesPath());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnNewButton.setBounds(229, 88, 89, 23);
		panel.add(btnNewButton);

		JEditorPane dtrpnAsCasasNa = new JEditorPane();
		dtrpnAsCasasNa.setEditable(false);
		dtrpnAsCasasNa.setBackground(Color.LIGHT_GRAY);
		dtrpnAsCasasNa.setText(
				"As casas na rua A custam menos do que na rua B. As casas na rua C custam mais que na rua B. As casas na rua C s\u00E3o as mais caras. Se as duas primeiras senten\u00E7as s\u00E3o verdadeiras, a terceira \u00E9:");
		dtrpnAsCasasNa.setBounds(10, 7, 296, 75);
		panel.add(dtrpnAsCasasNa);
	}

}
