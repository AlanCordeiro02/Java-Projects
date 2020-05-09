package input;

import java.util.Scanner;

public class MP4Player implements Dispositivo {
	private Scanner entrada;
	public MP4Player() {
		entrada = new Scanner(System.in);
	}
	@Override
	public String lerEntrada() {
		// TODO Auto-generated method stub
		return entrada.next();
	}
	

}
