package sjb.TimeComplexity;

public class Postorder {
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

	    // Insert a value into the BST
	    void insert(int value) {
	        root = insertNode(root, value);
	    }

	    TreeNode insertNode(TreeNode node, int value) {
	        if (node == null) {
	            return new TreeNode(value);
	        }

	        if (value < node.data) {
	            node.left = insertNode(node.left, value);
	        } else if (value > node.data) {
	            node.right = insertNode(node.right, value);
	        }

	        return node;
	    }

	    // Postorder Traversal: Left → Right → Root
	    void postorder() {
	        System.out.print("Postorder Traversal: ");
	        postorderNode(root);
	        System.out.println();
	    }

	    void postorderNode(TreeNode node) {
	        if (node != null) {
	            postorderNode(node.left);
	            postorderNode(node.right);
	            System.out.print(node.data + " ");
	        }
	    }

	   
	    public static void main(String[] args) {
	        BST b = new BST();
	        b.insert(10);
	        b.insert(45);
	        b.insert(5);

	        b.postorder();  // Expected output: 5 45 10
	    }
	}


}
