package datastructures;

class Node {
	
	int data;
	Node parent;
	Node left;
	Node right;
	
	public Node(int data) {
		
		this.data = data;
		this.parent = null;
		this.left = null;
		this.right = null;
	}
	
}

public class BST {
	
	private Node root;
	
	public BST() {
		
		root = null;
	}
	
	public void createSampleTree() {
		
		Node node50 = new Node(50);
		Node node30 = new Node(30);
		Node node70 = new Node(70);
		
		node30.parent = node50;
		node70.parent = node50;
		node50.left = node30;
		node50.right = node70;
		
		Node node23 = new Node(23);
		Node node35 = new Node(35);
		
		node23.parent = node30;
		node35.parent = node30;
		node30.left = node23;
		node30.right = node35;
		
		Node node11 = new Node(11);
		Node node25 = new Node(25);
		
		node11.parent = node23;
		node25.parent = node23;
		node23.left = node11;
		node23.right = node25;
		
		Node node31 = new Node(31);
		Node node42 = new Node(42);

		node31.parent = node35;
		node42.parent = node35;
		node35.left = node31;
		node35.right = node42;

		Node node80 = new Node(80);

		node80.parent = node70;
		node70.right = node80;

		Node node73 = new Node(73);
		Node node85 = new Node(85);

		node73.parent = node80;
		node85.parent = node80;
		node80.left = node73;
		node80.right = node85;

		this.root = node50;
	}
	
	private void printHelper(Node currPtr, String indent, boolean last) {
		
		if (currPtr != null) {
			
			System.out.println(indent);
			
			if (last) {
				
				System.out.println("R----");
				indent+= "     ";
			} else {
				
				System.out.println("L----");
				indent += "|    ";
			}
			
			System.out.println(currPtr.data);
			
			printHelper(currPtr.left, indent, false);
			printHelper(currPtr.right, indent, true);
		}
	}
	
	private Node searchTreeHelper(Node node, int key) {
		
		if (node == null || key == node.data) {
			
			return node;
		}
		
		if (key < node.data) {
			
			return searchTreeHelper(node.left, key);
		}
		
		return searchTreeHelper(node.right, key);
	}
	
	private Node deleteNodeHelper(Node node, int key) {
		
		// Search the key
		if (node == null) return node;
		else if (key < node.data) node.left = deleteNodeHelper(node.left, key);
		else if (key > node.data) node.right = deleteNodeHelper(node.right, key);
		else {
			
			// The key was found, now we're going to delete it
			
			// Case 1: node is a leaf node
			if (node.left == null && node.right == null) {
				
				node = null;
				
			// Case 2: node has only one child
			} else if (node.left == null) { 
				
				node = node.right;
				
			} else if (node.right == null) {
				
				node = node.left;
			
			// Case 3: has both children
			} else {
				
				Node tmp = minimum(node.right);
				node.data = tmp.data;
				node.right = deleteNodeHelper(node.right, tmp.data);
			}
		}
		
		return node;
	}
	
	private void preOrderHelper(Node node) {
		
		if (node != null) {
			
			System.out.print(node.data + " ");
			preOrderHelper(node.left);
			preOrderHelper(node.right);
		}
	}
	
	
	private void inOrderHelper(Node node) {
		
		if (node != null) {
			
			preOrderHelper(node.left);
			System.out.print(node.data + " ");
			preOrderHelper(node.right);
		}
	}
	
	private void postOrderHelper(Node node) {
		
		if (node != null) {
			
			preOrderHelper(node.left);
			preOrderHelper(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	public void preOrder() {
		
		preOrderHelper(this.root);
	}
	
	public void inOrder() {
		
		inOrderHelper(this.root);
	}
	
	public void postOrder() {
		
		postOrderHelper(this.root);
	}
	
	// Search the tree for key k and return the corresponding node
	public Node searchTree(int k) {
		
		return searchTreeHelper(this.root, k);
	}
	
	// Find the node with the minimum key
	public Node minimum(Node node) {
		
		while (node.left != null) {
			
			node = node.left;
		}
		
		return node;
	}
	
	// Find the node with the maximum key
	public Node maximum(Node node) {
		
		while (node.right != null) {
			
			node = node.right;
		}
		
		return node;
	}
	
	// Insert the key to the tree in its appropriate position
	public void insert(int key) {
		
		Node node = new Node(key);
		Node y = null;
		Node x = this.root;
		
		while (x != null) {
			
			y = x;
			
			if (node.data < x.data) {
				
				x = x.left;
				
			} else {
				
				x = x.right;
			}
		}
		
		// y is parent of x
		node.parent = y;
		
		if ( y == null) {
			
			root = node;
			
		} else if (node.data < y.data) {
			
			y.left = node;
			
		} else {
			
			y.right = node;
		}
	}
	
	// Delete the node from the tree
	Node deleteNode(int data) {
		
		return deleteNodeHelper(this.root, data);
	}
	
	// Print the tree structure
	public void print() {
		
		printHelper(this.root, "", true);
	}
	
	public static void main(String[] args) {
		
		BST tree = new BST();
		tree.createSampleTree();
		tree.deleteNode(35);
		tree.print();
	}
}

