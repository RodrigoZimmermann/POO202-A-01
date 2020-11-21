
import javax.swing.JPanel;

public interface ModuleInterface {
	public int getActivations();

	public int getExecutions(int enigma);

	public int getRightAnswers(int enigma);

	public int getWrongAnswers(int enigma);

	public boolean isDefused();

	public void attach(BombInterface b);

	public JPanel getModulePanel(int enigma);
}
