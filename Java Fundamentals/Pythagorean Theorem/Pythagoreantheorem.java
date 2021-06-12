
import java.lang.Math;

public class Pythagoreantheorem {

  public static double sqrtfind(int legA, int legB) {
      // calling the sqrt static method of the Math class
    return Math.sqrt(legA*legA + legB*legB);
  }

  public static void main(String[] args) {
    int a,b ;
    a=3;
    b=5;
 
    double c = sqrtfind(a, b);
    System.out.println("The Hypotenuse of a triangle with the sides " + a + " and " + b + " is: " + String.format("%.2f", c));
  }
}