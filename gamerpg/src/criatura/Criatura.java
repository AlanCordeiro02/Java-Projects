package criatura;

import java.util.Random;

public abstract class Criatura {
	private String classe;
	protected double ataque;
	protected static double defesa;
	private double energia;
	private double danoCausadoCriatura;
	private double bloqueioCriatura;
	private String terreno;

	public Criatura(String classe, double ataque, double defesa, double energia, String terreno) {
		this.classe = classe;
		this.ataque = ataque;
		this.defesa = defesa;
		this.energia = energia;
		this.terreno = terreno;
	}

	public double getFator() {
		Random random = new Random();
		double fatorRandom = random.nextInt(10);
		while ((fatorRandom / 10) < 0.5) {
			fatorRandom = random.nextInt(10);
		}
		return fatorRandom / 10;
	}

	public double getDanoDoAtaque() {
		danoCausadoCriatura = getAtaque() * getFator();
		return danoCausadoCriatura;
	}

	public double getBloqueioDoDano() {
		bloqueioCriatura = getDefesa() * getFator();
		return bloqueioCriatura;
	}

	public double getNovaEnergia(double dano) {
		energia -= dano;
		return energia;
	}

	public void vantagemTerreno() {
		ataque = (ataque + (ataque * 0.05));
		defesa = (defesa + (defesa * 0.05));
	}

	public String getClasse() {
		return classe;
	}

	public double getAtaque() {
		return ataque;
	}

	public static double getDefesa() {
		return defesa;
	}

	public double getEnergia() {
		return energia;
	}

	public double getDanoCausadoCriatura() {
		return danoCausadoCriatura;
	}

	public double getBloqueioCriatura() {
		return bloqueioCriatura;
	}

	public String getTerreno() {
		return terreno;
	}

	public String infoMonster() {
		String aux = "Classe: " + classe + ", " + "Ataque: " + ataque + ", " + "Defesa: " + defesa + ", " + "Energia: "
				+ energia + ", " + "Terreno: " + terreno;
		return aux;

	}

}
