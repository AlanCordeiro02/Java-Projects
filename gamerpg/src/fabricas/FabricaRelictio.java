package fabricas;

import java.util.ArrayList;
import java.util.Random;

import criatura.Criatura;
import relictio.*;

public class FabricaRelictio extends FabricaMae {
	protected static int nInstance = 0;

	public FabricaRelictio() {
		nInstance++;
	}

	public static int getNumberInstance() {
		return nInstance;
	}

	public Criatura getCriatura(EnumMonstros tipo) {
		switch (tipo) {
		case Silvano:
			return new Silvano("Silvano / Humanóide com Chifres", 10, 7, 35, "Fazendas");
		case Kermun:
			return new Kermun("Kermun / Humanóide com Chifres", 10, 7, 30, "Fazendas");
		case Dopllers:
			return new Dopllers("Dopllers / Humanóide com Chifres", 10, 7, 30, "Fazendas");

		default:
			break;
		}
		return null;
	}

	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<EnumMonstros> osenums = new ArrayList<EnumMonstros>();
		osenums.add(EnumMonstros.Silvano);
		osenums.add(EnumMonstros.Kermun);
		osenums.add(EnumMonstros.Dopllers);
		EnumMonstros classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
