
package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class reeNode {
    int data;
    ArrayList<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }

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
            // Closing scanner here would be inappropriate; close it where it is created
        }
    }

    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " -> ");
        if (root.children.isEmpty()) {
            System.out.print("No children");
        } else {
            for (TreeNode child : root.children) {
                System.out.print(child.data + " ");
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
int xSum;
