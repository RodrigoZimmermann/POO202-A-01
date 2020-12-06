package InterfaceComUsuario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import BLL.Enigma;

public class Enigma04 extends Enigma {
	
	ArrayList<Boolean> resposta = new ArrayList();

	public Enigma04() {
		this.addQtdUso();
		initialize();
	}

	private void initialize() {
		panel = new JPanel();
		panel.setBounds(100, 100, 350, 309);
		panel.setLayout(null);

		JEditorPane dtrpnSeisAmigosLucas = new JEditorPane();
		dtrpnSeisAmigosLucas.setBounds(1, -41, 305, 216);
		dtrpnSeisAmigosLucas.setBackground(Color.LIGHT_GRAY);
		dtrpnSeisAmigosLucas.setEditable(false);
		dtrpnSeisAmigosLucas.setText(
				"Seis amigos, Lucas, Marcos, Chico, Ronaldo, Djalma e Roger, s\u00E3o apaixonados por esportes. Eles tem dificuldade para sair juntos nos fins de semana, pois todos praticam um esporte diferente: t\u00EAnis de mesa, futebol, nata\u00E7\u00E3o, basquete, t\u00EAnis e v\u00F4lei. Sabe-se que na semana passada:\r\n\r\na) Djalma foi ver o seu cunhado, que \u00E9 um dos amigos, joga t\u00EAnis;\r\nb) Ronaldo e Roger foram ver um dos amigos, que joga voleibol;\r\nc) Chico n\u00E3o gosta de basquetebol, pois acha um esporte violento;\r\nd) Lucas, Ronaldo e o seu amigo que pratica nata\u00E7\u00E3o foram ver a partida de basquetebol;\r\ne) A \u00FAnica irm\u00E3 de Marcos foi ver o seu marido, que \u00E9 um dos amigos, joga futebol.\r\n\r\nQual o esporte preferido de cada um destes seis amigos que s\u00E3o todos solteiros, exceto um? ");
		panel.add(dtrpnSeisAmigosLucas);

		JScrollPane scroll = new JScrollPane(dtrpnSeisAmigosLucas);
		scroll.setBounds(10, 10, 294, 190);
		panel.add(scroll);

		JComboBox cbNome = new JComboBox();
		cbNome.setBounds(10, 211, 139, 20);
		cbNome.setModel(new DefaultComboBoxModel(
				new String[] { "1-Chico","2-Marcos", "3-Lucas","4-Djama" , "5-Ronaldo", "6-Roger" }));
		panel.add(cbNome);

		JComboBox cbEsporte = new JComboBox();
		cbEsporte.setBounds(169, 211, 137, 20);
		cbEsporte.setModel(new DefaultComboBoxModel(new String[] { "1-T\u00EAnis", "2-Voleibol", "3-Basquete",
				"4-T\u00EAnis de mesa", "5-Nata\u00E7\u00E3o", "6-Futebol" }));
		panel.add(cbEsporte);

		JButton btnRegistrar = new JButton("Registrar Resposta");
		btnRegistrar.setBounds(10, 242, 197, 23);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbNome.getSelectedIndex() == 2 && cbEsporte.getSelectedIndex() == 1) {
					resposta.add(true);
				} else if (cbNome.getSelectedIndex() == 1 && cbEsporte.getSelectedIndex() == 0) {
					resposta.add(true);
				} else if (cbNome.getSelectedIndex() == 0 && cbEsporte.getSelectedIndex() == 4) {
					resposta.add(true);
				} else if (cbNome.getSelectedIndex() == 4 && cbEsporte.getSelectedIndex() == 3) {
					resposta.add(true);
				} else if (cbNome.getSelectedIndex() == 3 && cbEsporte.getSelectedIndex() == 5) {
					resposta.add(true);
				} else if (cbNome.getSelectedIndex() == 5 && cbEsporte.getSelectedIndex() == 2) {
					resposta.add(true);
				} else {
					resposta.add(false);
				}
			}
		});

		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setEnabled(false);
		rbtnLed.setBounds(311, 10, 21, 20);
		panel.add(rbtnLed);

		panel.add(btnRegistrar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean errado = false;

				if (resposta.size() < 6) {
					JOptionPane.showMessageDialog(null, "Falta registrar mais respostas");
				} else if (resposta.size() > 6) {
					JOptionPane.showMessageDialog(null, "Registrado mais resposta que o esperado");
					rbtnLed.setBackground(Color.red);
					rbtnLed.setSelected(true);
					addQtdErros();
					setDefused(false);
					btnSalvar.setEnabled(false);
				} else {
				for (int i = 0; i < resposta.size(); i++) {
					if (resposta.get(i) == false) {
						rbtnLed.setBackground(Color.red);
						rbtnLed.setSelected(true);
						addQtdErros();
						setDefused(false);
						errado = true;
						break;
					}
				}
				if (!errado) {
					rbtnLed.setBackground(Color.green);
					rbtnLed.setSelected(true);
					addQtdAcertos();
					setDefused(true);
				}
				btnSalvar.setEnabled(false);
			}
			}
		});
		btnSalvar.setBounds(217, 242, 89, 23);
		panel.add(btnSalvar);

	}
}
