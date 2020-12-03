package BLL;

import javax.swing.JPanel;
import InterfaceComUsuario.Enigma01;
import InterfaceComUsuario.Enigma02;
import InterfaceComUsuario.Enigma03;
import InterfaceComUsuario.Enigma04;
import InterfaceComUsuario.Enigma05;
import InterfaceComUsuario.Enigma06;
import poointerfaces.BombInterface;
import poointerfaces.ModuleInterface;

public class Modulo implements ModuleInterface {

	protected int qtdAtivacoes = 0 ;
	private Enigma enigma[] = new Enigma[6];
	//private BombInterface b;
	
	public Modulo() {
		enigma[0] = new Enigma01();
		enigma[1] = new Enigma02();
		enigma[2] = new Enigma03();
		enigma[3] = new Enigma04();
		enigma[4] = new Enigma05();
		enigma[5] = new Enigma06();
	}

	@Override
	public void attach(BombInterface arg0) {
		//this.b = arg0;
	}

	@Override
	public int getActivations() {
		return this.qtdAtivacoes;
	}

	@Override
	public int getExecutions(int arg0) {
		for (int i = 0; i < this.enigma.length; i++) {
			if (i == arg0) {
				return this.enigma[i].getQtdUso();
			}
		}
		return 0;
	}

	@Override
	public JPanel getModulePanel(int arg0) {
		for (int i = 0; i < this.enigma.length; i++) {
			if (i == arg0) {
				return this.enigma[i].getPanel();
			}
		}
		return null;
	}

	@Override
	public int getRightAnswers(int arg0) {
		for (int i = 0; i < this.enigma.length; i++) {
			if (i == arg0) {
				return this.enigma[i].getQtdAcertos();
			}
		}
		return 0;
	}

	@Override
	public int getWrongAnswers(int arg0) {
		for (int i = 0; i < this.enigma.length; i++) {
			if (i == arg0) {
				return this.enigma[i].getQtdErros();
			}
		}
		return 0;
	}

	@Override
	public boolean isDefused() {
		if (enigma[0].getDefused() == true) {
			return true;
		} else if (enigma[1].getDefused() == true) {
			return true;
		} else if (enigma[2].getDefused() == true) {
			return true;
		} else if (enigma[3].getDefused() == true) {
			return true;
		} else if (enigma[4].getDefused() == true) {
			return true;
		} else if (enigma[5].getDefused() == true) {
			return true;
		}
		return false;
	}

}
