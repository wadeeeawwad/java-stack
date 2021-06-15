
public class Human {
	private int strength=3;
	private int stealth=3;
	private int intelligence =3;
	private int health=100;
	// private int result;
	// private int num;
public Human(){

}

// public int getResult() {
// 	return result;
// }
public void setstrength(int num) {
	this.strength = num;
}

public void setstealth(int num) {
	this.strength = num;
}
public void setintelligence(int num) {
	this.strength = num;
}
public void sethealth(int num) {
	this.health = num;
	System.out.println(health);
}
public int getHealth(){
	return this.health;
}

public void attack(Human wadee){
	System.out.println("Wadee health before attacking"+ wadee.getHealth());
	System.out.println("A straength is equal"+ this.getstrength());
	wadee.sethealth(wadee.getHealth()-this.strength);
	System.out.println("Wadee health after attacking"+ wadee.getHealth());
	

	System.out.println(wadee.getHealth());
	
}
public int getstrength() {
	return this.strength;
}

}
