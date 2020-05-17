package fabricas;

import criature.Criatura;

public abstract class FabricaMae {

	public static FabricaMae getAleatoryfactory(EnumFabricas tipo) {
		switch(tipo) {
		case Construtor:
			return new FabricaNecrofalos();
		case Insectoide:
			return new FabricaConstrutor();
		case Necrofalos:
			return new FabricaRelictio();
		case Relictio:
			return new FabricaInsectoide();
		
		
		}
		return null;
		
	}

public abstract Criatura getCriatura(EnumMonstros tipo);

public abstract Criatura getRandomCriature();
}	
