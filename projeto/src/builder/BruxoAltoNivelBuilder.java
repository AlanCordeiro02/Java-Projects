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
	private static Equipamento equipamentoMaoEsquerda;
	private int ataqueTotal;
	private Colar colar;
	
	public void SetNome(String nome) {
		this.nome=nome;
	}
	
	public void SetSexo(String sexo) {
		this.sexo=sexo;
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
	
	public int SetAtaque(int ataqueEquipamentoMaoDireita, int ataqueEquipamentoMaoEsquerda) {
		this.ataqueTotal = ataqueEquipamentoMaoDireita + ataqueEquipamentoMaoEsquerda;
		return ataqueTotal;
	}
	
	public Bruxo getBruxo() {
		return new BruxoAltoNivel(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda, ataqueTotal, colar);
	}
}
