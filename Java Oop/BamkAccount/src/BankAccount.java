
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
		
		
	}
	public String withdraw(double withdraww){
		System.out.print("++++++++++++++++++++");
		if (withdraww>savingsbalance){
			String error="you dont have";
			System.out.print("++++++++_______________+++++++");
			return error;
		}
		else{
		savingsbalance-=withdraww;
		return "you operation good";
		}
		
	}
	public void totalMoney(){
		double x=savingsbalance+checkingbalance;
		System.out.println(x);
		
		
		
	}
	

	 }

