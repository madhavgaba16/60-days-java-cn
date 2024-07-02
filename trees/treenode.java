package trees;


import java.util.ArrayList;
import java.util.Scanner;

public class TreeNode<T> {
    int data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }

    // Method to recursively take input and construct a tree
    public static TreeNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of the node: ");
        int n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);

        System.out.println("Enter the number of children: ");
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput(); // Recursive call to create child nodes
            root.children.add(child);
        }

        return root;
    }

    // Method to print the tree in a readable format (preorder traversal)
    public static void print(TreeNode<Integer> root) {
        if (root == null)
            return;

        System.out.print(root.data + " -> ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();

        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        print(root);
    }
}


//taking input recursively 

