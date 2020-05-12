package guerreiro;

import equipamento.Equipamento;

public class Bruxo {
	private String nome;
	private String sexo;
	private Equipamento equipamentoMaoDireita;
	private Equipamento equipamentoMaoEsquerda;


	public Bruxo(String nome, String sexo, Equipamento equipamentoMaoDireita, Equipamento equipamentoMaoEsquerda){
		this.nome=nome;
		this.sexo=sexo;
		this.equipamentoMaoDireita=equipamentoMaoDireita;
		this.equipamentoMaoEsquerda=equipamentoMaoEsquerda;
	}
	
	public String infoBruxo() {
		return "Nome: " +nome+ 
				"\nSexo: " +sexo+
				"\nEquipamento M�o Direita: " +equipamentoMaoDireita.infoEquipamento()+
				"\nEquipamento M�o Esquerda: " +equipamentoMaoEsquerda.infoEquipamento();
	}
}
