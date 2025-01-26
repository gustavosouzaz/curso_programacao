package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private Date moment;
	private StatusPedido status;
	
	private Cliente cliente;
	
	private List<OrdemItem> items = new ArrayList<OrdemItem>();
	
	public Pedido() {
		super();
	}

	public Pedido(Date moment, StatusPedido status, Cliente cliente) {
		super();
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
