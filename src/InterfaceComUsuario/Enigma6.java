package InterfaceComUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Enigma6 {

	private JFrame frame;
	private JTextField txtEpc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enigma6 window = new Enigma6();
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
	public Enigma6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 346, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnIpxV = new JTextPane();
		txtpnIpxV.setBackground(Color.LIGHT_GRAY);
		txtpnIpxV.setEditable(false);
		txtpnIpxV.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		txtpnIpxV.setText("Determine se a interpreta\u00E7\u00E3o da f\u00F3rmula a seguir \u00E9 verdadeira ou falsa, sendo que:\r\nI[c1] = 5\r\nI[c2] = 2\r\nI[c3] = 1\r\nI[f1(x,y)] = x + y \r\nI[f2(x)] = x2\r\nI[p(x)] = V, se (x \u00E9 \u00EDmpar)\r\nU = conjunto dos n\u00FAmeros naturais\r\n");
		txtpnIpxV.setBounds(22, 11, 281, 133);
		frame.getContentPane().add(txtpnIpxV);
		
		txtEpc = new JTextField();
		txtEpc.setBackground(Color.RED);
		txtEpc.setForeground(Color.BLACK);
		txtEpc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtEpc.setEditable(false);
		txtEpc.setText("a) \u00ACp(c2) \u2192 p(c1)");
		txtEpc.setBounds(22, 155, 126, 20);
		frame.getContentPane().add(txtEpc);
		txtEpc.setColumns(10);
		
		JTextPane txtpnp = new JTextPane();
		txtpnp.setBackground(Color.LIGHT_GRAY);
		txtpnp.setFont(new Font("Century Schoolbook", Font.BOLD, 12));
		txtpnp.setText("= \u00ACp(2) \u2192 p(5)\r\n= \u00AC(2 \u00E9 \u00EDmpar) \u2192 (5 \u00E9 \u00EDmpar)\r\n= \u00ACF \u2192 V\r\n= F\r\n\t");
		txtpnp.setBounds(22, 186, 154, 86);
		frame.getContentPane().add(txtpnp);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Verdadeiro");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(193, 186, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFalso = new JRadioButton("Falso");
		rdbtnFalso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFalso.setBounds(193, 219, 109, 23);
		frame.getContentPane().add(rdbtnFalso);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setBounds(193, 249, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(309, 17, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
