package fabricas;
import java.util.ArrayList;
import java.util.Random;

import criature.Criatura;
import relictio.*;

public class FabricaRelictio extends FabricaMae {

	public Criatura getCriatura(EnumMonstros tipo) {
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
		ArrayList<EnumMonstros> osenums = new ArrayList<EnumMonstros>();
		osenums.add(EnumMonstros.Silvano);
		osenums.add(EnumMonstros.Kermun);
		osenums.add(EnumMonstros.Dopllers);
		EnumMonstros classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
