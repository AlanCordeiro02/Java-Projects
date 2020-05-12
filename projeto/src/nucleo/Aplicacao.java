package nucleo;

import builder.BruxoBuilder;
import gerente.BruxoGerente;
import guerreiro.Bruxo;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BruxoGerente gerente = new BruxoGerente();
		
		gerente.BruxoInterface(new BruxoBuilder());
		gerente.getBruxoEmFormacao();
		
		Bruxo bruxo = gerente.getBruxo();
		
		System.out.println(bruxo.infoBruxo());
	
	
	}

}
