package arena;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import criatura.Criatura;
import fabricas.*;
import guerreiro.Bruxo;
import terreno.Terreno;

public class CampoDeBatalha {
	private int pontosStage1 = 0;
	private int pontosStage2 = 0;
	private int pontosStage3 = 0;
	private int pontosStage4 = 0;
	private int pontosStage5 = 0;
	private int criaturasDerrotadas = 0;
	private int nivel = 0;
	private EnumTerreno[] terrenos = new EnumTerreno[5];
	private Scanner scan;

	private int ataqueBruxo() {

		scan = new Scanner(System.in);
		System.out.println("Escolha seu ataque: ");
		System.out.println("(1) - Ataque normal: ");
		System.out.println("(2) - Ataque com Sinal: ");

		return scan.nextInt();
	}

	private void exibeEnergia(double energiaCriatura, double energiaBruxo) {
		System.out.println("-----------------------------");
		System.out.println("Energia do Bruxo: " + energiaBruxo);
		System.out.println("-----------------------------");
		System.out.println("Energia da Criatura: " + energiaCriatura);
		System.out.println("-----------------------------");
	}

	private void dadosTerreno(Criatura criatura, Terreno terreno) {
		if (terreno.getTipo() == "Campo") {
			System.out.println(
					"Criaturas do tipo - Silvano, Kermun e Dopllers - receberão bônus de 5% em sua defesa/ataque\n");
			if (criatura.getTerreno() == "Fazendas") {
				criatura.vantagemTerreno();
			}
		} else if (terreno.getTipo() == "Pântano") {
			System.out.println(
					"Criaturas do tipo - Kikimora, Harrise e Aracnos - receberão bônus de 5% em sua defesa/ataque\n");
			if (criatura.getTerreno() == "Pântano") {
				criatura.vantagemTerreno();
			}
		} else if (terreno.getTipo() == "Floresta") {
			System.out.println(
					"Criaturas do tipo - Djin, Gargula e Golem - receberão bônus de 5% em sua defesa/ataque\n");
			if (criatura.getTerreno() == "Não possui um terreno") {
				criatura.vantagemTerreno();
			}
		} else if (terreno.getTipo() == "Subterrâneo") {
			System.out.println(
					"Criaturas do tipo - Ghouls, Necrosos e Nevolosos - receberão bônus de 5% em sua defesa/ataque\n");
			if (criatura.getTerreno() == "Cemitério") {
				criatura.vantagemTerreno();
			}
		}

	}

	public void exibirTerrenos() {
		System.out.println("Terrenos");
		for (int k = 0; k < 5; k++) {
			if (terrenos[k] != null) {
				System.out.println("Nivel " + (k + 1) + ": " + terrenos[k]);
			} else {
				break;
			}
		}
	}

	private void batalhaTurnos(Criatura criatura, Bruxo bruxo, Terreno terreno) {
		bruxo.usarColar();
		int escolhaAtaque;

		dadosTerreno(criatura, terreno);

		while (bruxo.getEnergia() > 0 && criatura.getEnergia() > 0) {
			boolean controle = false;
			System.out.println("Tipo da criatura sendo enfrentada - " + criatura.getClasse());
			exibeEnergia(criatura.getEnergia(), bruxo.getEnergia());

			do {
				escolhaAtaque = ataqueBruxo();
				switch (escolhaAtaque) {
				case 1:
					System.out.println("\nBruxo aplicou um ataque de: " + bruxo.getDanoDoAtaque() + "\n");
					if (criatura.getBloqueioDoDano() < bruxo.getDanoCausado()) {
						criatura.getNovaEnergia(bruxo.getDanoCausado());
					} else {
						System.out.println("A criatura bloqueio todo o dano causado!!!\n");
					}
					break;
				case 2:
					if (criaturasDerrotadas % 2 != 0) {
						System.out.println("Bruxo aplicou um ataque com Sinal! \n");
						bruxo.usarSinal(criatura, bruxo);
					} else {
						System.out.println(
								"\nNão é possível utilizar o sinal\nSinal só pode ser utilizado na próxima batalha após derrotar a criatura atual");
						System.out.println("Será realizado um ataque padrão!!\n");
						System.out.println("Bruxo aplicou um ataque de: " + bruxo.getDanoDoAtaque() + "\n");
						if (criatura.getBloqueioDoDano() < bruxo.getDanoCausado()) {
							criatura.getNovaEnergia(bruxo.getDanoCausado());
						} else {
							System.out.println("A criatura bloqueio todo o dano causado!!!\n");
						}
					}
					break;
				}
			} while (!(escolhaAtaque == 1 || escolhaAtaque == 2));

			if (escolhaAtaque == 2 && criaturasDerrotadas % 2 != 0 && bruxo.getSinal1() == "Praesidium") {
				controle = true;
			}

			if (criatura.getEnergia() > 0) {
				if (controle == false) {
					System.out.println("A criatura aplicou um ataque de: " + criatura.getDanoDoAtaque());
					if (bruxo.getBloqueioDoDano() < criatura.getDanoCausadoCriatura()) {
						bruxo.getNovaEnergia(criatura.getDanoCausadoCriatura());
					} else {
						System.out.println("\nO bruxo bloqueio todo o dano causado!!!");
					}
				}
				System.out.println("\n\n------------------------------------------------------------------------\n\n");

				if (bruxo.getEnergia() <= 0) {
					System.out.println("Bruxo derrotado!\n----GAME OVER----\n");
					break;
				}

			} else {
				System.out.println("Criatura derrotada! \n\n");
				System.out.println("------------------------------------------------------------------------\n\n");
				criaturasDerrotadas++;
			}

		}

	}

