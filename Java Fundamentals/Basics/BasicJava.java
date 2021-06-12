import java.util.*;

public class BasicJava {

  // Print 1-25
  public static void allnum(int num) {
    for (int i = 1; i < num + 1; i++) {
      System.out.println(i);
    }
  }

  //   Print odd numbers between 1-25
  public static void oddnum(int num) {
    for (int i = 1; i < num + 1; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }

  //   Print Sum
  public static void summ(int num) {
    int sum = 0;
    for (int i = 1; i < num + 1; i++) {
      sum += i;
      System.out.println("sum when i=" + i + "-->:" + sum);
    }
  }

  //   Iterating through an array
  public static void anarray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  //   Find Max
  public static void maxofarray(int[] arr) {
    int maxvaluee = arr[0];
    for (int i = 0; i < arr.length; i++) {
      int value = arr[i];
      if (value > maxvaluee) {
        maxvaluee = value;
      }
    }
    System.out.println(maxvaluee);
  }

  //   Get Average
  public static void avgarr(int[] arr3) {
      int sum=0;
      int avg=0;
    for (int i = 0; i < arr3.length; i++) {
        sum += arr3[i];}

        avg=sum/arr3.length;
      System.out.println(avg);
    
  }


  public static void main(String[] args) {
    allnum(25);
    System.out.println(
      " Next *****************************************************************"
    );
    oddnum(25);
    System.out.println(
      " Next *******************************************************************"
    );
    summ(10);
    System.out.println(
      " Next *******************************************************************"
    );
    int[] array = { 1, 3, 5, 7, 9, 13 };

    anarray(array);
    System.out.println(
      " Next *******************************************************************"
    );
    int[] arr = { 1, -3, -5, 25, -7, 9, 13 };
    maxofarray(arr);
    System.out.println(
      " Next *******************************************************************"
    );
    int[] arr3 = { 1, 2,3,4 };
    avgarr(arr3);

  }
}
