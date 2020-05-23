package guerreiro;

import equipamento.Colar;
import equipamento.Equipamento;

public abstract class Bruxo {
	private String nome;
	private String sexo;
	private Equipamento equipamentoMaoDireita;
	private Equipamento equipamentoMaoEsquerda;
	private static int ataqueTotal;
	private static int defesaTotal;
	private static int energia;
	private Colar colar;


	public Bruxo(String nome, String sexo, Equipamento equipamentoMaoDireita, Equipamento equipamentoMaoEsquerda, int ataqueTotal, int defesaTotal, int energia, Colar colar){
		this.nome=nome;
		this.sexo=sexo;
		this.equipamentoMaoDireita=equipamentoMaoDireita;
		this.equipamentoMaoEsquerda=equipamentoMaoEsquerda;
		this.ataqueTotal=ataqueTotal;
		this.defesaTotal=defesaTotal;
		this.energia=energia;
		this.colar=colar;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static int getAtaqueTotal() {
		return ataqueTotal;
	}
	
	public static int getDefesaTotal() {
		return defesaTotal;
	}
	
	public String infoBruxo() {
		if(equipamentoMaoEsquerda==null) {
			return "Nome: " +nome+ 
					"\nSexo: " +sexo+
					"\nEquipamento Mão Direita: " +equipamentoMaoDireita.infoEquipamento()+
					"\nAtaque Total: "+ataqueTotal+
					"\nDefesa Total: "+defesaTotal+
					"\nEnergia: "+energia+
					"\nColar: "+colar;
		}else {
		return "Nome: " +nome+ 
				"\nSexo: " +sexo+
				"\nEquipamento Mão Direita: " +equipamentoMaoDireita.infoEquipamento()+
				"\nEquipamento Mão Esquerda: " +equipamentoMaoEsquerda.infoEquipamento()+
				"\nAtaque Total: "+ataqueTotal+
				"\nDefesa Total: "+defesaTotal+
				"\nEnergia: "+energia+
				"\nColar: "+colar;
			}
	}
}