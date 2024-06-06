package homework_java;

public class BankAccount {
	
	private String name;
	private double balance;
	
	public BankAccount(String custname, double custbalance) {//parameterized constructor
	 name = custname;
	 balance= custbalance;
	}
	 public String getName() {
	 return name;
	 }
	 public void setName(String name) {
		this.name = name;
	 }
	 public double getBalance() {
		 return balance;
	 }
	 public void setBalance(double balance) {
		 this.balance=balance;
	 }
	 public void deposit(double amount) {
		 balance = balance + amount;
	 }
	 public void withdraw(double amount) {
		 balance= balance - amount;
	 }
	public String toString () {
		return name + " has $ " + balance + " left in the account. ";
	}
	
		
    
	public static void main(String[] args) {
             BankAccount ba1 = new BankAccount("Bob", 100.25);
             System.out.println(ba1);
             ba1.deposit(25.30);
		     System.out.println(ba1);
	
		/*Write a class called BankAccount
		BankAccount has attributes: String name and double balance 
		BankAccount has methods: 
		String getName()
		void setName()
		double getBalance()
		void setBalance()
		void deposit()
		void withdraw() 
		String toString() */
	
		
	
		
		
		
		
		
	}

}
