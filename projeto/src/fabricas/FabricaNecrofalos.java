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
			return new Ghouls("Ghouls / Necrófago", 5, 7, 3, "Cemitério");
		case Necrosos:
			return new Necrosos("Necrosos / Necrófago", 5, 7, 3, "Cemitério");
		case Nevolosos:
			return new Nevolosos("Nevolosos / Necrófago", 5, 7, 3, "Cemitério");
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
