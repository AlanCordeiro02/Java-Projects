package controle;

import facade.SistemaMultimidia;

public class Nucleo {
	
	public Nucleo() {
	SistemaMultimidia sistema = new SistemaMultimidia();
	sistema.ligarTelaFrontal();
	sistema.configurarTelaFrontal();
	sistema.ligarTelaBancoEsquerdo();
	sistema.configurarTelaBancoEsquerdo();
	sistema.ligarTelaBancoDireito();
	sistema.configurarTelaBancoDireito();
	sistema.reproduzir();
	sistema.desligar();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Nucleo nucleo = new Nucleo();
	}

}
