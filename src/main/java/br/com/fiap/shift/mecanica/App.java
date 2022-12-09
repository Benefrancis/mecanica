package br.com.fiap.shift.mecanica;

import br.com.fiap.shift.mecanica.model.*;

public class App {

	public static void main(String[] args) {

		CarroPasseio fuscao = new CarroPasseio();

		fuscao.setFabricante("VW");
		fuscao.setModelo("Fusca");
		fuscao.setMotor(1.6f);
		fuscao.setArCondicionado(false);
		fuscao.setDirecaoHidraulica(false);
		fuscao.setVelocidadeMaxima(160);

		System.out.println(fuscao);
				
		
		Jeep renegado = new Jeep();
		renegado.setCapota(true);
		renegado.setFabricante("FIAT");
		renegado.setModelo("SUV");
		renegado.setMotor(1.3f);
		renegado.setRpm(0);
		renegado.setTipoTracao(4);
		renegado.setVelocidade(0);
		renegado.setVelocidadeMaxima(220);
		
		System.out.println(renegado);

	}

}
