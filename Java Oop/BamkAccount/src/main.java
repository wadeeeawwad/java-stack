import java.util.Random;

public class main {

  public static void main(String[] args) {
    BankAccount w = new BankAccount();
    w.add(100);
    w.totalMoney();
    System.out.print(w.withdraw(500000.0));
    w.totalMoney();
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
