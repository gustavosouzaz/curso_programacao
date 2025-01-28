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
		
		for(int i=0; i<N; i++) {
			System.out.println("Employee #" + N + " data: ");
			System.out.print("Outsourced (y/n)?  ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
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
		
		
	}

}
