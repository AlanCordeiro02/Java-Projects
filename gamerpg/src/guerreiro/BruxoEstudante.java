package guerreiro;

import criatura.Criatura;
import equipamento.*;

public class BruxoEstudante extends Bruxo {

	public BruxoEstudante(String nome, String sexo, Equipamento equipamentoMaoDireita,
			Equipamento equipamentoMaoEsquerda, double ataqueTotal, double defesaTotal, double energia, Colar colar,
			Sinal sinal1, Sinal sinal2) {
		super(nome, sexo, equipamentoMaoDireita, equipamentoMaoEsquerda, ataqueTotal, defesaTotal, energia, colar,
				sinal1, sinal2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void usarColar() {

	}

	@Override
	public void usarSinal(Criatura criatura, Bruxo bruxo) {
		System.out.println("Bruxo aplicou um ataque de: " + bruxo.getDanoDoAtaque() + "\n");
		if (sinal1.statusSinal() < bruxo.getDanoCausado()) {
			criatura.getNovaEnergia(bruxo.getDanoCausado());
		} else {
			System.out.println("A criatura bloqueio todo o dano causado!!!\n");
		}

	}
}
