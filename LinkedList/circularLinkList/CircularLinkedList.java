package LinkedList.circularLinkList;

public class CircularLinkedList {
	private Node head=null;
	private Node tail;
	private int size = -1;

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void createLinkedList(int data){
		Node node = new Node();
		node.setData(data);
		node.setNextNode(head);
		head = node;
		tail = node;
		size = 1;
	}
	public boolean isExist(){
		return head != null;
	}
	public void insertAtFirst(int data){
		Node node = new Node();
		node.setData(data);
		if(!isExist()){
			System.out.println("Linked list not exists.first you have to create a linked list ");
			return ;
		}
		node.setNextNode(head);
		head = node;
		tail.setNextNode(head);
		size ++;
		
	}
	public void insertAtLast(int data) {
		Node node = new Node();
		node.setData(data);
		if(!isExist()){
			System.out.println("Linked list not exists.first you have to create a linked list ");
			return ;
		}
		tail.setNextNode(node);
		node.setNextNode(head);
		tail = node;
		size ++;

	}
	public void insertAt(int data, int location){
		
		if(!isExist()){
			System.out.println("Linked list does not exists.first you have to create a linked list ");
			return ;
		}
		if(location == 0){ // insert At first
			insertAtFirst(data);
		}
		else if(location == size) {  //insert at last location 
			insertAtLast(data);
		}
		else if(location >= 0 && location < size) { // insertion at perticular location
			Node temp = head;
			for(int i = 0;i < size;i++){
				if(location-1 == i){
					Node node = new Node();
					node.setData(data);
					node.setNextNode(temp.getNextNode());
					temp.setNextNode(node);
					size ++;
					break;
				}
				else{
					temp = temp.getNextNode();
				}
			}
		} 
		else {
			System.out.println(location+" Location Does not exist");
		}
		
	} 
	public int getDataAt(int location){ 
		if(!isExist()){
			System.out.println("Linked list does not exists.first you have to create a linked list ");
			return 0;
		}
		Node temp = head ;
		if(location > 0 && location <= size){
			for(int i = 0; i <= size; i++) {
				if(i == location){
					return temp.getData();
				}
				else {
					temp = temp.getNextNode();
				}
			}
		}
		return 0;
	}
	public void traverse(){
		Node temp = head;
		if(!isExist()){
			System.out.println("Linked list does not exists.first you have to create a linked list ");
			return ;
		}
		do{
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}while(temp != tail);
		System.out.println(temp.getData());
//			System.out.print("\n "+head.getSize()+"  "+tail.getIndex());
	}
	public void deleteFirst(){
		if(!isExist()){
			System.out.println("1 Linked list does not exists.first you have to create a linked list ");
			return ;
		}
		head = head.getNextNode();
		tail.setNextNode(head);
		size--;
		
	}
	public void deleteLast(){
		if(!isExist()){
			System.out.println("2Linked list does not exists.first you have to create a linked list ");
			return ;
		}
		Node temp = head;
		int i=0;
		while(i<size-2){
			temp =temp.getNextNode();
			i++;
		}
		if(temp == head){
			tail = head = null;
		}
		temp.setNextNode(head);
		tail = temp;
		size--;
		
	}
	public void deleteAt(int location){
		if(!isExist()){
			System.out.println("2Linked list does not exists.first you have to create a linked list ");
			return ;
		}
		Node temp = head;
		if(location == 0){
			deleteFirst();
		}
		else if(location >= size){
			deleteLast();
		}
		else if(location > 0){
			for(int i = 0; i <= location ;i++ ){
				if(location-1 == i){
					break;
				}
				else {
					temp = temp.getNextNode();
				}
			}
			Node temp2 = temp.getNextNode();
			temp.setNextNode(temp2.getNextNode());
			size--;
		}
		else {
			System.out.println(" location does not exist");
		}
	}
	public void deleteAll(){
		head = null;
		tail = null;
		size =-1;
		System.gc();
	}
}
