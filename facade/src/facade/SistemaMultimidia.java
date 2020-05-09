package facade;

import java.util.Scanner;
import audio.AutoFalante;
import input.ConectorUSB;
import input.Joystic;
import input.MP4Player;
import input.Teclado;
import video.Tela;

public class SistemaMultimidia {

	private Tela telaPassageiro;
	private Tela telaBancoEsquerdo;
	private Tela telaBancoDireito;
	private AutoFalante autoFalanteFrente1;
	private AutoFalante autoFalanteFrente2;
	private AutoFalante autoFalanteTras1;
	private AutoFalante autoFalanteTras2;
	private ConectorUSB conectorTeclado;
	private ConectorUSB conectorMP4;
	private ConectorUSB conectorJoystic;
	
	public SistemaMultimidia() {
	telaPassageiro = new Tela("1024x768");
	telaBancoEsquerdo = new Tela("1024x768");
	telaBancoDireito = new Tela("1024x768");
	autoFalanteFrente1 = new AutoFalante();
	autoFalanteFrente2 = new AutoFalante();
	autoFalanteTras1 = new AutoFalante();
	autoFalanteTras2 = new AutoFalante();
	conectorTeclado = new ConectorUSB();
	conectorMP4 = new ConectorUSB();
	conectorJoystic = new ConectorUSB();
	}
	
	public void ligarTelaFrontal() {
		System.out.println("Tela Frontal");
		telaPassageiro.ligar();
		autoFalanteFrente1.ligar();
		autoFalanteFrente2.ligar();
		conectorTeclado.ligar();
	
	}
	
	public void configurarTelaFrontal(){
		conectorTeclado.conectaDispositivo(new Teclado());
		System.out.println("Brilho:");
		telaPassageiro.alteraBrilho(conectorTeclado.lerDados());
		System.out.println("Contraste:");
		telaPassageiro.alteraContraste(conectorTeclado.lerDados());
		System.out.println("Volumes AutoFalante:");
		autoFalanteFrente1.alterarVolume(conectorTeclado.lerDados());
		autoFalanteFrente2.alterarVolume(conectorTeclado.lerDados());
	}
	
	public void ligarTelaBancoEsquerdo() {
		System.out.println("Tela Banco Esquerdo");
		telaBancoEsquerdo.ligar();
		autoFalanteTras1.ligar();
		conectorMP4.ligar();
	
	}
	
	public void configurarTelaBancoEsquerdo() {
		conectorMP4.conectaDispositivo(new MP4Player());
		System.out.println("Brilho: ");
		telaBancoEsquerdo.alteraBrilho(conectorMP4.lerDados()); 
		System.out.println("Contraste: ");
		telaBancoEsquerdo.alteraContraste(conectorMP4.lerDados());
		System.out.println("Volume: ");
		autoFalanteTras1.alterarVolume(conectorMP4.lerDados());
	}
	
	public void ligarTelaBancoDireito() {
		System.out.println("Tela Banco Direito");
		telaBancoDireito.ligar();
		autoFalanteTras2.ligar();
		conectorJoystic.ligar();
	
	}	
	
	public void configurarTelaBancoDireito() {
		conectorJoystic.conectaDispositivo(new Joystic());
		System.out.println("Brilho:");
		telaBancoDireito.alteraBrilho(conectorJoystic.lerDados());
		System.out.println("Contraste:");
		telaBancoDireito.alteraContraste(conectorJoystic.lerDados());
		System.out.println("Volume:");
		autoFalanteTras2.alterarVolume(conectorJoystic.lerDados());
	}
	
	public void reproduzir() {
		conectarMP4();
		conectarJoystic();
	}
	private void conectarMP4() { 
		System.out.println("Fazendo Leitura de Musica");
	}
	
	private void conectarJoystic() { 
		System.out.println("Lendo Direção do Joystic");
	}
	
	public void desligar() {
	telaPassageiro.desligar();
	telaBancoEsquerdo.desligar();
	telaBancoDireito.desligar();
	autoFalanteFrente1.desligar();
	autoFalanteFrente2.desligar();
	autoFalanteTras1.desligar();
	autoFalanteTras2.desligar();
	conectorTeclado.desligar();
	conectorMP4.desligar();
	conectorJoystic.desligar();
	}
	
}
