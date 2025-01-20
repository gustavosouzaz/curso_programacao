import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;

public class Ex_List_trabalho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();
		
	     for(int i=0; i<N; i++) {
	    		System.out.println("Emplyoee #" + (i + 1) + ":");
	    		System.out.print("Id: ");
	    		Integer id = sc.nextInt();
	    		System.out.print("Name: ");
	    		sc.nextLine();	     
	    		String name = sc.nextLine();
	    		System.out.println("Salary: ");
	    		Double salary = sc.nextDouble();
	    		
	    		Employee emp = new Employee(id, name, salary);
	    		
	    		list.add(emp);	    		
	     }
	     
	     System.out.println("Enter the employee id that will have salary increase : ");
	     
	     
		
	}

}
