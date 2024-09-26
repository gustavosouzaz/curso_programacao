package controller;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	

}
