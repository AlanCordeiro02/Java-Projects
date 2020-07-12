package fabricas;

import terreno.*;

public abstract class FabricaTerreno {

	public static Terreno getTerreno(EnumTerreno tipo) {
		switch (tipo) {
		case Pântano:
			return new Pantano();
		case Subterrâneo:
			return new Subterraneo();
		case Campo:
			return new Campo();
		case Floresta:
			return new Floresta();
		default:
			return null;
		}
	}
}
