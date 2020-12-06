package InterfaceComUsuario;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import BLL.Enigma;

public class Enigma06 extends Enigma {

	private JTextField txtEpc; 
	
	public Enigma06() {
		this.addQtdUso();
		initialize();
	}

	private void initialize() {
		panel = new JPanel();
		panel.setBounds(100, 100, 346, 319);
		panel.setLayout(null);
		
		JTextPane txtpnIpxV = new JTextPane();
		txtpnIpxV.setBackground(Color.LIGHT_GRAY);
		txtpnIpxV.setEditable(false);
		txtpnIpxV.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		txtpnIpxV.setText("Determine se a interpreta\u00E7\u00E3o da f\u00F3rmula a seguir \u00E9 verdadeira ou falsa, sendo que:\r\nI[c1] = 5\r\nI[c2] = 2\r\nI[c3] = 1\r\nI[f1(x,y)] = x + y \r\nI[f2(x)] = x2\r\nI[p(x)] = V, se (x \u00E9 \u00EDmpar)\r\nU = conjunto dos n\u00FAmeros naturais\r\n");
		txtpnIpxV.setBounds(22, 11, 281, 133);
		panel.add(txtpnIpxV);
		
		txtEpc = new JTextField();
		txtEpc.setBackground(Color.RED);
		txtEpc.setForeground(Color.BLACK);
		txtEpc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtEpc.setEditable(false);
		txtEpc.setText("a) \u00ACp(c2) \u2192 p(c1)");
		txtEpc.setBounds(22, 155, 126, 20);
		panel.add(txtEpc);
		txtEpc.setColumns(10);
		
		JTextPane txtpnp = new JTextPane();
		txtpnp.setBackground(Color.LIGHT_GRAY);
		txtpnp.setFont(new Font("Century Schoolbook", Font.BOLD, 12));
		txtpnp.setText("= \u00ACp(2) \u2192 p(5)\r\n= \u00AC(2 \u00E9 \u00EDmpar) \u2192 (5 \u00E9 \u00EDmpar)\r\n= \u00ACF \u2192 V\r\n= F\r\n\t");
		txtpnp.setBounds(22, 186, 154, 86);
		panel.add(txtpnp);
		
		JRadioButton rbtnVerdadeiro = new JRadioButton("Verdadeiro");
		rbtnVerdadeiro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rbtnVerdadeiro.setBounds(193, 186, 109, 23);
		panel.add(rbtnVerdadeiro);
		
		JRadioButton rdbtnFalso = new JRadioButton("Falso");
		rdbtnFalso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFalso.setBounds(193, 219, 109, 23);
		panel.add(rdbtnFalso);
		
		JRadioButton rbtnLed = new JRadioButton("");
		rbtnLed.setBounds(309, 17, 21, 23);
		panel.add(rbtnLed);
		
		ButtonGroup bgResposta = new ButtonGroup();
		bgResposta.add(rbtnVerdadeiro);
		bgResposta.add(rdbtnFalso);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setBounds(193, 249, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rbtnVerdadeiro.isSelected()) {
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
	}
}
