package Queue.Array;

import java.util.Arrays;

public class ArrayQueue {
	private int arr[];
	private int rear=0,front=0;
	public ArrayQueue() {}
	public ArrayQueue(int size) {
		this.arr = new int[size];
		rear=-1;
		front =0;
	}
	
	public void createQueue(int size) {
		if(arr == null) {
			this.arr = new int[size];
			rear=-1;
			front =0;
		}else {System.out.println("Queue already create with size "+arr.length);}
	}
	
	public boolean isFull() {
		if(rear == arr.length-1)
			return true;
		return false;
	}
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is overflow");
			return ;
		}
		arr[++rear] = data;
	}
	public boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is underFlow");
			return 0;
		}
		else if(front == rear) {
			int i = front;
			front = rear = -1;
		    return arr[i];
		}
		return arr[front++];
	}
	@Override
	public String toString() {
		String s="[ ";
		for(int i = front ;i<=rear;i++) {
			s=s+arr[i]+", ";
		}
		s+=" ]";
		return s;
	}
	
}
