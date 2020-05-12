package equipamento;

public class Equipamento {

	protected String tipo;
	protected int ataque;
	protected int defesa;
	
	public Equipamento(String tipo, int ataque, int defesa) {
		this.tipo=tipo;
		this.ataque=ataque;
		this.defesa=defesa;
	}
	
	public String infoEquipamento() {
		return  "Tipo - "+tipo+", Ataque - " +ataque+ ", Defesa - "+defesa;
	}

}
