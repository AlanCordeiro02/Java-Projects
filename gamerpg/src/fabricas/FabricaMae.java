package fabricas;

import criatura.Criatura;

public abstract class FabricaMae {
	protected static int nInstance = 0;
	
	public FabricaMae() {
		nInstance++;
	}
	
	public static int getNumberInstance() {
		return nInstance;
	}
	
	
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
