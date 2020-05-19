package guerreiro;

import equipamento.Colar;
import equipamento.Equipamento;

public abstract class Bruxo {
	private String nome;
	private String sexo;
	private Equipamento equipamentoMaoDireita;
	private Equipamento equipamentoMaoEsquerda;
	private int ataqueTotal;
	private int defesaTotal;
	private Colar colar;


	public Bruxo(String nome, String sexo, Equipamento equipamentoMaoDireita, Equipamento equipamentoMaoEsquerda, int ataqueTotal, int defesaTotal, Colar colar){
		this.nome=nome;
		this.sexo=sexo;
		this.equipamentoMaoDireita=equipamentoMaoDireita;
		this.equipamentoMaoEsquerda=equipamentoMaoEsquerda;
		this.ataqueTotal=ataqueTotal;
		this.defesaTotal=defesaTotal;
		this.colar=colar;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String infoBruxo() {
		if(equipamentoMaoEsquerda==null) {
			return "Nome: " +nome+ 
					"\nSexo: " +sexo+
					"\nEquipamento Mão Direita: " +equipamentoMaoDireita.infoEquipamento()+
					"\nAtaque Total: "+ataqueTotal+
					"\nDefesa Total: "+defesaTotal+
					"\nColar: "+colar;
		}else {
		return "Nome: " +nome+ 
				"\nSexo: " +sexo+
				"\nEquipamento Mão Direita: " +equipamentoMaoDireita.infoEquipamento()+
				"\nEquipamento Mão Esquerda: " +equipamentoMaoEsquerda.infoEquipamento()+
				"\nAtaque Total: "+ataqueTotal+
				"\nDefesa Total: "+defesaTotal+
				"\nColar: "+colar;
			}
	}
}