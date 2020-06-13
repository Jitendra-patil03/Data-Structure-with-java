package Queue.Array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue a = new ArrayQueue();
		a.createQueue(10);
		a.enQueue(10);
		a.enQueue(20);
		a.enQueue(30);
		a.enQueue(40);
		a.enQueue(50);
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		a.enQueue(50);
		a.enQueue(40);
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
	}

}
