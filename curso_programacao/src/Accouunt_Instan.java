import entidades.Account;
import entidades.BusinessAccount;
import entidades.SavingsAccount;

public class Accouunt_Instan {

	public static void main(String[] args) {
		
            Account acc = new Account(1001,"Alex",0.0);
			BusinessAccount bacc = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

			// UPCASTING
			
			Account acc1 = bacc;
			Account acc2 = new BusinessAccount(1003,"Bob", 0.0, 200.0);
			Account acc3 = new SavingsAccount(1003,"Bob", 0.0, 200.0);
			
			//DOWNCASTING
			
			BusinessAccount acc4 = (BusinessAccount)acc2;
			acc4.loan(100.0);
			
			
			// BusinessAccount acc5 = (BusinessAccount)acc3;
			if (acc3 instanceof BusinessAccount) {
				BusinessAccount acc5 = (BusinessAccount)acc3;
				acc5.loan(200.0);
				System.out.println("Loan!");
			}
			
			if (acc3 instanceof SavingsAccount) {
				SavingsAccount acc5 = (SavingsAccount)acc3;
				acc5.updateBalance();
				System.out.println("Update!");
			}
			
			
		}

	}


