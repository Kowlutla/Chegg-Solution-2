// Java program to convert binary tree into its mirror 
public class BinaryTree {

	/*
	 * Class containing left and right child of current node and key value
	 */
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	Node root;

	// Method to convert binary tree to its mirror
	void mirror() {
		root = mirror(root);
	}

	Node mirror(Node node) {
		if (node == null)
			return node;

		/* do the subtrees */
		Node left = mirror(node.left);
		Node right = mirror(node.right);

		/* swap the left and right pointers */
		node.left = right;
		node.right = left;

		return node;
	}

	void preOrder() {
		preOrder(root);
	}

	/*
	 * Helper function to test mirror() print tree in preOrder traversal
	 */
	void preOrder(Node node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	/* testing for example nodes */
	public static void main(String args[]) {
		/* creating a binary tree and entering the nodes */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(3);
		tree.root.right = new Node(2);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);

		/* print Preorder traversal of the input tree */
		System.out.println("Preorder traversal of input tree is :");
		tree.preOrder();
		System.out.println("");

		/* convert tree to its mirror */
		tree.mirror();

		/* print Preorder traversal of the minor tree */
		System.out.println("Preorder traversal of Mirror tree is : ");
		tree.preOrder();
	}
}
