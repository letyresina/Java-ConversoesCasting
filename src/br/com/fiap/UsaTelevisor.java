package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaTelevisor {

	public static void main(String[] args) {
		Televisor televisor1;
		String aux;
		int volume, canal, escolha;
		
		try {
			
			aux = JOptionPane.showInputDialog("Escolha o volume");
			volume = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Escolha o canal");
			canal = Integer.parseInt(aux);
			
			televisor1 = new Televisor(volume, canal);
			
			JOptionPane.showMessageDialog(null, "Canal "
					+ televisor1.getCanal() + "\nVolume " + televisor1.getVolume());
			
			aux = JOptionPane.showInputDialog("Escolha uma das opções abaixo"
					+ "\n 1 - Aumentar Volume;"
					+ "\n 2 - Diminuir Volume;"
					+ "\n 3 - Trocar de canal");
			
			escolha = Integer.parseInt(aux);
			
			switch (escolha) {
			case 1: {
				televisor1.aumentarVolume();
				JOptionPane.showMessageDialog(null, "Canal "
						+ televisor1.getCanal() + "\nVolume " + televisor1.getVolume());
				break;
			}
			
			case 2: {
				televisor1.diminuirVolume();
				JOptionPane.showMessageDialog(null, "Canal "
						+ televisor1.getCanal() + "\nVolume " + televisor1.getVolume());
				break;
			}
			
			case 3: {
				aux = JOptionPane.showInputDialog("Escolha o canal");
				canal = Integer.parseInt(aux);
				televisor1.setCanal(canal);
				JOptionPane.showMessageDialog(null, "Canal "
						+ televisor1.getCanal() + "\nVolume " + televisor1.getVolume());
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
