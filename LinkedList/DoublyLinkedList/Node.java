package LinkedList.DoublyLinkedList;

public class Node {
	private Node previous;
	private int data;
	private Node next;
	@Override
	public String toString() {
		return ""+data;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
