package InterfaceComUsuario;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;
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
		panel = new JPanel();
		panel.setBounds(100, 100, 450, 348);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Relacione as colunas considerando o seguinte esquema:");
		lblNewLabel.setBounds(10, 11, 359, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_4_1 = new JLabel("\u00ACC ^ \u00ACQ");
		lblNewLabel_4_1.setBounds(353, 76, 71, 14);
		panel.add(lblNewLabel_4_1);

		JLabel lblNewLabel_5_1 = new JLabel("C -> (Q v R)");
		lblNewLabel_5_1.setBounds(353, 92, 71, 14);
		panel.add(lblNewLabel_5_1);

		JLabel lblNewLabel_6_1 = new JLabel("C ^ \u00ACQ ");
		lblNewLabel_6_1.setBounds(353, 117, 71, 14);
		panel.add(lblNewLabel_6_1);

		JLabel lblNewLabel_7_1 = new JLabel("C");
		lblNewLabel_7_1.setBounds(353, 142, 71, 14);
		panel.add(lblNewLabel_7_1);

		JLabel lblNewLabel_8_1 = new JLabel("C -> Q");
		lblNewLabel_8_1.setBounds(353, 161, 71, 20);
		panel.add(lblNewLabel_8_1);

		JLabel lblNewLabel_9_1 = new JLabel("Q v \u00ACR");
		lblNewLabel_9_1.setBounds(353, 181, 71, 20);
		panel.add(lblNewLabel_9_1);

		JLabel lblNewLabel_10_1 = new JLabel("\u00ACC");
		lblNewLabel_10_1.setBounds(353, 212, 71, 16);
		panel.add(lblNewLabel_10_1);

		JLabel lblNewLabel_11_1 = new JLabel("C v \u00ACQ");
		lblNewLabel_11_1.setBounds(353, 228, 71, 19);
		panel.add(lblNewLabel_11_1);

		JLabel lblNewLabel_13_1 = new JLabel("\u00AC(C v Q)");
		lblNewLabel_13_1.setBounds(353, 262, 71, 14);
		panel.add(lblNewLabel_13_1);

		JTextPane txtpnOCarro = new JTextPane();
		txtpnOCarro.setEditable(false);
		txtpnOCarro.setText(
				"(1) O carro \u00E9 caro\r\n(2) O carro n\u00E3o \u00E9 caro\r\n(3) O carro \u00E9 caro e n\u00E3o \u00E9 quebrado\r\n(4) N\u00E3o \u00E9 verdade que o carro \u00E9 caro ou quebrado\r\n(5) O carro \u00E9 caro ou n\u00E3o \u00E9 quebrado\r\n(6) O carro n\u00E3o \u00E9 caro e n\u00E3o \u00E9 quebrado\r\n(7) O carro \u00E9 caro ou quebrado, mas \u00E9 r\u00E1pido\r\n(8) O carro \u00E9 quebrado ou n\u00E3o \u00E9 r\u00E1pido\r\n(9) Se o carro \u00E9 caro, ent\u00E3o \u00E9 quebrado\r\n(10) Se o carro \u00E9 caro, \u00E9 quebrado ou \u00E9 r\u00E1pido");
		txtpnOCarro.setBounds(21, 100, 259, 191);
		panel.add(txtpnOCarro);
		
		JScrollPane scroll = new JScrollPane(txtpnOCarro);
		scroll.setBounds(21, 100, 259, 191);
		panel.add(scroll);

		JEditorPane dtrpnCO = new JEditorPane();
		dtrpnCO.setBackground(Color.LIGHT_GRAY);
		dtrpnCO.setEditable(false);
		dtrpnCO.setText("C = O carro \u00E9 caro\r\nQ = O carro esta quebrado\r\nR = O carro \u00E9 r\u00E1pido");
		dtrpnCO.setBounds(20, 37, 259, 53);
		panel.add(dtrpnCO);
		
		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(403, 7, 21, 23);
		rbtnLed.setEnabled(false);
		panel.add(rbtnLed);

		JLabel lblNewLabel_13_1_1 = new JLabel("(C v Q) ^ R");
		lblNewLabel_13_1_1.setBounds(353, 280, 71, 14);
		panel.add(lblNewLabel_13_1_1);

		JComboBox cbSeis = new JComboBox();
		cbSeis.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbSeis.setBounds(289, 70, 54, 20);
		panel.add(cbSeis);

		JComboBox cbDez = new JComboBox();
		cbDez.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbDez.setBounds(289, 89, 54, 20);
		panel.add(cbDez);

		JComboBox cbTres = new JComboBox();
		cbTres.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbTres.setBounds(290, 114, 53, 20);
		panel.add(cbTres);

		JComboBox cbUm = new JComboBox();
		cbUm.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbUm.setBounds(290, 134, 53, 20);
		panel.add(cbUm);

		JComboBox cbNove = new JComboBox();
		cbNove.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbNove.setBounds(289, 161, 54, 20);
		panel.add(cbNove);

		JComboBox cbOito = new JComboBox();
		cbOito.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbOito.setBounds(289, 181, 54, 20);
		panel.add(cbOito);

		JComboBox cbDois = new JComboBox();
		cbDois.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbDois.setBounds(290, 210, 53, 20);
		panel.add(cbDois);

		JComboBox cbCinco = new JComboBox();
		cbCinco.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbCinco.setBounds(290, 227, 53, 20);
		panel.add(cbCinco);

		JComboBox cbQuatro = new JComboBox();
		cbQuatro.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbQuatro.setBounds(290, 259, 53, 20);
		panel.add(cbQuatro);

		JComboBox cbSete = new JComboBox();
		cbSete.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cbSete.setBounds(290, 277, 53, 20);
		panel.add(cbSete);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(cbSeis.getSelectedIndex() );
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

		btnNewButton.setBounds(312, 36, 89, 23);
		panel.add(btnNewButton);
	}



}
