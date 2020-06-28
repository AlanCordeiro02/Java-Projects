package builder;

import equipamento.*;
import guerreiro.*;

public class BruxoEstudanteBuilder implements BruxoInterface {

	private String nome;
	private String sexo;
	private Equipamento equipamentoMaoDireita;
	private Equipamento equipamentoMaoEsquerda;
	private double ataqueTotal;
	private double defesaTotal;
	private double energia = 100;
	private Colar colar;
	private Sinal sinal1;
	private Sinal sinal2 = null;
	
	public void SetNome(String nome) {
		this.nome=nome;
	}
	
	public void SetSexo(String sexo) {
		if(sexo.equalsIgnoreCase("m")) {
			this.sexo="Masculino";
		}
		else if(sexo.equalsIgnoreCase("F")) {
			this.sexo="Feminino";
		}else
			this.sexo="Indefinido";
		
	}

	public void SetEquipamentoMaoDireita(Equipamento equipamentoMaoDireita) {
		this.equipamentoMaoDireita=equipamentoMaoDireita;
	}
	
	public void SetEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda) {
		this.equipamentoMaoEsquerda=equipamentoMaoEsquerda;
	}
	
	public void SetSinal1(Sinal sinal1) {
		this.sinal1=sinal1;
	}
	
	public void SetSinal2(Sinal sinal2) {
		this.sinal2=sinal2;
	}
	
	public void SetEquipamentoColar(Colar colar) {
		this.colar=colar;
	}
	
	
	
	public Bruxo getBruxo() {
		double somaAtk = equipamentoMaoDireita.getAtaque() + equipamentoMaoEsquerda.getAtaque(); 
		ataqueTotal = somaAtk + (somaAtk * colar.statusColar());
		defesaTotal = equipamentoMaoDireita.getDefesa() + equipamentoMaoEsquerda.getDefesa();
		return new BruxoEstudante(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda, ataqueTotal, defesaTotal,
				energia, colar, sinal1, sinal2);
	}
}
