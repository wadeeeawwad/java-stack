
import java.util.Random;
import java.util.Random;
public class BankAccount {
	private String accountnumber;
	
	private double checkingbalance;
	
	private  double savingsbalance;
	public double getSavingsbalance() {
		return savingsbalance;
	}
	private static  int numberofaccounts;
	public static  double totalamountofmoney;
	
	
	 public BankAccount( ) {
		 accountnumber=returnaccount();
		 checkingbalance = 0;
		 savingsbalance=0;
		 numberofaccounts++;
		 
	 }
	 private String returnaccount(){
		 Random r=new Random();
		 String number = "";
		 for(int i=0;i<10;i++){
			 
			 number +=Integer.toString(r.nextInt(10)); 
		 }
		 System.out.println(number);
		 return number;
		
		 
			
	 }
	public double getCheckingbalance() {
		return checkingbalance;
	}
	public void setCheckingbalance(double checkingbalance) {
		this.checkingbalance = checkingbalance;
	}
	public void add(double amount){
		savingsbalance+=amount;
		totalamountofmoney+=amount;
		
		
	}
	public void withdraw(double withdraw){
		savingsbalance-=withdraw;
		totalamountofmoney-=withdraw;
		
	}
	public void print(){
		
		System.out.println(totalamountofmoney);
		
		
		
	}
	

	 }

