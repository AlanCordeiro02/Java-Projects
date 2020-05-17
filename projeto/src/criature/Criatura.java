package criature;


public abstract class Criatura {
	private String classe;
	private int ataque;
	private int defesa;
	private int energia;
	private String terreno;

	public Criatura(String classe, int ataque, int defesa, int energia, String terreno) {
		this.classe = classe;
		this.ataque = ataque;
		this.defesa = defesa;
		this.energia = energia;
		this.terreno = terreno;
	}
	
	public String getClasse() {
		return classe;
	}


	public int getAtaque() {
		return ataque;
	}


	public int getDefesa() {
		return defesa;
	}


	public int getEnergia() {
		return energia;
	}


	public String getTerreno() {
		return terreno;
	}


	public String infoMonster() {
		String aux = "Classe: " + classe + ", " + 
				"Ataque: " + ataque + ", " + 
				"Defesa: " + defesa + ", " + 
				"Energia: " + energia + ", " + 
				"Terreno: " + terreno;
		return aux;
	

	}



	
}
