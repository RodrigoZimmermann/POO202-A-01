package InterfaceComUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import BLL.Modulo;

public class ModuloA01 extends Modulo implements Serializable {

	private JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public ModuloA01() {
		initialize();
	}
	
	public JPanel getPanel() {
		return this.panel;
	}
	
	private void initialize() {
		panel = new JPanel();
		panel.setBounds(100, 100, 450, 348);
	
		qtdAtivacoes++;

		// enigma01 = 0 enigma02 = 1 enigma03 = 2 enigma04 = 3 enigma05 = 4 engima06 = 5
		
		JButton btnNewButton = new JButton("Testar Estatisticas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JOptionPane.showMessageDialog(null,"Execuções: " + getExecutions(3) +" "
				 + "Acertos: " + getRightAnswers(3) +" "+ "Erros: " + getWrongAnswers(3) +" "
				  + "Está defusado: "+ isDefused());
				 
				 if(isDefused() == false) {
					 bomba.addError();
				 }
			}
		});
		
		JButton salvar = new JButton("Salvar");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// CHAMAR A SERILIZAÇÃO
			}
		});
		
		
		panel.setLayout(null);
		btnNewButton.setBounds(150, 50, 165, 23);
		panel.add(btnNewButton);
		
		panel.setLayout(null);
		salvar.setBounds(54, 23, 165, 23);
		panel.add(salvar);
		
		// Pegar o PANEL 
		panel.add(getModulePanel(3));
	}
	
	// serialização: gravando o objetos no arquivo binário "nomeArq"
    public static void gravarArquivoBinario(ModuloA01 ModuloA01, String nomeArq) {
      File arq = new File(nomeArq);
      try {
        arq.delete();
        arq.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
        objOutput.writeObject(ModuloA01);
        objOutput.close();

      } catch(IOException erro) {
          System.out.printf("Erro: %s", erro.getMessage());
      }
    }
    
    
 // desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
    public static ArrayList<Object> lerArquivoBinario(String nomeArq) {
      ArrayList<Object> lista = new ArrayList();
      try {
        File arq = new File(nomeArq);
        if (arq.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
           lista = (ArrayList<Object>)objInput.readObject();
           objInput.close();
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
      }

      return(lista);
    }
 
}
