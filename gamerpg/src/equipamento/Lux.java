package equipamento;

import guerreiro.Bruxo;

public class Lux extends Sinal {

	public Lux() {
		super("Lux");
		// TODO Auto-generated constructor stub
	}

	public double statusSinal() {
		return Bruxo.getAtaqueTotal();
	}

}