	public void batalha(Bruxo bruxo) {
		Random random = new Random();
		ArrayList<EnumFabricas> fabrica = new ArrayList<EnumFabricas>();
		fabrica.add(EnumFabricas.Construtor);
		fabrica.add(EnumFabricas.Insectoide);
		fabrica.add(EnumFabricas.Necrofalos);
		fabrica.add(EnumFabricas.Relictio);

		ArrayList<EnumTerreno> terreno = new ArrayList<EnumTerreno>();
		terreno.add(EnumTerreno.Campo);
		terreno.add(EnumTerreno.Floresta);
		terreno.add(EnumTerreno.Pântano);
		terreno.add(EnumTerreno.Subterrâneo);

		for (int i = 0; i < 5; i++) {

			if (bruxo.getEnergia() <= 0) {
				break;
			}

			nivel++;

			if (i > 0) {
				System.out
						.println("Acrecentado um bônus de 50% da energia inicial do bruxo por ter passado de nível\n");
				bruxo.bonusEnergia();
			}

			EnumTerreno tipoTerreno = terreno.get(random.nextInt(terreno.size()));
			Terreno terrenoBatalha = FabricaTerreno.getTerreno(tipoTerreno);

			terrenos[i] = tipoTerreno;

			System.out.println("Stage - " + (i + 1) + "  Terreno - " + terrenoBatalha.getTipo());

			for (int j = 0; j < 5; j++) {
				if (bruxo.getEnergia() <= 0) {
					break;
				}
				EnumFabricas tipoFabrica = fabrica.get(random.nextInt(fabrica.size()));
				FabricaMae fabricaAleatoria = FabricaMae.getAleatoryfactory(tipoFabrica);
				Criatura criatura = fabricaAleatoria.getRandomCriature();

				batalhaTurnos(criatura, bruxo, terrenoBatalha);

			}

			if (i == 0) {
				pontosStage1 = criaturasDerrotadas;
			} else if (i == 1) {
				pontosStage2 = (criaturasDerrotadas - pontosStage1) * 2;
			} else if (i == 2) {
				pontosStage3 = (criaturasDerrotadas - pontosStage2) * 3;
			} else if (i == 3) {
				pontosStage4 = (criaturasDerrotadas - pontosStage3) * 4;
			} else if (i == 4) {
				pontosStage5 = (criaturasDerrotadas - pontosStage4) * 5;
			}

			if (i == 4 && bruxo.getEnergia() > 0) {
				System.out.println("----Congratulation----");
			}
		}
	}

	public int getCriaturasDerrotadas() {
		return criaturasDerrotadas;
	}

	public int getPontosStage1() {
		return pontosStage1;
	}

	public int getPontosStage2() {
		return pontosStage2;
	}

	public int getPontosStage3() {
		return pontosStage3;
	}

	public int getPontosStage4() {
		return pontosStage4;
	}

	public int getPontosStage5() {
		return pontosStage5;
	}

	public int getNivel() {
		return nivel;
	}

}