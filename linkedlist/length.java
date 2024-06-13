
package linkedlist;

public class length {
    
public class Solution {
    public static int length(Node head){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int counter=0;
        while(head!=null)
        {head=head.next;
        counter++;}
        
        return counter;
	}
    
}
    
}
