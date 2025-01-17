import java.util.ArrayList;
import java.util.List;

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
		list.removeIf(z -> z.charAt(0) == 'F');
		for(String z : list) {
			System.out.println(z);
	}

}
}
