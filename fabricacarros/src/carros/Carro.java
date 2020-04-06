package carros;

public class Carro {
	private String fabricante;
	private String modelo;
	private int ano;
	private String cor;
	private float preco;
	
	public Carro(String fabricante, String modelo, int ano, String cor, float preco) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
		
	}
	public String getFabricante() {
		return fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	public String getCor() {
		return cor;
	}
	public float getPreco() {
		return preco;
	}
	
	public String informacaoDoCarro() {
		String aux = "Fabricante:" + fabricante
				+"\nModelo:" + modelo
				+"\nAno:" + ano
				+"\nCor:" + cor
				+"\nPreco:" + preco;
				return aux;
		}
	}
