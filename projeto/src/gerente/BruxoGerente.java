package gerente;

import java.util.Scanner;
import equipamento.*;

import builder.*;
import guerreiro.Bruxo;

public class BruxoGerente {

	private BruxoInterface criador;
	private Scanner scan;
	
	
	public void BruxoInterface(BruxoInterface criador) {
		this.criador=criador;
	}
	
	public void escolhaPersonagem() {
		scan = new Scanner(System.in);
		System.out.println("Qual tipo de bruxo deseja criar"+
							"\n1 - Bruxo Estudante"+
							"\n2 - Bruxo em Forma��o"+
							"\n3 - Bruxo Alto N�vel");
		int tipo = scan.nextInt();
		switch(tipo) {
		case 1: 
			BruxoInterface(new BruxoEstudanteBuilder());
			getBruxoEstudante();
			break;
		case 2: 
			BruxoInterface(new BruxoEmFormacaoBuilder());
			getBruxoEmFormacao();
			break;
		case 3: 
			BruxoInterface(new BruxoAltoNivelBuilder());
			getBruxoAltoNivel();
			break;
		}
	}
	
	public void getBruxoEstudante() {
		scan = new Scanner(System.in);
		System.out.println("Informe o nome do bruxo(a): ");
		criador.SetNome(scan.next());
		System.out.println("Informe o sexo do bruxo(a)"+
				"\nM - Masculino"+
				"\nF - Feminino");
		criador.SetSexo(scan.next());
		criador.SetEquipamentoMaoDireita(new Espada(10, 5));
		criador.SetEquipamentoMaoEsquerda(new Escudo(0, 10));
		criador.SetEquipamentoColar(new Colar());
	}
	
	public void getBruxoEmFormacao() {
		scan = new Scanner(System.in);
		System.out.println("Informe o nome do bruxo(a): ");
		criador.SetNome(scan.next());
		System.out.println("Informe o sexo do bruxo(a)"+
				"\nM - Masculino"+
				"\nF - Feminino");
		criador.SetSexo(scan.next());
		criador.SetEquipamentoMaoDireita(new Espada(10, 5));
		criador.SetEquipamentoMaoEsquerda(new Espada(10, 5));
		criador.SetEquipamentoColar(new Colar());
	}
	
	public void getBruxoAltoNivel() {
		scan = new Scanner(System.in);
		System.out.println("Informe o nome do bruxo(a): ");
		criador.SetNome(scan.next());
		System.out.println("Informe o sexo do bruxo(a)"+
				"\nM - Masculino"+
				"\nF - Feminino");
		criador.SetSexo(scan.next());
		criador.SetEquipamentoMaoDireita(new Espada(10, 5));
		criador.SetEquipamentoColar(new Colar());
	}
	
	public Bruxo getBruxo() {
		return criador.getBruxo();
	}
}
