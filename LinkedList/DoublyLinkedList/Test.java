package LinkedList.DoublyLinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.createList(12);
		dl.insertFirst(11);
		dl.insertFirst(10);
//		dl.insertFirst(9);
		dl.insertLast(15);
		dl.insertLast(16);
//		dl.insertAt(14, 5);
		dl.traverseForward();
		dl.deleteAll();
		//dl.deleteFirst();
		//dl.deleteLast();
		dl.traverseForward();
	}

}
