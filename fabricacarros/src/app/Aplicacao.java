package app;
import fabrica.*;
import carros.*;
public class Aplicacao {

	public static void main(String[] args) {
		Honda carro1 = Fabrica1.getHonda();
		System.out.println(carro1.informacaoDoCarro() + "\n");
	
		Carro carro2 = Fabrica2.get("Renault");
		System.out.println(carro2.informacaoDoCarro());
	}
	
}
