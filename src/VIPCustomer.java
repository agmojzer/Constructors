
public class VIPCustomer {
	private String name;
	private double limit;
	private String email;
	
	
	
	

	public VIPCustomer() {
		this("Default name", 50000.00, "default@email.com");
		
	}


	public VIPCustomer(String name, double limit) {
		this(name, limit, "unknown@email.com");
		
	}


	public VIPCustomer(String name, double limit, String email) {
		super();
		this.name = name;
		this.limit = limit;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public double getLimit() {
		return limit;
	}
	public String getEmail() {
		return email;
	}
	
	

}
