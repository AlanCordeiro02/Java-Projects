package gerente;

import java.util.Scanner;
import equipamento.*;

import builder.BruxoBuilder;
import builder.BruxoInterface;
import guerreiro.Bruxo;

public class BruxoGerente {

	private BruxoInterface criador;
	private Scanner scan;
	
	
	public void BruxoInterface(BruxoInterface criador) {
		this.criador=criador;
	}
	
	public void getBruxoEstudante() {
		scan = new Scanner(System.in);
		System.out.println("Informe o nome do bruxo: ");
		criador.SetNome(scan.next());
		System.out.println("Informe o Sexo do bruxo: ");
		criador.SetSexo(scan.next());
		criador.SetEquipamentoMaoDireita(new Espada(10, 5));
		criador.SetEquipamentoMaoEsquerda(new Escudo(0, 10));
		criador.SetAtaque(BruxoBuilder.getAtaqueEquipamentoMaoDireita(), BruxoBuilder.getAtaqueEquipamentoMaoEsquerda());
		criador.SetEquipamentoColar(new Colar());
	}
	
	public void getBruxoEmFormacao() {
		scan = new Scanner(System.in);
		System.out.println("Informe o nome do bruxo: ");
		criador.SetNome(scan.next());
		System.out.println("Informe o Sexo do bruxo: ");
		criador.SetSexo(scan.next());
		criador.SetEquipamentoMaoDireita(new Espada(10, 5));
		criador.SetEquipamentoMaoEsquerda(new Espada(10, 5));
		criador.SetAtaque(BruxoBuilder.getAtaqueEquipamentoMaoDireita(), BruxoBuilder.getAtaqueEquipamentoMaoEsquerda());
		criador.SetEquipamentoColar(new Colar());
	}
	
	public void getAltoBruxo() {
		scan = new Scanner(System.in);
		System.out.println("Informe o nome do bruxo: ");
		criador.SetNome(scan.next());
		System.out.println("Informe o Sexo do bruxo: ");
		criador.SetSexo(scan.next());
		criador.SetEquipamentoMaoDireita(new Espada(10, 5));
		criador.SetEquipamentoMaoEsquerda(new Espada(0, 0));
		criador.SetAtaque(BruxoBuilder.getAtaqueEquipamentoMaoDireita(), BruxoBuilder.getAtaqueEquipamentoMaoEsquerda());
		criador.SetEquipamentoColar(new Colar());
	}
	
	public Bruxo getBruxo() {
		return criador.getBruxo();
	}
}
