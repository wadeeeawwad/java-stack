import java.util.Random;


public class main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.add(100.49);
		ba.add(3.00);
		ba.getCheckingbalance();

		System.out.println(BankAccount.totalamountofmoney);

		ba.withdraw(50);
		ba.withdraw(50);
		ba.getCheckingbalance();

		System.out.println(BankAccount.totalamountofmoney);
		
		
		
		
//		rand();

	}
//	public static void rand(){
//		 Random r=new Random();
//		 
//		 for(int i=0;i<10;i++){
//			 
//			 System.out.println(r.nextInt(9));
//			 
//		 }
		 
	}

	 

//}

