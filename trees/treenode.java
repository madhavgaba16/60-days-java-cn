package trees;
import java.util.Scanner;
import java.util.ArrayList;


public class treeNode {
    int data;
    ArrayList<treeNode> children;

    public treeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }

    // Method to recursively take input and construct a tree
    public static treeNode takeInput() {
        try (Scanner scanne = new Scanner(System.in)) {
            try {
                System.out.println("Enter the value of the node: ");
                int value = scanne.nextInt();
                treeNode node = new treeNode(value);

                System.out.println("Enter the number of children: ");
                int childCount = scanne.nextInt();
                for (int i = 0; i < childCount; i++) {
                    treeNode child = takeInput(); // Recursive call to create child nodes
                    node.children.add(child);
                }

                return node;
            } finally {
                // Closing scanner is not ideal here; consider managing it outside of the method
                // scanner.close();
            }
        }
    }

    // Method to print the tree in a readable format (preorder traversal)
    public static void print(treeNode root) {
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

        for (treeNode child : root.children) {
            print(child);
        }
    }

    public static void main(String[] args) {
        treeNode root = takeInput();
        System.out.println("enter root data");
        print(root);
    }
}
