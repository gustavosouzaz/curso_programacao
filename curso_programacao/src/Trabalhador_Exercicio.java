import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Department;
import entidades.Worker;
import entities.enums.WorkerLevel;



public class Trabalhador_Exercicio {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("(DD/MM/YYYY)");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.print("Enter wworker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
	    Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary);
	    new Department(departmentName);
	    
	    System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			 System.out.print("Enter contract #" + i + "data:");
			 System.out.print("(DD/MM/YYYY)");
			 Date contractDate = sdf.parse(sc.next());
			 System.out.print("(DD/MM/YYYY)");
		}
		
      sc.close();
	}

}
