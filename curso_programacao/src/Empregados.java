import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Empregados {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    List<Empregados> empre = new ArrayList<>();
	    
	    System.out.println("Enter the number of employees: ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println("Employee #" + N + " data: ");
			System.out.println("Outsourced (y/n)?  ");
			String sn = sc.next();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Hours ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			int valuePerHour = sc.nextInt();
			
			if(sn == "y" ) {
				
			}

			
			
		}
		
		
	}

}
