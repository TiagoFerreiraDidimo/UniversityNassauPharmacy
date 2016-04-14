package model;

public class Funcionario extends Pessoa{
	private int matricula;
	private double salario;
	private double comissao;
	
	//Constructor
	public Funcionario(String nome, int cpf, String endereco, String telefone, double salario, double comissao) {
		super(nome, cpf, endereco, telefone);
		this.salario = salario;
		this.comissao = comissao;
	}


	//Gets & Sets
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao += comissao;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
