package BLL;

import javax.swing.JPanel;
import InterfaceComUsuario.Enigma01;
import InterfaceComUsuario.Enigma02;
import InterfaceComUsuario.Enigma03;
import InterfaceComUsuario.Enigma04;
import InterfaceComUsuario.Enigma05;
import InterfaceComUsuario.Enigma06;

public class Modulo implements ModuleInterface {

	private int qtdAtivacoes;
	private Enigma enigma[] = new Enigma[5];

	public Modulo() {
		enigma[0] = new Enigma01();
		enigma[1] = new Enigma02();
		enigma[2] = new Enigma03();
		enigma[3] = new Enigma04();
		enigma[4] = new Enigma05();
		enigma[5] = new Enigma06();
	}

	public void setQtdAtivacoes(int qtdAtivacoes) {
		this.qtdAtivacoes = qtdAtivacoes;
	}

	@Override
	public int getActivations() {
		return this.qtdAtivacoes;
	}

	@Override
	public int getExecutions(int enigma) {
		for (int i = 0; i < this.enigma.length; i++) {
			if (i == enigma) {
				return this.enigma[i].getQtdUso();
			}
		}
		return 0;
	}

	@Override
	public int getRightAnswers(int enigma) {
		for (int i = 0; i < this.enigma.length; i++) {
			if (i == enigma) {
				return this.enigma[i].getQtdAcertos();
			}
		}
		return 0;
	}

	@Override
	public int getWrongAnswers(int enigma) {
		for (int i = 0; i < this.enigma.length; i++) {
			if (i == enigma) {
				return this.enigma[i].getQtdErros();
			}
		}
		return 0;
	}

	@Override
	public boolean isDefused() {
		return this.getActivations() == 5;
	}

	@Override
	public JPanel getModulePanel(int enigma) {
		return null;
	}

	@Override
	public void attach(BombInterface b) {
		// TODO Auto-generated method stub

	}

}
