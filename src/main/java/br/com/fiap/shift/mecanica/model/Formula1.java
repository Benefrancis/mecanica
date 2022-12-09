package br.com.fiap.shift.mecanica.model;

public class Formula1 extends Carro{
	
	private String equipe;

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		return "Formula1 [equipe=" + equipe + ", " + super.toString() + "]";
	}

}
