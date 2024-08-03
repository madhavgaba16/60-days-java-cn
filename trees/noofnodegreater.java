package trees;

public class noofnodegreater {
    public static int numNodeGreater(treeNode<Integer> root, int x) {
        if (root == null)
            return 0;
    
        int count = 0;
        
        // Check if current node's data is greater than x
        if (root.data > x) {
            count++;
        }
    
        // Recursively count nodes greater than x in children
        for (int i = 0; i < root.children.size(); i++) {
            count += numNodeGreater(root.children.get(i), x);
        }
    
        return count;
    }
    
    
}
