import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_List {

	public static void main(String[] args) {
	
		
		List<String> list = new ArrayList<>();
		
		list.add("Gustavo");
		list.add("Fernando");
		list.add("Pedro");
		list.add("Fabio");
		list.add(2, "Enzo");
		
		System.out.println(list.size());
		for(String z : list) {
			System.out.println(z);
		}
		System.out.println("------------------------------");
		list.removeIf(z -> z.charAt(0) == 'G');
		for(String z : list) {
			System.out.println(z);
	}
		System.out.println("------------------------------");
		System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
		System.out.println("Index of Enzo: " + list.indexOf("Enzo"));
		System.out.println("------------------------------");
		List<String> resultado = list.stream().filter(z -> z.charAt(0) == 'F').collect(Collectors.toList());
		for(String z : resultado) {
			System.out.println(z);
	}

}
}
