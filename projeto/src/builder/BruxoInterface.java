package builder;

import equipamento.Equipamento;
import guerreiro.Bruxo;

public interface BruxoInterface {

	public void SetNome(String nome);
	public void SetSexo(String sexo);
	public void SetEquipamentoMaoDireita(Equipamento equipamentoMaoDireita);
	public void SetEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda);
	public Bruxo getBruxo();
}
