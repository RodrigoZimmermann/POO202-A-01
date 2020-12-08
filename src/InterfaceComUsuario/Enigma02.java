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

import BLL.Enigma;

public class Enigma02 extends Enigma {

	/**
	 * Create the panel.
	 */
	public Enigma02() {
		this.addQtdUso();
		initialize();
	}

	private void initialize() {
		JPanel panel = new JPanel();
		this.panel = panel;
		panel.setSize(350, 250);
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
		dtrpnCasoASentena.setText(
				"Caso a senten\u00E7a \"Cobras s\u00E3o perigosas\" tenha a interpreta\u00E7\u00E3o Falsa,  ent\u00E3o a interpreta\u00E7\u00E3o da senten\u00E7a \"Cobras s\u00E3o perigosas, logo, elas t\u00EAm veneno\" ser\u00E1 Falsa.");
		dtrpnCasoASentena.setBounds(14, 37, 308, 59);
		panel.add(dtrpnCasoASentena);

		JEditorPane dtrpnRascunho = new JEditorPane();
		dtrpnRascunho.setText("Rascunho:");
		dtrpnRascunho.setBounds(9, 130, 313, 110);
		panel.add(dtrpnRascunho);

		JScrollPane scroll = new JScrollPane(dtrpnRascunho);
		scroll.setBounds(9, 130, 313, 110);
		panel.add(scroll);

		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(296, 7, 21, 23);
		rbtnLed.setEnabled(false);
		panel.add(rbtnLed);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rbtnFalso.isSelected()) {
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
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(233, 99, 89, 23);
		panel.add(btnNewButton);
	}

}
