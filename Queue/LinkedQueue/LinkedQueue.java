package Queue;

public class LinkedQueue {
	private Node head;
	private Node tail;
	public LinkedQueue() {
	}
	public void createQueue(int data) {
		head = new Node();
		head.setData(data);
		head.setNext(null);
		tail = head;
	}
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	public void enQueue(int data) {
		if(isEmpty()) {
			System.out.println("first create Queue");
			return ;
		}
		tail.setNext(new Node());
		tail.getNext().setData(data);
		tail.getNext().setNext(null);
		tail = tail.getNext();
	}
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("queue is underFlow");
			return 0;
		}
		int i = head.getData();
		head = head.getNext();
		return i;
	}
}
