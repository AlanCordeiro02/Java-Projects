package fabricas;
import java.util.ArrayList;
import java.util.Random;

import criature.Criatura;
import relictio.*;

public class Fabrica3 extends FabricaMae {

	public Criatura getCriatura(Osenums tipo) {
		switch(tipo) {
			case Silvano:
				return new Silvano("Silvano / Humanóide com Chifres", 5, 7, 3, "Fazendas");
			case Kermun:
				return new Kermun("Kermun / Humanóide com Chifres", 5, 7, 3, "Fazendas");
			case Dopllers:
				return new Dopllers("Dopllers / Humanóide com Chifres", 5, 7, 3, "Fazendas");
		}
		return null;
	}


	@Override
	public  Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<Osenums> osenums = new ArrayList<Osenums>();
		osenums.add(Osenums.Silvano);
		osenums.add(Osenums.Kermun);
		osenums.add(Osenums.Dopllers);
		Osenums classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
