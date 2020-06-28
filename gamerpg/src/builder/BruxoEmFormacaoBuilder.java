package builder;

import equipamento.*;
import guerreiro.*;

public class BruxoEmFormacaoBuilder implements BruxoInterface {

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
		this.nome = nome;
	}

	public void SetSexo(String sexo) {
		if (sexo.equalsIgnoreCase("m")) {
			this.sexo = "Masculino";
		} else if (sexo.equalsIgnoreCase("F")) {
			this.sexo = "Feminino";
		} else
			this.sexo = "Indefinido";

	}

	public void SetEquipamentoMaoDireita(Equipamento equipamentoMaoDireita) {
		this.equipamentoMaoDireita = equipamentoMaoDireita;
	}

	public void SetEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda) {
		this.equipamentoMaoEsquerda = equipamentoMaoEsquerda;
	}

	public void SetSinal1(Sinal sinal1) {
		this.sinal1 = sinal1;
	}

	public void SetSinal2(Sinal sinal2) {
		this.sinal2 = sinal2;
	}

	public void SetEquipamentoColar(Colar colar) {
		this.colar = colar;
	}

	public Bruxo getBruxo() {
		double somaDef = equipamentoMaoDireita.getDefesa() + equipamentoMaoEsquerda.getDefesa();
		defesaTotal = somaDef + (somaDef * colar.statusColar());
		ataqueTotal = equipamentoMaoDireita.getAtaque() + equipamentoMaoEsquerda.getAtaque();
		return new BruxoEmFormacao(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda, ataqueTotal, defesaTotal,
				energia, colar, sinal1, sinal2);
	}
}
