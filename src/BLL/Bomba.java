package BLL;

import java.nio.file.Path;
import poointerfaces.BombInterface;

public class Bomba implements BombInterface {

	private int error;

	@Override
	public void addError() {
		error++;

	}

	@Override
	public Path getFilesPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
