package monsters;

public class Criature {
	private String classe;
	private int defesa;
	private int ataque;
	private int energia;
	private String terreno;

	public Criature (String classe, int defesa, int ataque, int energia, String terreno) {
		this.classe = classe;
		this.defesa = defesa;
		this.ataque = ataque;
		this.energia = energia;
		this.terreno = terreno;
	}

	
	public String infoMonster() {
		String aux = "Classe: " + classe + ", " + 
				"Defesa: " + defesa + ", " + 
				"Ataque: " + ataque + ", " + 
				"Energia: " + energia + ", " + 
				"Terreno: " + terreno;
		return aux;
	}
	
}
