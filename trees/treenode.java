package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }

    // Method to recursively take input and construct a tree
    public static TreeNode takeInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the value of the node: ");
            int value = scanner.nextInt();
            TreeNode node = new TreeNode(value);

            System.out.println("Enter the number of children: ");
            int childCount = scanner.nextInt();
            for (int i = 0; i < childCount; i++) {
                TreeNode child = takeInput(); // Recursive call to create child nodes
                node.children.add(child);
            }

            return node;
        } finally {
            // Closing scanner is not ideal here; consider managing it outside of the method
            // scanner.close();
        }
    }

    // Method to print the tree in a readable format (preorder traversal)
    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " -> ");
        if (root.children.isEmpty()) {
            System.out.print("No children");
        } else {
            for (int i = 0; i < root.children.size(); i++) {
                System.out.print(root.children.get(i).data + " ");
            }
        }
        System.out.println();

        for (TreeNode child : root.children) {
            print(child);
        }
    }

    public static void main(String[] args) {
        TreeNode root = takeInput();
        print(root);
    }
}
