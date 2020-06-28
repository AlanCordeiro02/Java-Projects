package equipamento;

public abstract class Sinal {

	private String tipo;

	public Sinal(String tipo) {
		this.tipo = tipo;
	}

	public String infoSinal() {
		return tipo;
	}

	public abstract double statusSinal();

}
