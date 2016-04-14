package model;

import java.util.LinkedList;

public class Pedidos {
	
	private LinkedList<Items> items = new LinkedList<>();
	private int cliente;
	private int funcionario;
	private int codPedido;
	
	//Constructor
	public Pedidos(LinkedList<Items> items, int codPedido, Cliente cliente, Funcionario funcionario) {
		super();
		this.codPedido = codPedido;
		this.items = items;
		this.cliente = cliente.getCpf();
		this.funcionario = funcionario.getMatricula();
	}

	//Gets & Sets
	public int getCodPedido() {
		return codPedido;
	}


	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}


	public LinkedList<Items> getItems() {
		return items;
	}

	public void setItems(LinkedList<Items> items) {
		this.items.addAll(items);
	}
	
	


}
