package model;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private String endereco;
	private String telefone;
	
	//Constructor
	public Pessoa(String nome, int cpf, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	//Gets & Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public String toString(){
		return "Nome: "+nome+"CPF: "+cpf+"Endereco: "+endereco+"Telefone: "+telefone;
		
	}
}
