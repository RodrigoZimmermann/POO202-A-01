

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.JPanel;

import BLL.Modulo;

public class ModuloA01 extends Modulo implements Serializable {

	private JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public ModuloA01() {
		qtdAtivacoes++;
		initialize();
	}
	
	public JPanel getPanelModuloA01() {
		return this.panel;
	}
	
	public void moduloAddErroNaBomba() {
		 bomba.addError();
	}
	
	public Path moduloGetFilesPathDaBomba(){
		return bomba.getFilesPath();
	}
	
	private void initialize() {
		panel = new JPanel();
		panel.setBounds(100, 100, 450, 348);
	}
	
	// serialização: gravando o objetos no arquivo binário "nomeArq"
    public static void gravarModuloA01(Object ModuloA01, String nomeArq) {
      File arq = new File(nomeArq);
      try {
        arq.delete();
        arq.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
        objOutput.writeObject(ModuloA01);
        objOutput.close();

      } catch(IOException erro) {
          System.out.printf("Erro: ", erro.getMessage());
      }
    }
    
    
 // serialização: Multiplos objetos
    public static void gravarVariosObjetos(ArrayList<Object> ModuloA01, String nomeArq) {
      File arq = new File(nomeArq);
      try {
        arq.delete();
        arq.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
        objOutput.writeObject(ModuloA01);
        objOutput.close();

      } catch(IOException erro) {
          System.out.printf("Erro: ", erro.getMessage());
      }
    }
    
    // desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
    public static Object recuperarModuloA01(String nomeArq) {
      Object ModuloA01 = new ArrayList();
      try {
        File arq = new File(nomeArq);
        if (arq.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
           ModuloA01 = (Object)objInput.readObject();
           objInput.close();
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: ", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: ", erro2.getMessage());
      }

      return(ModuloA01);
    }
    
    // desserialização: Multiplos objetos
    public static ArrayList<Object>  recuperarVariosObjetos(String nomeArq) {
      ArrayList<Object> lista = new ArrayList();
      try {
        File arq = new File(nomeArq);
        if (arq.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
           lista = (ArrayList<Object>)objInput.readObject();
           objInput.close();
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: ", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: ", erro2.getMessage());
      }

      return(lista);
    }
 
 
}
