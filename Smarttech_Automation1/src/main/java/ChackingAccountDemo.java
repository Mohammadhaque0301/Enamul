
public class ChackingAccountDemo {
   
	 
	
	static String name;
	 int deposit;
	 int withdraw;
	 int balance;

	 public void openAccount() {
	
		String name = " MOhammad Haque ";
	     int id = 45654;
	     int account = 345678;
	    String address = " 2370 29th st apt 12";
	    String customer = name + "\n customer id: " + id + "\n customer account: " +  account 
	    		+ "\n customer address: " + address;
	    System.out.println(" customer information " + customer);
	    
	    
}
	public static void main(String[] args) {
		
		ChackingAccountDemo obj = new ChackingAccountDemo();
		obj.openAccount();
	}
	
	
	
}
