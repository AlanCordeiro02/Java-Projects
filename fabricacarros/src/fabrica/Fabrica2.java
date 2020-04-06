package fabrica;

import carros.*;

public class Fabrica2 {

	public static Carro get(String tipo) {
		switch(tipo) {
		case "Honda":
			return new Honda("Honda","HWR",2020,"Vermelho",
					 5900.0f );
		case "Renault":
			return new Renault("Renault","SanderoRS",2019,"branco",
					 598555.0f );
		}
		return null;
	}
	
}
