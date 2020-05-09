package video;

public class Tela {
	private String display;
	private boolean on;
	private String resolucao;
	private int contraste;
	private int brilho;


	public Tela (String resolucao) {
		this.on=false;
		this.resolucao=resolucao;
		this.contraste=50;
		this.brilho=50;
	}
	
	
	public String getDisplay(){
		return display;
	}
	
	public void setDisplay(String display) {
		this.display=display;
	}
	
	public boolean isOn() {
		return on;
		
	}
	
	public void ligar() {
		this.on=true;
	}
	
	public void desligar() {
		this.on=false;
	}

	public String getResolucao() {
		return resolucao;
		
	}
	
	public void setResolucao(String resolucao) {
		this.resolucao=resolucao;
	}
	
	public int getContraste() {
		return contraste;
	}
	
	public void alteraContraste(String value) {
	
		int aux = Integer.parseInt(value);
		this.contraste+=aux;
	}
	
	
	public int getBrilho() {
		return brilho;
	}
	
	public void alteraBrilho(String brilho) {
	
		int aux = Integer.parseInt(brilho);
		this.brilho+=aux;
	}


}

