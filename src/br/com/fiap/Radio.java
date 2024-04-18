package br.com.fiap;

public class Radio {
	// atributos 
	private int volume;
	private float estacao;
	
	
	// construtores -> comando gcfs (vazio) e gcuf (com parametro)
	public Radio() {
	}

	public Radio(int volume, float estacao) {
		setVolume(volume);
		setEstacao(estacao);
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

	public float getEstacao() {
		return estacao;
	}

	public void setEstacao(float estacao) {
		try {
			if (estacao >= 80.0f && estacao <= 105.0f) {
				this.estacao = estacao;
			}
			else {
				this.estacao = 80.0f;
				throw new Exception("Estação fora da sintonia (80.0-105.0)");
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
