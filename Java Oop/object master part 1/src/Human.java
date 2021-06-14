
public class Human {
private int strength=3;
private int stealth=3;
private int intelligence =3;
private int health  =100;
private int result;
private int num;
public Human(){}
public void attack(){
	int result=100-num;
	System.out.print(result);
	
}
public int getResult() {
	return result;
}
public void setNum(int num) {
	this.num = num;
}


}
