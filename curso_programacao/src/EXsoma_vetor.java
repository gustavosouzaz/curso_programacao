import java.util.Scanner;

public class EXsoma_vetor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma,media;
		
		
		System.out.println("Quantos números você vai digitar?");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<0; i++) {
			System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		  for (int i=0; i<n; i++) {
		        soma = soma + vetor[i];
		    }
		
	}

}
