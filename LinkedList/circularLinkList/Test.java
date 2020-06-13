package LinkedList.circularLinkList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList c = new CircularLinkedList();
		c.createLinkedList(10);
		c.insertAtFirst(30);
		c.insertAtLast(40);
		c.insertAt(20, 2);
		c.insertAtLast(50);
		c.traverse();
		c.deleteFirst();
		c.deleteLast();
		System.out.println("after delete");
		c.traverse();
	}

}
