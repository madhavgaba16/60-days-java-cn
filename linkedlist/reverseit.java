public class reverseit {

        public static Node<Integer> reverse_I(Node<Integer> head) {
            if (head == null || head.next == null) {
                return head;
            }
    
            Node<Integer> prev = null;
            Node<Integer> current = head;
            Node<Integer> next = null;
    
            while (current != null) {
                next = current.next; // Store the next node
                current.next = prev; // Reverse the current node's pointer
    
                // Move pointers one position ahead
                prev = current;
                current = next;
            }
    
            // prev now points to the new head of the reversed list
            return prev;
        }
    }
}
