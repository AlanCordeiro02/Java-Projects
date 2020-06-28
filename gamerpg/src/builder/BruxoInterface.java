package builder;

import equipamento.*;
import guerreiro.Bruxo;

public interface BruxoInterface {

	public void SetNome(String nome);

	public void SetSexo(String sexo);

	public void SetEquipamentoMaoDireita(Equipamento equipamentoMaoDireita);

	public void SetEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda);

	public void SetSinal1(Sinal sinal1);

	public void SetSinal2(Sinal sinal2);

	public void SetEquipamentoColar(Colar colar);

	public Bruxo getBruxo();
}
