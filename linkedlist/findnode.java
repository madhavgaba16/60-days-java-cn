import org.w3c.dom.Node;

public class findnode {
    public static int findNode(Node<Integer> head, int n) {
        if (head == null) {
            return -1;
        }
        
        Node<Integer> temp = head;
        int i = 0;
        
        while (temp != null && temp.data != n) {
            temp = temp.next;
            i++;
        }
        
        if (temp != null) {
            return i;
        } else {
            return -1;
        }
    }
}
}
