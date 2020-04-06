package fabrica;
import carros.*;
public class Fabrica1 {

	public static Honda getHonda() {
		return new Honda("Honda","HWR",2020,"Vermelho",
				 5900.0f );
	}
	public static Renault getRenault() {
		return new Renault("Renault","SanderoRS",2019,"branco",
				 598555.0f );
	}
}
