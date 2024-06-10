import java.util.ArrayList;
//Arraylist need to imported ;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(20);
        int data = list1.get(1);
        System.out.println(data);

           
    }
    
}
//what is a arraylist?
// va ArrayList is a part of the Java collections framework and it is a class of java.util package.
//  It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be
//   helpful in programs where lots of manipulation in the array is needed. This class is found in java.util package.
//    The main advantage of ArrayList in Java is, that if we declare an array then we need to mention the size, 
// but in ArrayList, it is not needed to mention the size of ArrayList. If you want to mention the size then you can do it.