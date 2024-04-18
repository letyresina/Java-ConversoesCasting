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
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
