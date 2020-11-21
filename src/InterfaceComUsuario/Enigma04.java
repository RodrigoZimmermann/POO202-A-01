package InterfaceComUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Enigma04 {
	
	ArrayList<Object> resposta = new ArrayList();

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enigma04 window = new Enigma04();
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
	public Enigma04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane dtrpnSeisAmigosLucas = new JEditorPane();
		dtrpnSeisAmigosLucas.setBackground(Color.LIGHT_GRAY);
		dtrpnSeisAmigosLucas.setEditable(false);
		dtrpnSeisAmigosLucas.setText("Seis amigos, Lucas, Marcos, Chico, Ronaldo, Djalma e Roger, s\u00E3o apaixonados por esportes. Eles tem dificuldade para sair juntos nos fins de semana, pois todos praticam um esporte diferente: t\u00EAnis de mesa, futebol, nata\u00E7\u00E3o, basquete, t\u00EAnis e v\u00F4lei. Sabe-se que na semana passada:\r\n\r\na) Djalma foi ver o seu cunhado, que \u00E9 um dos amigos, joga t\u00EAnis;\r\nb) Ronaldo e Roger foram ver um dos amigos, que joga voleibol;\r\nc) Chico n\u00E3o gosta de basquetebol, pois acha um esporte violento;\r\nd) Lucas, Ronaldo e o seu amigo que pratica nata\u00E7\u00E3o foram ver a partida de basquetebol;\r\ne) A \u00FAnica irm\u00E3 de Marcos foi ver o seu marido, que \u00E9 um dos amigos, joga futebol.\r\n\r\nQual o esporte preferido de cada um destes seis amigos que s\u00E3o todos solteiros, exceto um? ");
		dtrpnSeisAmigosLucas.setBounds(10, 11, 414, 247);
		frame.getContentPane().add(dtrpnSeisAmigosLucas);
		
		JComboBox cbNome = new JComboBox();
		cbNome.setModel(new DefaultComboBoxModel(new String[] {"1-Lucas", "2-Marcos", "3-Chico", "4-Ronaldo", "5-Djama", "6-Roger"}));
		cbNome.setBounds(10, 262, 139, 20);
		frame.getContentPane().add(cbNome);
		
		JComboBox cbEsporte = new JComboBox();
		cbEsporte.setModel(new DefaultComboBoxModel(new String[] {"1-T\u00EAnis", "2-Voleibol", "3-Basquete", "4-T\u00EAnis de mesa", "5-Nata\u00E7\u00E3o", "6-Futebol"}));
		cbEsporte.setBounds(194, 262, 131, 20);
		frame.getContentPane().add(cbEsporte);
		
		JButton btnRegistrar = new JButton("Registrar Resposta");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resposta.add(cbNome.getSelectedIndex());
				resposta.add(cbNome.getSelectedIndex());
			}
		});
		btnRegistrar.setBounds(79, 293, 197, 23);
		frame.getContentPane().add(btnRegistrar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(335, 293, 89, 23);
		frame.getContentPane().add(btnSalvar);
	}
}
