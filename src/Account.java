
public class Account {
	private String accountNumber;
	private double balance;
	private String custName;
	private String email;
	private String phone;
	
	public Account() {
		System.out.println("Empty Constructor called.");
	}
	
	public Account(String accountNumber, double balance, String custName, String email, String phone) {
		super();
		System.out.println("Account Constructor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.custName = custName;
		this.email = email;
		this.phone = phone;
	}
	
	

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of "+depositAmount+" has been made. Your new balance is "+this.balance+".");
		
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.balance-withdrawalAmount <0) {
			System.out.println("Only " +balance+" available. Withdrawal not processed.");
		}else {
			this.balance-=withdrawalAmount;
			System.out.println("Withdrawal of " +withdrawalAmount+" processed. Remaining balance = "+ balance);
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
