package tree.BST;

public class TestBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(15);
		bst.insert(11);
		bst.insert(17);
		bst.insert(16);
		bst.insert(18);
		bst.insert(9);
		
		bst.inOrderTraversal();
		System.out.println(bst.heightOfBst());
	}

}
