package BLL;

import java.util.ArrayList;

public class Bomba implements BombInterface {

	private ArrayList<Error> error = new ArrayList();

	@Override
	public void addError(Error valor) {
		this.error.add(valor);
	}

}
