package fabricas;
import java.util.ArrayList;
import java.util.Random;

import criature.Criatura;
import insectoide.*;

public class FabricaInsectoide extends FabricaMae{
	
	public Criatura getCriatura(EnumMonstros tipo) {
		switch(tipo) {
			case Kikimora:
				return new Kikimora ("Kikimora / Insectoide", 7, 8, 3, "P�ntano");
			case Harrise:
				return new Harrise ("Harrise / Insectoide", 7, 8, 3, "P�ntano");
			case Aracnos:
				return new Aracnos ("Aracnos / Insectoide", 7, 8, 3, "P�ntano");
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
