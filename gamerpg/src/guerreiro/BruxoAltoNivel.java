package guerreiro;

import criatura.Criatura;
import equipamento.*;

public class BruxoAltoNivel extends Bruxo {

	public BruxoAltoNivel(String nome, String sexo, Equipamento equipamentoMaoDireita,
			Equipamento equipamentoMaoEsquerda, double ataqueTotal, double defesaTotal, double energia, Colar colar,
			Sinal sinal1, Sinal sinal2) {
		super(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda, ataqueTotal, defesaTotal, energia, colar,
				sinal1, sinal2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void usarColar() {
		energia = energia + colar.statusColar();

	}

	@Override
	public void usarSinal(Criatura criatura, Bruxo bruxo) {
		sinal1.statusSinal();
		System.out.println("Bruxo aplicou um ataque de: " + sinal2.statusSinal() + "\n");
		if (criatura.getBloqueioDoDano() < sinal2.statusSinal()) {
			criatura.getNovaEnergia(sinal2.statusSinal());
		} else {
			System.out.println("A criatura bloqueio todo o dano causado!!!\n");
		}

	}

}
