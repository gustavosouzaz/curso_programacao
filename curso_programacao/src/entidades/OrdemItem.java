package entidades;

public class OrdemItem {

	private Integer quantity;
	private Double price;
	
	
	public OrdemItem() {
		super();
	}


	public OrdemItem(Integer quantity, Double price) {
		super();
		this.quantity = quantity;
		this.price = price;
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
	
	
	
	
}
