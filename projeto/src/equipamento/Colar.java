package equipamento;
import guerreiro.Bruxo;

public class Colar{

	public double ColarRegeneracao() {
		return (Integer) null;
	
	}
	
	public double ColarProtecao() {
		return Bruxo.getDefesaTotal() * 0.15;
	
	}

	public double ColarPoder() {
		return Bruxo.getAtaqueTotal() * 0.1;
	
	}

}
