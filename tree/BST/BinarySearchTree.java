package tree.BST;

import tree.BinaryTree.Node;
// this program is under developing
public class BinarySearchTree {
	private Node root;
	BinarySearchTree(){}
	BinarySearchTree(int data){
		root = new Node(data);
		
	}
	
	public void insert(int data) {
		if(this.root == null) {
			root = new Node(data);
		}
		else {
			this.root = insertData(root,data);
			
		}
	}
	public  Node insertData(Node root,int data) {
		if(root == null) {
			root = new Node(data);
		}
		else {
			if(data <= root.getData()) {
				root.setLeft(insertData(root.getLeft(),data));
			}
			else {
				root.setRight(insertData(root.getRight(),data));
			}
		}
		return root;
	}
	private void inOrderTrav(Node root) {
		if(root == null) {
			
			return;
		}
		
		inOrderTrav(root.getLeft());
		System.out.println(root.getData());
		inOrderTrav(root.getRight());
	}
	public void inOrderTraversal() {
		inOrderTrav(root);
	}
	
	
	
	public int heightOfBst() {
		return height(this.root);
	}
	private int height(Node root) {
		int l = 0;
		int r = 0;
		if(root == null)
			return 0;
		else {
			l = height(root.getLeft());
			r=height(root.getRight());
		}
		if(l>r)
			return l+1;
		return r+1;
		
	}
}
