package terreno;

public abstract class Terreno {
	private String tipo;

	public Terreno(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
