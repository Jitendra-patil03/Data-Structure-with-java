package Queue;

//import Queue.CircularQueue.CircularQueue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue a = new LinkedQueue();
		a.createQueue(5);
		a.enQueue(10);
		a.enQueue(20);
		a.enQueue(30);
		a.enQueue(40);
		a.enQueue(50);
		//a.enQueue(60);
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		
	}
}
