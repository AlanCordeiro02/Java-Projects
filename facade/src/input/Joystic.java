package input;

import java.util.Scanner;

public class Joystic implements Dispositivo{

	private Scanner entrada;
	public Joystic() {
		entrada = new Scanner(System.in);
	}
	@Override
	public String lerEntrada() {
		// TODO Auto-generated method stub
		return entrada.next();
	}
	
}
