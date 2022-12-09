package br.com.fiap.shift.mecanica.model;

public class CarroSolar extends Carro {

	private int quantidadeBaterias;

	public int getQuantidadeBaterias() {
		return quantidadeBaterias;
	}

	public void setQuantidadeBaterias(int quantidadeBaterias) {
		this.quantidadeBaterias = quantidadeBaterias;
	}

	@Override
	public String toString() {
		return "CarroSolar [quantidadeBaterias=" + quantidadeBaterias + ", " + super.toString() + "]";
	}

}
