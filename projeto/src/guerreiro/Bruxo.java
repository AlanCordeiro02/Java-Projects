package guerreiro;

import equipamento.Colar;
import equipamento.Equipamento;

public class Bruxo {
	private String nome;
	private String sexo;
	private Equipamento equipamentoMaoDireita;
	private Equipamento equipamentoMaoEsquerda;
	private int ataqueTotal;
	private Colar colar;


	public Bruxo(String nome, String sexo, Equipamento equipamentoMaoDireita, Equipamento equipamentoMaoEsquerda, int ataqueTotal, Colar colar){
		this.nome=nome;
		this.sexo=sexo;
		this.equipamentoMaoDireita=equipamentoMaoDireita;
		this.equipamentoMaoEsquerda=equipamentoMaoEsquerda;
		this.ataqueTotal=ataqueTotal;
		this.colar=colar;
	}
	
	public String infoBruxo() {
		return "Nome: " +nome+ 
				"\nSexo: " +sexo+
				"\nEquipamento Mão Direita: " +equipamentoMaoDireita.infoEquipamento()+
				"\nEquipamento Mão Esquerda: " +equipamentoMaoEsquerda.infoEquipamento()+
				"\nAtaque Total: "+ataqueTotal+
				"\nColar: "+colar;
	}
}
