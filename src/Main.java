
public class Main {

	public static void main(String[] args) {
		Account andrewsAccount = new Account();
		andrewsAccount.withdrawal(100.0);
		
		andrewsAccount.deposit(50.0);
		andrewsAccount.withdrawal(100.0);
		
		andrewsAccount.deposit(1.0);

		VIPCustomer person1 = new VIPCustomer();
		System.out.println(person1.getName());
		
		VIPCustomer person2 = new VIPCustomer("Bob", 2500.00);
		System.out.println(person2.getName());
		
		VIPCustomer person3 = new VIPCustomer("Tim", 100.00, "tim@email.com");
		System.out.println(person3.getName());
	}

}
