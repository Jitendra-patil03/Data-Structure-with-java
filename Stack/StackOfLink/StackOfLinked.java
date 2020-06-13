package Stack.StackOfLink;

public class StackOfLinked {
	private Node head = null ;
	public boolean isEmpty(){
		if(head == null)
			return true;
		else
			return false;
	}
	public void push(int data){
		Node temp = head;
		head = new Node();
		head.setData(data);
		head.setNext(temp);
		temp = null;
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else {
			int data = head.getData();
			head = head.getNext();
			return data;
		}
		return 0;
	}

}
