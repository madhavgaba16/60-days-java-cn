package stack;
class usingarr {
    private  int data[];
     private int top ;
      public usingarr(){
         data = new int[10];
         top = -1;
      }
       public usingarr(int capacity){
         data = new int [capacity];
         top = -1;
 
       }
       public boolean isEmpty(){
         return(top==-1);
       }
       public int size(){
         return top+1;
       }
       public int top(){
         return data[top];//need to throw exception if array is empty so we cann check  if size is 0 throw exception; 
       }
       public void  push(int element ){
            top++;
            data[top]= element;// here we need to throw exception if size if completely filled and no more element can be added;
       }
       public int pop(){
         int temp = data[top]; 
          top--;
          return temp;// also need to throw exception when if no element in present or siZe in zero ;
       }
 
    }
public class usearr {
    public static void main(String [] args){
        usingarr stack = new usingarr(10);
    for(int i =0 ;i<5;i++){
        stack.push(i);
    }
     System.out.println(stack.pop());    
    }
}
