public class FizzBuzz {
    public static String functionname(int number) {
        
        // fizzbuzz logic here
        String result=number +"";
        if (number%3==0 && number%5==0){
       result="FizzBuzz";
        }
        else if (number%3==0){
           result="Fizz";


        }
        else if (number%5==0){
            result="Puzz";
        }
        else result=  number +" ";
      
        return result;

    }
     public static void main(String[] args) {
        System.out.println(functionname(17));
    }
}