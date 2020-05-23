package builder;

import equipamento.Colar;
import equipamento.Equipamento;
import equipamento.Escudo;
import equipamento.Espada;
import guerreiro.*;

public class BruxoAltoNivelBuilder implements BruxoInterface {

	private String nome;
	private String sexo;
	private static Equipamento equipamentoMaoDireita;
	private static Equipamento equipamentoMaoEsquerda = null;
	private int ataqueTotal;
	private int defesaTotal;
	private int energia = 100;
	private Colar colar;
	
	public void SetNome(String nome) {
		this.nome=nome;
	}
	
	public void SetSexo(String sexo) {
			if(sexo.equalsIgnoreCase("m")) {
				this.sexo="Masculino";
			}
			else if(sexo.equalsIgnoreCase("F")) {
				this.sexo="Feminino";
			}else {
				this.sexo="Indefinido";
			}
		
	}

	public void SetEquipamentoMaoDireita(Equipamento equipamentoMaoDireita) {
		this.equipamentoMaoDireita=equipamentoMaoDireita;
	}
	
	public void SetEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda) {
		this.equipamentoMaoEsquerda=equipamentoMaoEsquerda;
	}
	
	public void SetEquipamentoColar(Colar colar) {
		this.colar=colar;
	}
	
	
	public Bruxo getBruxo() {
		ataqueTotal = equipamentoMaoDireita.getAtaque();
		defesaTotal = equipamentoMaoDireita.getDefesa();
		return new BruxoAltoNivel(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda, ataqueTotal, defesaTotal, energia, colar);
	}
}
