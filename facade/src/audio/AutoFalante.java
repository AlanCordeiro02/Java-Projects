package audio;

public class AutoFalante {
	private int potencia;
	private boolean on = false;
	private int volume = 10;
	
	public AutoFalante() {
		this.on = false;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isOn() {
		return on;
	}
	public void ligar() {
		this.on = true;
	}
	public void desligar() {
		this.on = false;
	}
	public int getVolume() {
		return volume;
	} 
	public void alterarVolume( String volume) { 
	int aux = Integer.parseInt(volume);
	this.volume += aux;
}

}
