package equipamento;

public abstract class Colar {
	private String tipo;

	public Colar(String tipo) {
		this.tipo = tipo;
	}

	public abstract double statusColar();

	public String infoColar() {
		return tipo;
	}

}
