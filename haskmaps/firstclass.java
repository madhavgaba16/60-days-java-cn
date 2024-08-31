 package haskmaps;
//  import java.util.Scanner;
 import java.util.HashMap;
 public class firstclass {
   public static void main(String[]args){
   HashMap<String,Integer> map = new HashMap<>();
        map.put("abc",1);
        map.put("def",1);
         if(map.containsKey("abc")){
            System.out.println("has abc ");
         }

   }
    
}

