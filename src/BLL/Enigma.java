package BLL;

import javax.swing.JPanel;

import poointerfaces.BombInterface;

public class Enigma {

	private int qtdUso;
	private int qtdErros;
	private int qtdAcertos;
	protected JPanel panel;
	protected boolean defused = false;
	protected BombInterface bomba;
	protected ModuloA01 modulo;

	public void attach(BombInterface arg0) {
		this.bomba = arg0;
	}

	public void attachModulo(ModuloA01 arg0) {
		this.modulo = arg0;
	}

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

	public boolean getDefused() {
		return defused;
	}

	public void setDefused(boolean defused) {
		this.defused = defused;
	}
}
