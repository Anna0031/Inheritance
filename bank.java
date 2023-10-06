class Customer{
	String name;
	String address;
	int phoneno;
	
	Customer(String name,String address,int phoneno){
		super();
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
	}
}
class Account{
	int accno;
	double bal;
	
	Account(int accno,double bal){
		super();
		this.accno = accno;
		this.bal = bal;
	}	
}
class RBI{
	Customer customer;
	Account account;
	
	RBI(Customer customer,Account account){
		super();
		this.customer = customer;
		this.account = account;
	}
	public double getminintrate() {
		return 4.0;
	}
	public double getminibal() {
		return 1000.00;
	}
	public double getmaxwith() {
		return 10000.00;
	}	
}
class SBI extends RBI{
	SBI(Customer customer,Account account){
		super(customer,account);
	}
	public String display() {
		return("SBI \nCustomer: "+customer.name+"\nAddress: "+customer.address+"\nPhone no: "+customer.phoneno+"\nAccount no: "+account.accno+"\nBalance: "+account.bal+"\nMinimum Interest: "+getminintrate()+"\nMinimum balance: "+getminibal()+"\nMaximum withdrawal: "+getmaxwith());
	}
}
class ICICI extends RBI{
	ICICI(Customer customer,Account account){
		super(customer,account);
	}
	public String display() {
		return("ICICI \nCustomer: "+customer.name+"\nAddress: "+customer.address+"\nPhone no: "+customer.phoneno+"\nAccount no: "+account.accno+"\nBalance: "+account.bal+"\nMinimum Interest: "+getminintrate()+"\nMinimum balance: "+getminibal()+"\nMaximum withdrawal: "+getmaxwith());
	}
	
}
class PNB extends RBI{
	PNB(Customer customer,Account account){
		super(customer,account);
	}
	public String display() {
		return("PNB \nCustomer: "+customer.name+"\nAddress: "+customer.address+"\nPhone no: "+customer.phoneno+"\nAccount no: "+account.accno+"\nBalance: "+account.bal+"\nMinimum Interest: "+getminintrate()+"\nMinimum balance: "+getminibal()+"\nMaximum withdrawal: "+getmaxwith());
	}
}
public class bank {
	public static void main(String[] args) {
		Customer c = new Customer("Anagha","Vasai",10000);
		Account a = new Account(1620,10000);
		
		SBI SA = new SBI(c,a);
		ICICI IC = new ICICI(c,a);
		PNB P = new PNB(c,a);
		
		System.out.println(SA.display());
		System.out.println(IC.display());
		System.out.println(P.display());
	}
	

}
