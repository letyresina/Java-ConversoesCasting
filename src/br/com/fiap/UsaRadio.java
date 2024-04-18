package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaRadio {

	public static void main(String[] args) {
		Radio radio1;
		String aux;
		float estacao;
		int volume, escolha;
		
		try {
			aux = JOptionPane.showInputDialog("Escolha o volume");
			volume = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Escolha a estação");
			estacao = Float.parseFloat(aux);
			
			radio1 = new Radio(volume, estacao);
			
			JOptionPane.showMessageDialog(null, "Estacao "
					+ radio1.getEstacao() + "\nVolume " + radio1.getVolume());
			
			aux = JOptionPane.showInputDialog("Escolha uma das opções abaixo"
					+ "\n 1 - Aumentar Volume;"
					+ "\n 2 - Diminuir Volume;"
					+ "\n 3 - Trocar de estação");
			
			escolha = Integer.parseInt(aux);
			
			switch (escolha) {
			case 1: {
				radio1.aumentarVolume();
				JOptionPane.showMessageDialog(null, "Estacao "
						+ radio1.getEstacao() + "\nVolume " + radio1.getVolume());
				break;
			}
			case 2: {
				radio1.diminuirVolume();
				JOptionPane.showMessageDialog(null, "Estacao "
						+ radio1.getEstacao() + "\nVolume " + radio1.getVolume());
				break;
			}
			case 3: {
				aux = JOptionPane.showInputDialog("Escolha a nova estação");
				estacao = Float.parseFloat(aux);
				radio1.setEstacao(estacao);
				JOptionPane.showMessageDialog(null, "Estacao "
						+ radio1.getEstacao() + "\nVolume " + radio1.getVolume());
				break;
			}
			default:
				throw new Exception("Opção inválida");
			}
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
