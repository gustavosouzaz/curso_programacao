package entidades;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	private String model;

	private List<Vehicle> vehicle = new ArrayList<>();
	
	
	public Vehicle() {
		super();
	}

	public Vehicle(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
}
