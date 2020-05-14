package builder;

import equipamento.Colar;
import equipamento.Equipamento;
import equipamento.Escudo;
import equipamento.Espada;
import guerreiro.*;

public class BruxoEmFormacaoBuilder implements BruxoInterface {

	private String nome;
	private String sexo;
	private static Equipamento equipamentoMaoDireita;
	private static Equipamento equipamentoMaoEsquerda;
	private int ataqueTotal;
	private int defesaTotal;
	private Colar colar;
	
	public void SetNome(String nome) {
		this.nome=nome;
	}
	
	public void SetSexo(String sexo) {
		if(sexo.equalsIgnoreCase("m")) {
			this.sexo="Masculino";
		}
		if(sexo.equalsIgnoreCase("F")) {
			this.sexo="Feminino";
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
	
	
	public static int getAtaqueEquipamentoMaoDireita() {
		return equipamentoMaoDireita.getAtaque();
	}
	
	
	public static int getAtaqueEquipamentoMaoEsquerda() {
		return equipamentoMaoEsquerda.getAtaque();
	}
	
	public static int getDefesaEquipamentoMaoDireita() {
		return equipamentoMaoDireita.getDefesa();
	}
	
	
	public static int getDefesaEquipamentoMaoEsquerda() {
		return equipamentoMaoEsquerda.getDefesa();
	}
	
	public int ataqueTotal(int ataqueEquipamentoMaoDireita, int ataqueEquipamentoMaoEsquerda) {
		this.ataqueTotal = ataqueEquipamentoMaoDireita + ataqueEquipamentoMaoEsquerda;
		return ataqueTotal;
	}
	
	public int defesaTotal(int defesaEquipamentoMaoDireita, int defesaEquipamentoMaoEsquerda) {
		this.defesaTotal = defesaEquipamentoMaoDireita + defesaEquipamentoMaoEsquerda;
		return defesaTotal;
	}
	
	public Bruxo getBruxo() {
		return new BruxoEmFormacao(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda, ataqueTotal, defesaTotal, colar);
	}
}
