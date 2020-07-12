package guerreiro;

import java.util.Random;

import criatura.Criatura;
import equipamento.*;

public abstract class Bruxo {
	private String nome;
	private String sexo;
	private Equipamento equipamentoMaoDireita;
	private Equipamento equipamentoMaoEsquerda;
	private static double ataqueTotal;
	private double defesaTotal;
	private double danoCausado;
	private double bloqueioBruxo;
	protected double energia;
	protected Colar colar;
	protected Sinal sinal1;
	protected Sinal sinal2;

	public Bruxo(String nome, String sexo, Equipamento equipamentoMaoDireita, Equipamento equipamentoMaoEsquerda,
			double ataqueTotal, double defesaTotal, double energia, Colar colar, Sinal sinal1, Sinal sinal2) {
		this.nome = nome;
		this.sexo = sexo;
		this.equipamentoMaoDireita = equipamentoMaoDireita;
		this.equipamentoMaoEsquerda = equipamentoMaoEsquerda;
		this.ataqueTotal = ataqueTotal;
		this.defesaTotal = defesaTotal;
		this.energia = energia;
		this.colar = colar;
		this.sinal1 = sinal1;
		this.sinal2 = sinal2;
	}

	private double getFator() {
		Random random = new Random();
		double fatorRandom = random.nextInt(10);
		while ((fatorRandom / 10) < 0.5) {
			fatorRandom = random.nextInt(10);
		}
		return fatorRandom / 10;
	}

	public double getDanoDoAtaque() {
		danoCausado = getAtaqueTotal() * getFator();
		return danoCausado;
	}

	public double getBloqueioDoDano() {
		bloqueioBruxo = getDefesaTotal() * getFator();
		return bloqueioBruxo;
	}

	public double getNovaEnergia(double dano) {
		energia -= dano;
		return energia;
	}

	public double bonusEnergia() {
		energia += 50;
		return energia;
	}

	public abstract void usarColar();

	public abstract void usarSinal(Criatura criatura, Bruxo bruxo);

	public String getNome() {
		return nome;
	}

	public static double getAtaqueTotal() {
		return ataqueTotal;
	}

	public double getDefesaTotal() {
		return defesaTotal;
	}

	public double getEnergia() {
		return energia;
	}

	public double getDanoCausado() {
		return danoCausado;
	}

	public double getBloqueioBruxo() {
		return bloqueioBruxo;
	}

	public String getSinal1() {
		return sinal1.infoSinal();
	}

	public String infoBruxo() {
		if (equipamentoMaoEsquerda == null) {
			return "Nome: " + nome + "\nSexo: " + sexo + "\nEquipamento Mão Direita: "
					+ equipamentoMaoDireita.infoEquipamento() + "\nAtaque Total: " + ataqueTotal + "\nDefesa Total: "
					+ defesaTotal + "\nEnergia: " + energia + "\nColar: " + colar.infoColar() + "\nPrimeiro Sinal: "
					+ sinal1.infoSinal() + "\nSegundo Sinal: " + sinal2.infoSinal();
		} else {
			return "Nome: " + nome + "\nSexo: " + sexo + "\nEquipamento Mão Direita: "
					+ equipamentoMaoDireita.infoEquipamento() + "\nEquipamento Mão Esquerda: "
					+ equipamentoMaoEsquerda.infoEquipamento() + "\nAtaque Total: " + ataqueTotal + "\nDefesa Total: "
					+ defesaTotal + "\nEnergia: " + energia + "\nColar: " + colar.infoColar() + "\nSinal: "
					+ sinal1.infoSinal();
		}
	}
}