package Queue.CircularQueue;

public class CircularQueue {
	int[] arr;
	int front, rear;
	public CircularQueue() {}
    public CircularQueue(int size) {
		arr = new int[size];
		front = 0;
		rear =-1;
	}
    public boolean isExist() {
    	if(arr != null) {
    		return true;
    	}
    	 return false;
    }
    public boolean isFull() {
    	if(front == 0 && rear == arr.length-1) {
    		return true;
    	}
    	if(front > rear) {
    		if(front-1 == rear && arr[0]!=0)
    			return true;
    	}
    	 return false;
    }
    public void createQueue(int size) {
    	if(isExist()) {
    		System.out.println("already created with size "+ arr.length);
    		
    	}
    	else {
    		arr = new int[size];
    		front =0;
    		rear = -1;
    	}
    }
    
    public void enQueue(int data) {
    	if(!isExist()) {
    		System.out.println("queue is not created");
    	}
    	else if(isFull()) {
    		System.out.println("queue is overflow");
    	}
    	else {
    		if(rear == arr.length-1 && front != 0) {
    			rear = -1;
    		}
    		arr[++rear] = data;
    	}
    }
    
    public int deQueue() {
    	if(isEmpty()) {
    		return 0;
    	}
    	if(front == arr.length && front > rear) {
    		front = 0;
    	}
    	return arr[front++];
    }
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front == rear) {
			return true;
		}
		return false;
	}
    
    
    

}
