package BLL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.JPanel;
import InterfaceComUsuario.Enigma01;
import InterfaceComUsuario.Enigma02;
import InterfaceComUsuario.Enigma03;
import InterfaceComUsuario.Enigma04;
import InterfaceComUsuario.Enigma05;
import InterfaceComUsuario.Enigma06;
import poointerfaces.BombInterface;
import poointerfaces.ModuleInterface;

public class ModuloA01 implements ModuleInterface {

	protected int qtdAtivacoes = 0;
	private Enigma enigma[] = new Enigma[6];
	protected BombInterface bomba = null;
	private ModuloA01 moduloA01 = null;

	public ModuloA01() {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				try {
					this.moduloA01 = recuperarModuloA01(bomba.getFilesPath().getFileName().toString());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			enigma[0] = new Enigma01();
			enigma[1] = new Enigma02();
			enigma[2] = new Enigma03();
			enigma[3] = new Enigma04();
			enigma[4] = new Enigma05();
			enigma[5] = new Enigma06();
			// Para o enigma conhecer o modulo
			enigma[0].attachModulo(this);
			enigma[1].attachModulo(this);
			enigma[2].attachModulo(this);
			enigma[3].attachModulo(this);
			enigma[4].attachModulo(this);
			enigma[5].attachModulo(this);
		}

	}

	@Override
	public void attach(BombInterface arg0) {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				this.moduloA01.bomba = arg0;
				// Para o enigma conhecer a bomba
				moduloA01.enigma[0].attach(arg0);
				moduloA01.enigma[1].attach(arg0);
				moduloA01.enigma[2].attach(arg0);
				moduloA01.enigma[3].attach(arg0);
				moduloA01.enigma[4].attach(arg0);
				moduloA01.enigma[5].attach(arg0);
			}
		} else {
			this.bomba = arg0;
			// Para o enigma conhecer a bomba
			enigma[0].attach(arg0);
			enigma[1].attach(arg0);
			enigma[2].attach(arg0);
			enigma[3].attach(arg0);
			enigma[4].attach(arg0);
			enigma[5].attach(arg0);
		}
	}

	@Override
	public int getActivations() {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				return this.moduloA01.qtdAtivacoes;
			}
		}
		return this.qtdAtivacoes;
	}

	@Override
	public int getExecutions(int arg0) {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				return this.moduloA01.enigma[arg0 - 1].getQtdUso();
			}
		}
		return this.enigma[arg0 - 1].getQtdUso();
	}

	@Override
	public JPanel getModulePanel(int arg0) {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				return this.moduloA01.enigma[arg0 - 1].getPanel();
			}
		}
		return this.enigma[arg0 - 1].getPanel();
	}

	@Override
	public int getRightAnswers(int arg0) {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				return this.moduloA01.enigma[arg0 - 1].getQtdAcertos();
			}
		}
		return this.enigma[arg0 - 1].getQtdAcertos();
	}

	@Override
	public int getWrongAnswers(int arg0) {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				return this.moduloA01.enigma[arg0 - 1].getQtdErros();
			}
		}
		return this.enigma[arg0 - 1].getQtdErros();
	}

	@Override
	public boolean isDefused() {
		if (bomba != null) {
			if (bomba.getFilesPath() != null) {
				if (this.moduloA01.enigma[0].getDefused() == true) {
					return true;
				} else if (this.moduloA01.enigma[1].getDefused() == true) {
					return true;
				} else if (this.moduloA01.enigma[2].getDefused() == true) {
					return true;
				} else if (this.moduloA01.enigma[3].getDefused() == true) {
					return true;
				} else if (this.moduloA01.enigma[4].getDefused() == true) {
					return true;
				} else if (this.moduloA01.enigma[5].getDefused() == true) {
					return true;
				}
				return false;
			}
		}
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

	// serialização: gravando o objetos no arquivo binário "nomeArq"
	public void gravarModuloA01(Object ModuloA01, Path nomeArq) throws IOException, ClassNotFoundException {
		try {
			File arq = new File(nomeArq.getFileName().toString());
			ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
			objOutput.writeObject(ModuloA01);
			objOutput.close();

		} catch (IOException erro) {
			System.out.printf("Erro: ", erro.getMessage());
		}
	}

	// serialização: Multiplos objetos
	public void gravarVariosObjetos(ArrayList<Object> ModuloA01, String nomeArq) {
		File arq = new File(nomeArq);
		try {
			arq.delete();
			arq.createNewFile();

			ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
			objOutput.writeObject(ModuloA01);
			objOutput.close();

		} catch (IOException erro) {
			System.out.printf("Erro: ", erro.getMessage());
		}
	}

	// desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
	public ModuloA01 recuperarModuloA01(String nomeArq) throws IOException, ClassNotFoundException {
		Object ModuloA01 = new Object();
		try {
			File arq = new File(nomeArq);
			if (arq.exists()) {
				ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
				ModuloA01 = (Object) objInput.readObject();
				objInput.close();
			}
		} catch (IOException erro1) {
			System.out.printf("Erro: ", erro1.getMessage());
		} catch (ClassNotFoundException erro2) {
			System.out.printf("Erro: ", erro2.getMessage());
		}

		return (BLL.ModuloA01) (ModuloA01);
	}

	// desserialização: Multiplos objetos
	public ArrayList<Object> recuperarVariosObjetos(String nomeArq) {
		ArrayList<Object> lista = new ArrayList();
		try {
			File arq = new File(nomeArq);
			if (arq.exists()) {
				ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
				lista = (ArrayList<Object>) objInput.readObject();
				objInput.close();
			}
		} catch (IOException erro1) {
			System.out.printf("Erro: ", erro1.getMessage());
		} catch (ClassNotFoundException erro2) {
			System.out.printf("Erro: ", erro2.getMessage());
		}

		return (lista);
	}

}
