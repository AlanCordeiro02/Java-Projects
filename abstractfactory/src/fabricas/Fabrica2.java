package fabricas;
import construtor.*;
import criature.Criatura;
import java.util.ArrayList;
import java.util.Random;

public class Fabrica2 extends FabricaMae {

	public Criatura getCriatura(Osenums tipo) {
		switch (tipo) {
			case Dijnn:
				return new Dijnn("Djin / Gênio", 8, 9, 10, "Não possui um terreno.");
			case Gargulas:
				return new Gargulas("Gargula / Gênio", 8, 9, 10, "Não possui um terreno.");
			case Gofens:
				return new Gofens("Gofens / Gênio", 8, 9, 10, "Não possui um terreno.");
				
		}
		return null;
	}


	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<Osenums> osenums = new ArrayList<Osenums>();
		osenums.add(Osenums.Dijnn);
		osenums.add(Osenums.Gargulas);
		osenums.add(Osenums.Gofens);
		Osenums classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}
}
