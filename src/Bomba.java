import java.util.ArrayList;

public class Bomba implements BombInterface {

	private ArrayList<Modulo> modulo = new ArrayList();
	private ArrayList<Error> error = new ArrayList();

	public void addModulo(Modulo valor) {
		this.modulo.add(valor);
	}
	
	@Override
	public void addError(Error valor) {
		this.error.add(valor);
	}

}
