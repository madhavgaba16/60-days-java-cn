
public class midpoint {
    
       if (head == null||head.next == null )
            return head;
        
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        
        while (fast.next != null &&fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
}
