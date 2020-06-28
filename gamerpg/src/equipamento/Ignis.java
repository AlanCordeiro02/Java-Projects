package equipamento;

import criatura.*;

public class Ignis extends Sinal {

	public Ignis() {
		super("Ignis");
		// TODO Auto-generated constructor stub
	}

	public double statusSinal() {
		return Criatura.getDefesa() - (Criatura.getDefesa() * 0.15);
	}
}
