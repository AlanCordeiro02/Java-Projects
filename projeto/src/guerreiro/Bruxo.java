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
				"\nEquipamento M�o Direita: " +equipamentoMaoDireita.infoEquipamento()+
				"\nEquipamento M�o Esquerda: " +equipamentoMaoEsquerda.infoEquipamento()+
				"\nAtaque Total: "+ataqueTotal+
				"\nColar: "+colar;
	}
}
