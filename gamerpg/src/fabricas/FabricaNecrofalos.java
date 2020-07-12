package fabricas;

import java.util.ArrayList;
import java.util.Random;

import criatura.Criatura;
import necrofalos.*;

public class FabricaNecrofalos extends FabricaMae {
	protected static int nInstance = 0;

	public FabricaNecrofalos() {
		nInstance++;
	}

	public static int getNumberInstance() {
		return nInstance;
	}

	public Criatura getCriatura(EnumMonstros tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necrófago", 12, 7, 30, "Cemitério");
		case Necrosos:
			return new Necrosos("Necrosos / Necrófago", 12, 7, 25, "Cemitério");
		case Nevolosos:
			return new Nevolosos("Nevolosos / Necrófago", 12, 7, 40, "Cemitério");

		default:
			return null;
		}
	}

	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<EnumMonstros> osenums = new ArrayList<EnumMonstros>();
		osenums.add(EnumMonstros.Ghouls);
		osenums.add(EnumMonstros.Necrosos);
		osenums.add(EnumMonstros.Nevolosos);
		EnumMonstros classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
