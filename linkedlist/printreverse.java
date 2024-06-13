public class printreverse {
    if (root==null ){
			
        return ;
    }
    printReverse(root.next);
    System.out.print(root.data+" ");
    //dont change pointer just use recursion 
    
}
