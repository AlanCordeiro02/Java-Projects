package nucleo;

import arena.CampoDeBatalha;
import fabricas.*;
import gerente.BruxoGerente;
import guerreiro.Bruxo;

public class Aplicacao {

	public static void main(String[] args) {

		BruxoGerente gerente = new BruxoGerente();

		CampoDeBatalha batalha = new CampoDeBatalha();

		gerente.escolhaPersonagem();

		Bruxo bruxo = gerente.getBruxo();

		System.out.println(bruxo.infoBruxo() + "\n");

		batalha.batalha(bruxo);

		int totalPontos = (batalha.getPontosStage1() + batalha.getPontosStage2() + batalha.getPontosStage3()
				+ batalha.getPontosStage4() + batalha.getPontosStage5());
		System.out.println("\nO bruxo " + bruxo.getNome() + " chegou no nivel " + batalha.getNivel() + "\n");
		System.out.println("Foram enfrentados:" + "\n" + FabricaConstrutor.getNumberInstance() + " - Construtores"
				+ "\n" + FabricaInsectoide.getNumberInstance() + " - Insectoides" + "\n"
				+ FabricaNecrofalos.getNumberInstance() + " - Necrofagos" + "\n" + FabricaRelictio.getNumberInstance()
				+ " - Relictios\n");

		batalha.exibirTerrenos();

		System.out.println("\nRANKING");
		System.out.println("PS |  NOME  |  PTS  | CRIATURAS");
		System.out.println("_________________________________");
		System.out.println(
				"1  | " + bruxo.getNome() + " |  " + totalPontos + "    |   " + batalha.getCriaturasDerrotadas());
	}
}