package InterfaceComUsuario;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import BLL.Enigma;

public class Enigma01 extends Enigma {

	/**
	 * Create the panel.
	 */
	public Enigma01() {
		this.addQtdUso();
		initialize();
	}

	private void initialize() {
		JPanel panel = new JPanel();
		this.panel = panel;
		panel.setSize(350, 250);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Relacione as colunas considerando o seguinte esquema:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel.setBounds(5, 5, 318, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_4_1 = new JLabel("\u00ACC ^ \u00ACQ");
		lblNewLabel_4_1.setBounds(267, 25, 71, 14);
		panel.add(lblNewLabel_4_1);

		JLabel lblNewLabel_5_1 = new JLabel("C -> (Q v R)");
		lblNewLabel_5_1.setBounds(271, 48, 71, 14);
		panel.add(lblNewLabel_5_1);

		JLabel lblNewLabel_6_1 = new JLabel("C ^ \u00ACQ ");
		lblNewLabel_6_1.setBounds(269, 72, 71, 14);
		panel.add(lblNewLabel_6_1);

		JLabel lblNewLabel_7_1 = new JLabel("C");
		lblNewLabel_7_1.setBounds(271, 93, 71, 14);
		panel.add(lblNewLabel_7_1);

		JLabel lblNewLabel_8_1 = new JLabel("C -> Q");
		lblNewLabel_8_1.setBounds(271, 117, 71, 20);
		panel.add(lblNewLabel_8_1);

		JLabel lblNewLabel_9_1 = new JLabel("Q v \u00ACR");
		lblNewLabel_9_1.setBounds(269, 138, 71, 20);
		panel.add(lblNewLabel_9_1);

		JLabel lblNewLabel_10_1 = new JLabel("\u00ACC");
		lblNewLabel_10_1.setBounds(269, 167, 71, 16);
		panel.add(lblNewLabel_10_1);

		JLabel lblNewLabel_11_1 = new JLabel("C v \u00ACQ");
		lblNewLabel_11_1.setBounds(269, 185, 71, 19);
		panel.add(lblNewLabel_11_1);

		JLabel lblNewLabel_13_1 = new JLabel("\u00AC(C v Q)");
		lblNewLabel_13_1.setBounds(269, 209, 71, 14);
		panel.add(lblNewLabel_13_1);

		JTextPane txtpnOCarro = new JTextPane();
		txtpnOCarro.setEditable(false);
		txtpnOCarro.setText(
				"(1) O carro \u00E9 caro\r\n(2) O carro n\u00E3o \u00E9 caro\r\n(3) O carro \u00E9 caro e n\u00E3o \u00E9 quebrado\r\n(4) N\u00E3o \u00E9 verdade que o carro \u00E9 caro ou quebrado\r\n(5) O carro \u00E9 caro ou n\u00E3o \u00E9 quebrado\r\n(6) O carro n\u00E3o \u00E9 caro e n\u00E3o \u00E9 quebrado\r\n(7) O carro \u00E9 caro ou quebrado, mas \u00E9 r\u00E1pido\r\n(8) O carro \u00E9 quebrado ou n\u00E3o \u00E9 r\u00E1pido\r\n(9) Se o carro \u00E9 caro, ent\u00E3o \u00E9 quebrado\r\n(10) Se o carro \u00E9 caro, \u00E9 quebrado ou \u00E9 r\u00E1pido");
		txtpnOCarro.setBounds(20, 94, 151, 103);
		panel.add(txtpnOCarro);

		JScrollPane scroll = new JScrollPane(txtpnOCarro);
		scroll.setBounds(20, 110, 151, 103);
		panel.add(scroll);

		JEditorPane dtrpnCO = new JEditorPane();
		dtrpnCO.setBackground(Color.LIGHT_GRAY);
		dtrpnCO.setEditable(false);
		dtrpnCO.setText("C = O carro \u00E9 caro\r\nQ = O carro esta quebrado\r\nR = O carro \u00E9 r\u00E1pido");
		dtrpnCO.setBounds(20, 30, 169, 54);
		panel.add(dtrpnCO);

		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(326, 3, 21, 23);
		rbtnLed.setEnabled(false);
		panel.add(rbtnLed);

		JLabel lblNewLabel_13_1_1 = new JLabel("(C v Q) ^ R");
		lblNewLabel_13_1_1.setBounds(267, 230, 71, 14);
		panel.add(lblNewLabel_13_1_1);

		JComboBox cbSeis = new JComboBox();
		cbSeis.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbSeis.setBounds(209, 26, 54, 20);
		panel.add(cbSeis);

		JComboBox cbDez = new JComboBox();
		cbDez.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbDez.setBounds(209, 45, 54, 20);
		panel.add(cbDez);

		JComboBox cbTres = new JComboBox();
		cbTres.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbTres.setBounds(210, 70, 53, 20);
		panel.add(cbTres);

		JComboBox cbUm = new JComboBox();
		cbUm.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbUm.setBounds(210, 90, 53, 20);
		panel.add(cbUm);

		JComboBox cbNove = new JComboBox();
		cbNove.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbNove.setBounds(209, 117, 54, 20);
		panel.add(cbNove);

		JComboBox cbOito = new JComboBox();
		cbOito.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbOito.setBounds(209, 137, 54, 20);
		panel.add(cbOito);

		JComboBox cbDois = new JComboBox();
		cbDois.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbDois.setBounds(210, 166, 53, 20);
		panel.add(cbDois);

		JComboBox cbCinco = new JComboBox();
		cbCinco.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbCinco.setBounds(210, 183, 53, 20);
		panel.add(cbCinco);

		JComboBox cbQuatro = new JComboBox();
		cbQuatro.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbQuatro.setBounds(210, 206, 53, 20);
		panel.add(cbQuatro);

		JComboBox cbSete = new JComboBox();
		cbSete.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbSete.setBounds(210, 227, 53, 20);
		panel.add(cbSete);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				System.out.println(cbSeis.getSelectedIndex());
				if (!(cbSeis.getSelectedIndex() == 5)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbDez.getSelectedIndex() == 9)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbTres.getSelectedIndex() == 2)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbUm.getSelectedIndex() == 0)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbNove.getSelectedIndex() == 8)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbOito.getSelectedIndex() == 7)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbDois.getSelectedIndex() == 1)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbCinco.getSelectedIndex() == 4)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbQuatro.getSelectedIndex() == 3)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else if (!(cbSete.getSelectedIndex() == 6)) {
					setLed();
					addQtdErros();
					setDefused(false);
				} else {
					rbtnLed.setBackground(Color.green);
					rbtnLed.setSelected(true);
					addQtdAcertos();
					setDefused(true);
				}
				btnNewButton.setEnabled(false);
			}

			private void setLed() {
				rbtnLed.setBackground(Color.red);
				rbtnLed.setSelected(true);
			}

		});

		btnNewButton.setBounds(20, 219, 89, 23);
		panel.add(btnNewButton);
	}

}
