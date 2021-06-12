public class strin {
  
    public static String trimAndConcat(String x,String y){
        x=x.trim();
        y=y.trim();
        String z=x.concat(y);
    return z;
    }
    public static Integer getIndexOrNull(String one , char two){
        int b = one.indexOf (two);
        if(b == -1)
        return null;
        else
       
        return  b ;
    }
    public static Integer getIndexOrNulll(String stringone, String subString1){
        int str=stringone.indexOf(subString1);
        if (str==-1)
        return null;
        else
        return str ;


    }
    public static String concatSubstring(String stringa,Integer int1,Integer int2,String stringb){
        String end=stringa.substring (int1,int2);
        String concatsub=end.concat(stringb);


        return concatsub ;




    }



    public static void main(String[] args) {
        String c=trimAndConcat("    Hello     ","     World    ");
        System.out.println(c);
        
        char letter = 'o';
        String word = "Hello";
        String subString1 = "wa";
        String notSubString = "wawawawa";
        
       
        System.out.println(getIndexOrNull("helllooo",letter));
        System.out.println (getIndexOrNulll("wadee", subString1));
        System.out.println(concatSubstring("wwadeeeeee", 1, 6, "awwad"));

    }





 
    
   }

 
