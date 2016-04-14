package model;

public class Items {

	private String categoria;
	private int quantidade;
	private double precoUnitario;
	private String fabricante;
	private String fornecedor;
	
	////Constructor
	public Items(String categoria, int quantidade, double precoUnitario, String fabricante, String fornecedor) {
		super();
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.fabricante = fabricante;
		this.fornecedor = fornecedor;
	}

	//Gets & Sets
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
}
