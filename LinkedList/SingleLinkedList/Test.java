package LinkedList.SingleLinkedList;
public class Test {
	//static SigleLinkedList s=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SigleLinkedList s = new SigleLinkedList();
		s.createLinkedList(10);
		s.insertAt(10,1);
		s.insertAt(20, 2);
		s.insertAt(12, 3);
	//	s.insertAt(25, 5);
		s.insertAtLast(57);
		s.insertAtFirst(45);
		s.traverse();
		//s.delete(3);
		//s.deleteAll();
		s.deleteLast();
		//System.out.print("At="+s.getDataAt(3));
		s.traverse();
	}

}
