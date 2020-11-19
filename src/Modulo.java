import javax.swing.JPanel;

public class Modulo implements ModuleInterface{

	 private int qtdAtivacoes;
	 
	@Override
	public int getActivations() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getExecutions(int enigma) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRightAnswers(int enigma) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWrongAnswers(int enigma) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isDefused() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void attach(Bombinterface b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel getModulePanel(int enigma) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getQtdAtivacoes() {
		return qtdAtivacoes;
	}

	public void setQtdAtivacoes(int qtdAtivacoes) {
		this.qtdAtivacoes = qtdAtivacoes;
	}

}
