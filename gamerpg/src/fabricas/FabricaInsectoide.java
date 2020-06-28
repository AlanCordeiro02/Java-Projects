package fabricas;
import java.util.ArrayList;
import java.util.Random;

import criatura.Criatura;
import insectoide.*;

public class FabricaInsectoide extends FabricaMae{
	
	protected static int nInstance = 0;
	
	public FabricaInsectoide() {
		nInstance++;
	}
	
	public static int getNumberInstance() {
		return nInstance;
	}
	
	public Criatura getCriatura(EnumMonstros tipo) {
		switch(tipo) {
			case Kikimora:
				return new Kikimora ("Kikimora / Insectoide", 11, 8, 35, "P�ntano");
			case Harrise:
				return new Harrise ("Harrise / Insectoide", 11, 8, 40, "P�ntano");
			case Aracnos:
				return new Aracnos ("Aracnos / Insectoide", 11, 8, 30, "P�ntano");
		default:
			break;
		}
		
		return null;
	}
	
	

	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<EnumMonstros> osenums = new ArrayList<EnumMonstros>();
		osenums.add(EnumMonstros.Kikimora);
		osenums.add(EnumMonstros.Harrise);
		osenums.add(EnumMonstros.Aracnos);
		EnumMonstros classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
