import java.util.Scanner;

public class rapidinho {

	public static void main(String[] args) {

		double usuario;
		double raiz;
		
		Scanner sc = new Scanner(System.in);
		usuario = sc.nextDouble();
		
	   raiz = Math.sqrt(usuario);
	   double decimal = raiz - Math.floor(raiz);
	   
	   System.out.printf("A raiz quadrada (apenas a parte decimal) é: %.4f%n", decimal);	   
		
		
		
	}

}
