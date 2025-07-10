package sjb.TimeComplexity;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BST {
    TreeNode root;

    void insert(int value) {
        root = insertNode(root, value);
    }

    TreeNode insertNode(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }
        if (value < node.data) {
            node.left = insertNode(node.left, value);
        } else if (value > node.data) {
            node.right = insertNode(node.right, value);
        }
        return node;
    }

    void inorder() {
        inorderNode(root);
    }

    void inorderNode(TreeNode node) {
        if (node != null) {
            inorderNode(node.left);
            System.out.println(node.data);
            inorderNode(node.right);
        }
    }

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(10);
        b.insert(45);
        b.insert(5);
        b.inorder();  // Should print: 5 10 45
    }
}
