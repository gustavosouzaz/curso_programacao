import java.util.Date;

import entidades.Order;
import entities.enums.OrderStatus;

public class Ex_usando_Enum {

	public static void main(String[] args) {
		
		
		Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);
		
		System.out.println(order);

	}

}
