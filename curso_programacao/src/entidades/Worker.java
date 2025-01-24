package entidades;

import entities.enums.*;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	public Worker() {
		super();
	}

	public Worker(String name, WorkerLevel level, Double baseSalary) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	
	
	
}
