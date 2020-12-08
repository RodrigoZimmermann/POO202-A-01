package BLL;

import java.nio.file.Path;
import poointerfaces.BombInterface;

public class Bomba implements BombInterface {

	private int error;
	private Path path;

	@Override
	public void addError() {
		this.error++;
	}

	@Override
	public Path getFilesPath() {
		return this.path;
	}
}
