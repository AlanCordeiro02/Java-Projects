package nucleo;

import builder.*;
import gerente.BruxoGerente;
import guerreiro.Bruxo;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BruxoGerente gerente = new BruxoGerente();
		
		gerente.BruxoInterface(new BruxoAltoNivelBuilder());
		gerente.getBruxoAltoNivel();
		
		Bruxo bruxo = gerente.getBruxo();
		
		System.out.println(bruxo.infoBruxo());
	
	
	}

}
