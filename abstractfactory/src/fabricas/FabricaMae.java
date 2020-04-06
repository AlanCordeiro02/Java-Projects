package fabricas;

import criature.Criatura;

public abstract class FabricaMae {

	public static FabricaMae getAleatoryfactory(Osenums2 tipo) {
		switch(tipo) {
		case Construtor:
			return new Fabrica1();
		case Insectoide:
			return new Fabrica2();
		case Necrofalos:
			return new Fabrica3();
		case Relictio:
			return new Fabrica4();
		
		
		}
		return null;
		
	}

public abstract Criatura getCriatura(Osenums tipo);

public abstract Criatura getRandomCriature();
}	
