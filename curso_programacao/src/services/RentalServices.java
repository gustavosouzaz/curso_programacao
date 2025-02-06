package services;

import entidades.CarRental;
import entidades.Invoice;

public class RentalServices {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	public RentalServices() {
		super();
	}

	public RentalServices(Double pricePerHour, Double pricePerDay) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public void processInvoice(CarRental carRental) {
		
		carRental.setInvoice(new Invoice(50.0, 10.0));
		
	}

}
