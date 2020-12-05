package BLL;

import java.nio.file.Path;
import poointerfaces.BombInterface;

public class Bomba implements BombInterface {

	private int error;
	private Path path;

	@Override
	public void addError() {
		error++;
	}

	@Override
	public Path getFilesPath() {
		return path;
	}
	
	public void setFilesPath(Path path) {
		this.path = path;
	}
	
	public void getError() {
		error++;
	}

}
