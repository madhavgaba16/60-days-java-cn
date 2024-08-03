
    package binarytrees;

import java.util.Scanner;

public class binarynodeuse {
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

    

