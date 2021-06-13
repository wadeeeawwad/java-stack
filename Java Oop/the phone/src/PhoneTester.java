public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "verzion","RING ");
        IPhone iPhone10 = new IPhone("X", 100, "AT&At", "zing");
        System.out.print(s9.Ring());
        s9.displayInfo();
        iPhone10.displayInfo();
    }
}