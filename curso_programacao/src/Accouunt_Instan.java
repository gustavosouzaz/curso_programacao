import entidades.BusinessAccount;

public class Accouunt_Instan {

	public static void main(String[] args) {

			BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

			System.out.println(account.getBalance());
		}

	}


