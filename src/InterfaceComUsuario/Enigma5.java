package InterfaceComUsuario;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Enigma5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enigma5 window = new Enigma5();
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
	public Enigma5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnDetermineA = new JTextPane();
		txtpnDetermineA.setBackground(Color.LIGHT_GRAY);
		txtpnDetermineA.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtpnDetermineA.setEditable(false);
		txtpnDetermineA.setText("1.A interpreta\u00E7\u00E3o correta da f\u00F3rmula a seguir, \u00E9:");
		txtpnDetermineA.setBounds(10, 11, 304, 20);
		frame.getContentPane().add(txtpnDetermineA);
		
		JTextPane txtpnIc = new JTextPane();
		txtpnIc.setBackground(Color.LIGHT_GRAY);
		txtpnIc.setForeground(Color.BLACK);
		txtpnIc.setToolTipText("");
		txtpnIc.setEditable(false);
		txtpnIc.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnIc.setText("I[c1] = 5\r\nI[c2] = 2\r\nI[c3] = 1\r\nI[f1(x,y)] = x + y \r\nI[f2(x)] = x2\r\nI[p(x)] = V, se (x \u00E9 \u00EDmpar)\r\nU = conjunto dos n\u00FAmeros naturais \r\n \r\n");
		txtpnIc.setBounds(20, 36, 209, 103);
		frame.getContentPane().add(txtpnIc);

		JScrollPane scroll = new JScrollPane();
        scroll.setBounds(20, 36, 209, 103); // Setar o bound igual ao do textPane
        frame.getContentPane().add(scroll);
		
		JTextPane txtpnAPc = new JTextPane();
		txtpnAPc.setEditable(false);
		txtpnAPc.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnAPc.setBackground(Color.RED);
		txtpnAPc.setForeground(Color.BLACK);
		txtpnAPc.setText("c) p(f2(f1(c1,c3))):");
		txtpnAPc.setBounds(20, 161, 123, 20);
		frame.getContentPane().add(txtpnAPc);
		
		JTextPane txtpnPff = new JTextPane();
		txtpnPff.setBackground(Color.LIGHT_GRAY);
		txtpnPff.setForeground(Color.BLACK);
		txtpnPff.setEditable(false);
		txtpnPff.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		txtpnPff.setText("= p(f2(f1(5,1))) - 1\u00BA passo\r\n= p (f2 (5 + 1))) - 2\u00BA passo\r\n= p (f2 (5 + 1))) - 3\u00BA passo\r\n= p(6\u00B2) - 4\u00BA passo\r\n= (36 \u00E9 \u00EDmpar) - 5\u00BA passo\r\n= V - 6\u00BA passo\r\n");
		txtpnPff.setBounds(153, 150, 176, 100);
		frame.getContentPane().add(txtpnPff);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Verdadeira");
		rdbtnNewRadioButton.setBounds(30, 188, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFalsa = new JRadioButton("Falsa");
		rdbtnFalsa.setBounds(30, 214, 109, 23);
		frame.getContentPane().add(rdbtnFalsa);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.setBounds(239, 116, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setBounds(320, 8, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
	}

}
