import java.util.Scanner;

public class Exercicio1Negativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números você vai digitar?");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for ( int i=0; i<n; i++) {
			
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		
		System.out.println("Números Negativos:");
		
        for ( int i=0; i<n; i++) {
			
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
        sc.close();

	}

}
