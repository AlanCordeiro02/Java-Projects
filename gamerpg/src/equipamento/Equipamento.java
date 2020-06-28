package equipamento;

public abstract class Equipamento {

	protected String tipo;
	protected int ataque;
	protected int defesa;

	public Equipamento(String tipo, int ataque, int defesa) {
		this.tipo = tipo;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public String infoEquipamento() {
		return "Tipo - " + tipo + ", Ataque - " + ataque + ", Defesa - " + defesa;
	}

}
