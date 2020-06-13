package Stack.StackOfLink;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfLinked s = new StackOfLinked();
		s.push(50);
		s.push(40);
		s.push(30);
		s.push(20);
		s.push(10);
		for(int i=1;i<=5;i++){
			System.out.print(s.pop()+"   ");
		}
		System.out.format("\n"+s.pop()+"   ");
	}

}
