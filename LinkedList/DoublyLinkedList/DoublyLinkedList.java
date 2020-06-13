package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
	private Node head = null;
	private Node tail = null;
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public void createList(int data){
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(null);
		temp.setPrevious(null);
		head = temp;
		tail = temp;
		temp = null;
		size = 1;
	}
	public boolean isExist(){
		return head != null; 
	}
	public void insertFirst(int data){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		Node temp = new Node();
		temp.setData(data);
		temp.setPrevious(null);
		temp.setNext(head);
		head.setPrevious(temp);
		head = temp;
		temp=null;
		size ++;
	}
	public void insertLast(int data){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(null);
		tail.setNext(temp);
		temp.setPrevious(tail);
		tail = temp;
		temp = null;
		size ++;
	}
	public void insertAt(int data, int location){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		Node temp = head;
		if(location < 1 || location > size){
			System.out.print("loaction does not exist");
		}
		else if(location == 1){
			insertFirst(data);
		}
		else if(location >= size){
			insertLast(data);
		}
		else {
				Node temp2 = new Node();
				for(int i = 1; i < location-1;i++){
					temp = temp.getNext();
				}
				temp2.setData(data);
				temp2.setPrevious(temp);
				temp2.setNext(temp.getNext());
				temp.getNext().setPrevious(temp2);
				temp.setNext(temp2);
				size++;
				
		}
	}
	
	public void traverseForward(){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		Node temp = head;
		int i=size-1;
		System.out.println(temp.getData()+"  at "+(size-i));
		while(temp != tail){
			i--;
			temp = temp.getNext();
			System.out.println(temp.getData()+"   at "+(size-i));
		}
	}
	public void traverseBackword(){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		Node temp = tail;
		System.out.println(temp.getData()+"  at "+(size--));
		while(temp != head){
			temp = temp.getPrevious();
			System.out.println(temp.getData()+"   at "+(size--));
		}
	}
	public void deleteFirst(){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		if(head.getNext() == null){
			head = null;
			tail = null;
			size--;
		}
		else {
			Node temp = head.getNext();
			temp.setPrevious(null);
			head = temp;
			temp = null;
			size--;
		}
	}
	public void deleteLast(){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		if(head.getNext() == null) {
			head = tail = null;
			size --;
		}
		else {
			Node temp = tail.getPrevious();
			temp.setNext(null);
			tail.setPrevious(null);
			tail = temp;
			size--;
		}
	}
	public void deleteAt(int location){
		if(!isExist()){
			System.out.print("linked list does not exist");
			return ;
		}
		if(location == 1){
			deleteFirst();
		}
		else if(location >= size){
			deleteLast();
		}
		else {
			if(location > size/2){
				
				Node temp1 = tail;
				for(int i = size ; i > location+1 ; i--){
					temp1 = temp1.getPrevious();
				}
				Node temp2 = temp1.getPrevious().getPrevious();
				temp1.getPrevious().setNext(null);
				temp1.getPrevious().setPrevious(null);
				temp1.setPrevious(temp2);
				temp2.setNext(temp1);
				size--;
			}
			else if(location <= size/2){
				Node temp1 = head;
				for(int i = 1; i < location-1;i++){
					temp1 = temp1.getNext();
				}
				Node temp2 = temp1.getNext().getNext();
				temp1.getNext().setNext(null);
				temp1.getNext().setPrevious(null);
				temp2.setPrevious(temp1);
				temp1.setNext(temp2);
				size--;
			}
			
		}
	}
	public void deleteAll(){
		head = tail = null;
		size =0;
	}

}
