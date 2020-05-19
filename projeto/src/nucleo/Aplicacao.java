package nucleo;

import java.util.ArrayList;
import java.util.Random;
import fabricas.*;
import builder.*;
import criature.Criatura;
import gerente.BruxoGerente;
import guerreiro.Bruxo;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BruxoGerente gerente = new BruxoGerente();
		Random random = new Random();
		
		gerente.escolhaPersonagem();
		
		Bruxo bruxo = gerente.getBruxo();
		
		System.out.println(bruxo.infoBruxo()+"\n");
		
		ArrayList<EnumFabricas> fabrica = new ArrayList<EnumFabricas>();
			fabrica.add(EnumFabricas.Construtor);
			fabrica.add(EnumFabricas.Insectoide);
			fabrica.add(EnumFabricas.Necrofalos);
			fabrica.add(EnumFabricas.Relictio);
		
		for(int i = 0; i<=24; i++) {
			EnumFabricas tipoFabrica = fabrica.get(random.nextInt(fabrica.size()));
			FabricaMae fabricaAleatoria = FabricaMae.getAleatoryfactory(tipoFabrica);
			Criatura criatura = fabricaAleatoria.getRandomCriature();
			System.out.println("Bruxo - " +bruxo.getNome() +" X " +"Criatura - " +criatura.getClasse());
		}
		
	
	}

}
