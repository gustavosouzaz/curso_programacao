package entidades;

public class OrdemItem {

	private Integer quantity;
	private Double price;
	
	private Produto produto;
	
	public OrdemItem() {
		super();
	}


	public OrdemItem(Integer quantity, Double price, Produto produto) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.produto = produto;
	}

	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal( ) {
		return quantity * price;
	}

	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	@Override
	public String toString() {
		return getProduto().getName() +" $ "+ price + ", " + "Quantity: " + quantity + ", " + "Subtotal: " + subTotal();
	}

}
