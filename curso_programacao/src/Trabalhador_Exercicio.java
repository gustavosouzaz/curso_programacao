import java.util.Locale;
import java.util.Scanner;

import entidades.Department;
import entidades.Worker;
import entities.enums.WorkerLevel;



public class Trabalhador_Exercicio {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter wworker data: ");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
	    Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary);
	    new Department(departmentName);
	    
	    
		
		
      sc.close();
	}

}
