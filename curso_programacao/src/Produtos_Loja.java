import java.util.Locale;
import java.util.Scanner;

import entidades.OrdemItem;
import entidades.Produto;

public class Produtos_Loja {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto("TV", 1000.0);
		OrdemItem oi1 = new OrdemItem(1,1000.0, p);
		 
		System.out.println(oi1);
		
		sc.close();

	}

}
