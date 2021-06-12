public class StringManipulatorTest {
    public static void main(String[] args) {


          // getIndexOrNull(String, char)
          char letter = 'o';
          Integer a = sM.getIndexOrNull("Coding", letter);
          Integer b = sM.getIndexOrNull("Hello World", letter);
          Integer c = sM.getIndexOrNull("Hi", letter);
          System.out.println(a); // 1
          System.out.println(b); // 4
          System.out.println(c); // null
    }
}