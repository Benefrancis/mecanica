package br.com.fiap.shift.mecanica.model;

public class Carro {

	private String modelo;

	private String fabricante;

	private float motor;

	private int velocidadeMaxima;

	private int rpm;

	private int velocidade;

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void acelerar(int intensidade) {
		this.rpm += intensidade;
		this.velocidade++;
	}

	public void brecar(int intensidade) {
		this.velocidade--;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", fabricante=" + fabricante + ", motor=" + motor + ", velocidadeMaxima="
				+ velocidadeMaxima + ", rpm=" + rpm + ", velocidade=" + velocidade + "]";
	}
	
	
}
