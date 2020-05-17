package fabricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import criature.Criatura;
import necrofalos.*;

public class FabricaNecrofalos extends FabricaMae {

	public Criatura getCriatura(EnumMonstros tipo){
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necr�fago", 5, 7, 3, "Cemit�rio");
		case Necrosos:
			return new Necrosos("Necrosos / Necr�fago", 5, 7, 3, "Cemit�rio");
		case Nevolosos:
			return new Nevolosos("Nevolosos / Necr�fago", 5, 7, 3, "Cemit�rio");
		default:
			break;
		}
		
		return null;
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
