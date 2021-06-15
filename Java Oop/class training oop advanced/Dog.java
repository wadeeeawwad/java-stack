public class Dog extends Animal{
   
    public String Type ="mammal";
    public Dog(){
    super("animal");
        System.out.print("i am adog");
        
        
    }
    public Dog(String Type){
        this.Type=Type;
        System.out.println("i am adog");
      
        
    }
    public void display(){
        System.out.println("here is a Dog class");
    }
    public void printmessage(){
        this.display();
        super.display();

    }
    public void printType(){
        this.Type();
        super.Type();

    }
    public void Type(){
        System.out.println("Mammal");
    }


}