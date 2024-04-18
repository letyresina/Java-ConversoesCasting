package br.com.fiap;

public class Televisor {
	// atributos 
	private int volume;
	public int canal;
	
	// construtores
	public Televisor() {}

	public Televisor(int volume, int canal) {
		setVolume(volume);
		setCanal(canal);
	}

	// getters e setters
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 10) {
				this.volume = volume;
			}
			else {
				throw new Exception("Volume fora da faixa permitida (0-10)");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		try {
			if (canal == 2 || canal == 4 || canal == 5 || canal == 13) {
				this.canal = canal;
			}
			else {
				throw new Exception("Canal fora de sintonia (2, 4, 5, 13)");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	// métodos
		public void aumentarVolume() {
			if (volume < 10) {
				volume++;
			}
		}
		
		public void diminuirVolume() {
			if (volume > 0) {
				volume--;
			}
		}	
}
