import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class exceptions {

  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");
    for (int i = 0; i < myList.size(); i++) {
      try {
        
          Integer castedValue = (Integer) myList.get(i);
        } catch (ClassCastException e) {
        System.out.println(
          " the index of the ArrayList  occurred in " +
          myList.indexOf(i) +
          "and the value of the object that triggered the error." +
          myList.get(i));
      }
    }
  }
}
