package arquivo;

public class ArquivoJson {
	private int numeroDeCasas;
	private String token;
	private String cifrado;
	private String decifrado;
	private String resumoCripto;
	
	
	public int getNumeroDeCasas() {
		return numeroDeCasas;
	}
	public void setNumeroDeCasas(int numeroDeCasas) {
		this.numeroDeCasas = numeroDeCasas;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getCifrado() {
		return cifrado;
	}
	public void setCifrado(String cifrado) {
		this.cifrado = cifrado;
	}
	public String getDecifrado() {
		return decifrado;
	}
	public void setDecifrado(String decifrado) {
		this.decifrado = decifrado;
	}
	public String getResumoCripto() {
		return resumoCripto;
	}
	public void setResumoCripto(String resumoCripto) {
		this.resumoCripto = resumoCripto;
	}
	
	public String toString() {
		return "numero_casas: " +numeroDeCasas + ", token: " +token+ ", cifrado: " +cifrado+
				", decifrado: " +decifrado+ ", resumo_criptografado: " +resumoCripto;
	}
	


}
