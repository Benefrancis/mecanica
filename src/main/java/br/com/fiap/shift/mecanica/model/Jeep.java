package br.com.fiap.shift.mecanica.model;

public class Jeep extends Carro {

	private int tipoTracao;

	private boolean capota;

	public int getTipoTracao() {
		return tipoTracao;
	}

	public void setTipoTracao(int tipoTracao) {
		this.tipoTracao = tipoTracao;
	}

	public boolean isCapota() {
		return capota;
	}

	public void setCapota(boolean capota) {
		this.capota = capota;
	}

}
