package fabricas;

import construtor.*;
import criatura.Criatura;

import java.util.ArrayList;
import java.util.Random;

public class FabricaConstrutor extends FabricaMae {

	private static int nInstance = 0;

	public FabricaConstrutor() {
		nInstance++;
	}

	public static int getNumberInstance() {
		return nInstance;
	}

	public Criatura getCriatura(EnumMonstros tipo) {
		switch (tipo) {
		case Dijnn:
			return new Dijnn("Djin / G�nio", 10, 8, 30, "N�o possui um terreno");
		case Gargulas:
			return new Gargulas("Gargula / G�nio", 10, 8, 25, "N�o possui um terreno");
		case Golem:
			return new Golem("Gargula / G�nio", 10, 8, 40, "N�o possui um terreno");

		default:
			return null;
		}
	}

	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<EnumMonstros> osenums = new ArrayList<EnumMonstros>();
		osenums.add(EnumMonstros.Dijnn);
		osenums.add(EnumMonstros.Gargulas);
		osenums.add(EnumMonstros.Golem);
		EnumMonstros classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
