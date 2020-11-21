import java.util.ArrayList;

import javax.swing.JPanel;

public class Modulo implements ModuleInterface {

	private int qtdAtivacoes;
	private ArrayList<Enigma> enigma = new ArrayList();

	public void addEnigma(Enigma valor) {
		this.enigma.add(valor);
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
		for (int i = 0; i < this.enigma.size(); i++) {
			if(i == enigma) {
				return this.enigma.get(i).getQtdUso();
			}	
		}
		return 0;
	}

	@Override
	public int getRightAnswers(int enigma) {
		for (int i = 0; i < this.enigma.size(); i++) {
			if(i == enigma) {
				return this.enigma.get(i).getQtdAcertos();
			}	
		}
		return 0;
	}

	@Override
	public int getWrongAnswers(int enigma) {
		for (int i = 0; i < this.enigma.size(); i++) {
			if(i == enigma) {
				return this.enigma.get(i).getQtdErros();
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
