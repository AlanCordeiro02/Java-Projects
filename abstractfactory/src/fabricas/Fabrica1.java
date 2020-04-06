package fabricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import criature.Criatura;
import necrofalos.*;

public class Fabrica1 extends FabricaMae {

	public Criatura getCriatura(Osenums tipo){
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
		ArrayList<Osenums> osenums = new ArrayList<Osenums>();
		osenums.add(Osenums.Ghouls);
		osenums.add(Osenums.Necrosos);
		osenums.add(Osenums.Nevolosos);
		Osenums classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}
	
}
