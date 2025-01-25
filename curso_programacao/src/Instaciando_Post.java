import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comments;
import entidades.Post;

public class Instaciando_Post {

	public static void main(String[] args) throws ParseException {
	  
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comments c1 = new Comments("Have a nice trip!");
		Comments c2 = new Comments("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I m going to visit this wonderfuul country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
	}

}
