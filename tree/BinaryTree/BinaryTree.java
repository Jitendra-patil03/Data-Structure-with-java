package tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private Node root;
	public void createTree() {
		if(this.root ==null)
			root = new Node();
		else
			System.out.println("tree already created ");
	}
	//it will create binary tree
	public void createTree(int data) {
		if(this.root == null) {
			this.root = new Node(data);
		} else {
			System.out.println("tree already created");
		}
	}
	//preOrderTraversal depth first search
	private void preOrderTrav(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.getData());
		preOrderTrav(root.getLeft());
		preOrderTrav(root.getRight());
	}
	public void preOrderTraversal() {
		preOrderTrav(root);
	}
	//inOrder traversal method
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
	// post order traversal
	private void postOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.println(root.getData());
	
	}
	public void postOrderTraversal() {
		postOrderTraversal(root);
	}
	//level order traversal uses queue because it follow breath first search
	public void levelOrderTraversal() {
		if(root == null) {
			
			return;
		}
		Queue queue = new LinkedList();
		queue.add(root);
		byte i =1;
		while(!queue.isEmpty()) {
			if(root != null) {
				queue.add(root.getLeft());
 				queue.add(root.getRight());
			}
			if(i==1) {
				i++;
				System.out.println(root.getData());
				queue.remove();
				root = root.getLeft();
				queue.remove();
			}else {
				System.out.println(root.getData());
				root = (Node)queue.remove();
			
			}
		}
		
	}
	 
	public void printTree(Node root) {
		if(root == null)
			return;
		System.out.println("root== "+root.getData() );
		printTree(root.getLeft());
		printTree(root.getRight());
	}
	
	//insert data
	public void insert(int data) {
		Node n = root;
		if(root.getData()==0) {
			n.setData(data); 
		} else {
			int i=1;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(n);
			while(!queue.isEmpty()) {
				if(n.getLeft() == null) {
					n.setLeft(new Node(data));
					break;
				} else if(n.getRight() == null) {
					n.setRight(new Node(data));
					break;
				} else {
					queue.add(n.getLeft());
					queue.add(n.getRight());
					if(i == 1) {
						i++;
						n = n.getLeft();
						queue.remove();
						queue.remove();
					}
					else {
						n = queue.remove();
					}
				}
			}
		}
	}
	
	//delete data
	
	
}
