package br.com.fiap.shift.mecanica.model;

public class CarroPasseio extends Carro {

	private boolean direcaoHidraulica;

	private boolean arCondicionado;

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	@Override
	public String toString() {
		return "CarroPasseio [direcaoHidraulica=" + direcaoHidraulica + ", arCondicionado=" + arCondicionado + ", "
				+ super.toString() + "]";
	}

}
