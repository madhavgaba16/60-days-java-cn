
    package binarytrees;
    import java.util.LinkedList;
import java.util.Queue;

import java.util.Scanner;


public class binarynodeuse {
    public static binarynode<Integer> takeinputlevelwise(){
        Scanner e = new Scanner(System.in);
      Queue<binarynode<Integer>> pendingnodes = new LinkedList<>();
      int rootdata = e.nextInt();
      if(rootdata==-1){
           return null;
      }
      binarynode<Integer> root = new binarynode<Integer>(rootdata);
     
    

      
      pendingnodes.add(root);
      while(!pendingnodes.isEmpty()){
         
         binarynode<Integer> frontdata1= pendingnodes.remove();
         System.out.println("Enter the left child of "+frontdata1.data );
         int leftchild = e.nextInt();
         binarynode<Integer> leftchild1= new binarynode<Integer>(leftchild);
         if(leftchild!=-1){
            root.left= leftchild1;
        }
         
        
      }

       return root;
        
    }
    public static void print(binarynode<Integer> root){
        if(root==null ){
            return ;
        }
        String tobeprinted= root.data +" ";
        if(root.left!= null){
            tobeprinted = tobeprinted+"L:"+ root.left.data;

        }
        if(root.right!= null){
            tobeprinted = tobeprinted+"r:"+ root.right.data;

        }
        System.out.println(tobeprinted);
        print(root.left);
        print(root.right);


        



    }
    public static  binarynode<Integer> takeInput (Scanner s) {
         int rootdata;
         System.out.println("enter root data");
         rootdata= s.nextInt();
         if(rootdata==-1){
            return null 
;

         }
         binarynode<Integer> root = new binarynode<Integer>(rootdata);
         root.left =takeInput(s);
         root.right= takeInput(s);
         return root;

 
    }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      binarynode<Integer> root = takeInput(s);
      print(root);
     }
    
}

    

