package BLL;

import javax.swing.JPanel;

public class Enigma {

	private int qtdUso;
	private int qtdErros;
	private int qtdAcertos;
	protected JPanel panel;

	public int getQtdErros() {
		return qtdErros;
	}

	public void addQtdErros() {
		this.qtdErros++;
	}

	public int getQtdAcertos() {
		return qtdAcertos;
	}

	public void addQtdAcertos() {
		this.qtdAcertos++;
	}

	public int getQtdUso() {
		return qtdUso;
	}

	public void addQtdUso() {
		this.qtdUso++;
	}

	public JPanel getPanel() {
		return panel;
	}

}
