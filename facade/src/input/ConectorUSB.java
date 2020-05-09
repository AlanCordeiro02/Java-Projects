package input;

public class ConectorUSB {
	private boolean on = false;
	private Dispositivo dispositivo;

	public ConectorUSB() {
		this.on = false;
	}

	public void conectaDispositivo(Dispositivo dispositivo) {
		//conecta o dispositivo a entrada do sistema
		this.dispositivo = dispositivo;
	}

	public String lerDados() {
		//simulação de uma coleta de dados do dispositivo

		if(dispositivo==null) {
			return "Nenhum dispositivo conectado";
		}
		return dispositivo.lerEntrada();
		}

	public void ligar() {
		this.on = true;
	}

	public void desligar() {
		this.on = false;
	}
}