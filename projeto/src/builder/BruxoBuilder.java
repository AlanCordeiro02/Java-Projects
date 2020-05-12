package builder;

import equipamento.Equipamento;
import equipamento.Escudo;
import equipamento.Espada;
import guerreiro.Bruxo;

public class BruxoBuilder implements BruxoInterface {

	private String nome;
	private String sexo;
	private Equipamento equipamentoMaoDireita;
	private Equipamento equipamentoMaoEsquerda;
	
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
	
	public Bruxo getBruxo() {
		return new Bruxo(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda);
	}
}
