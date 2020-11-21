package InterfaceComUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Enigma01 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enigma01 window = new Enigma01();
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
	public Enigma01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Relacione as colunas considerando o seguinte esquema:");
		lblNewLabel.setBounds(10, 11, 359, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_4_1 = new JLabel("\u00ACC ^ \u00ACQ");
		lblNewLabel_4_1.setBounds(336, 73, 88, 14);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("C -> (Q v R)");
		lblNewLabel_5_1.setBounds(336, 92, 88, 14);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("C ^ \u00ACQ ");
		lblNewLabel_6_1.setBounds(336, 117, 88, 14);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("C");
		lblNewLabel_7_1.setBounds(336, 137, 88, 14);
		frame.getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("C -> Q");
		lblNewLabel_8_1.setBounds(336, 161, 88, 20);
		frame.getContentPane().add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Q v \u00ACR");
		lblNewLabel_9_1.setBounds(336, 181, 88, 20);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("\u00ACC");
		lblNewLabel_10_1.setBounds(336, 212, 88, 16);
		frame.getContentPane().add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("C v \u00ACQ");
		lblNewLabel_11_1.setBounds(336, 228, 88, 19);
		frame.getContentPane().add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("\u00AC(C v Q)");
		lblNewLabel_13_1.setBounds(336, 262, 88, 14);
		frame.getContentPane().add(lblNewLabel_13_1);
		
		JSpinner spinnerSeis = new JSpinner();
		spinnerSeis.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerSeis.setBounds(296, 70, 30, 20);
		frame.getContentPane().add(spinnerSeis);
		
		JSpinner spinnerDez = new JSpinner();
		spinnerDez.setBounds(296, 89, 30, 20);
		frame.getContentPane().add(spinnerDez);
		
		JSpinner spinnerTres = new JSpinner();
		spinnerTres.setBounds(296, 114, 30, 20);
		frame.getContentPane().add(spinnerTres);
		
		JSpinner spinnerUm = new JSpinner();
		spinnerUm.setBounds(296, 134, 30, 20);
		frame.getContentPane().add(spinnerUm);
		
		JSpinner spinnerNove = new JSpinner();
		spinnerNove.setBounds(296, 161, 30, 20);
		frame.getContentPane().add(spinnerNove);
		
		JSpinner spinnerOito = new JSpinner();
		spinnerOito.setBounds(296, 181, 30, 20);
		frame.getContentPane().add(spinnerOito);
		
		JSpinner spinnerDois = new JSpinner();
		spinnerDois.setBounds(296, 206, 30, 20);
		frame.getContentPane().add(spinnerDois);
		
		JSpinner spinnerCinco = new JSpinner();
		spinnerCinco.setBounds(296, 227, 30, 20);
		frame.getContentPane().add(spinnerCinco);
		
		JSpinner spinnerQuatro = new JSpinner();
		spinnerQuatro.setBounds(296, 258, 30, 22);
		frame.getContentPane().add(spinnerQuatro);
		
		JTextPane txtpnOCarro = new JTextPane();
		txtpnOCarro.setEditable(false);
		txtpnOCarro.setText("(1) O carro \u00E9 caro\r\n(2) O carro n\u00E3o \u00E9 caro\r\n(3) O carro \u00E9 caro e n\u00E3o \u00E9 quebrado\r\n(4) N\u00E3o \u00E9 verdade que o carro \u00E9 caro ou quebrado\r\n(5) O carro \u00E9 caro ou n\u00E3o \u00E9 quebrado\r\n(6) O carro n\u00E3o \u00E9 caro e n\u00E3o \u00E9 quebrado\r\n(7) O carro \u00E9 caro ou quebrado, mas \u00E9 r\u00E1pido\r\n(8) O carro \u00E9 quebrado ou n\u00E3o \u00E9 r\u00E1pido\r\n(9) Se o carro \u00E9 caro, ent\u00E3o \u00E9 quebrado\r\n(10) Se o carro \u00E9 caro, \u00E9 quebrado ou \u00E9 r\u00E1pido");
		txtpnOCarro.setBounds(21, 100, 259, 191);
		frame.getContentPane().add(txtpnOCarro);
		
		JEditorPane dtrpnCO = new JEditorPane();
		dtrpnCO.setBackground(Color.LIGHT_GRAY);
		dtrpnCO.setEditable(false);
		dtrpnCO.setText("C = O carro \u00E9 caro\r\nQ = O carro esta quebrado\r\nR = O carro \u00E9 r\u00E1pido");
		dtrpnCO.setBounds(20, 37, 259, 53);
		frame.getContentPane().add(dtrpnCO);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(403, 7, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(312, 36, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JSpinner spinnerSete = new JSpinner();
		spinnerSete.setBounds(296, 276, 30, 22);
		frame.getContentPane().add(spinnerSete);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("(C v Q) ^ R");
		lblNewLabel_13_1_1.setBounds(336, 280, 88, 14);
		frame.getContentPane().add(lblNewLabel_13_1_1);
	}
}
