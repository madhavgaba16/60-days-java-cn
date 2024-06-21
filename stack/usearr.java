package stack;

public class usearr {
    public static void main(String [] args){
        usingarr stack = new usingarr(10);
    for(int i =0 ;i<5;i++){
        stack.push(i);
    }
     System.out.println(stack.pop());    
    }
}
