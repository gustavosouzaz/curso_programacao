import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;
import entidades.OutsourcedEmployee;

public class Empregados {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    List<Empregado> empre = new ArrayList<>();
	    
	    System.out.println("Enter the number of employees: ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)?  ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextInt();
			
			if(ch == 'y') {
				
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				empre.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));				
			}
			else {
				empre.add(new Empregado(name, hours, valuePerHour));
			}

			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Empregado emp : empre) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
		
	}

}
