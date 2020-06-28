package equipamento;

public class Praesidium extends Sinal {

	public Praesidium() {
		super("Praesidium");
		// TODO Auto-generated constructor stub
	}

	public double statusSinal() {
		System.out.println("Sinal praesidium faz com que a criatura perca a chance de ataque\n");
		return 0;
	}

}
