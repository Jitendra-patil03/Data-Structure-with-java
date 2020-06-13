package Stack.ArrayStack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfArray s = new StackOfArray(5);
		s.push(50);
		s.push(40);
		s.push(30);
		s.push(20);
		s.push(10);
		for(int i=1;i<=5;i++){
			System.out.print(s.pop()+"   ");
		}
		s.push(50);
		s.push(40);
		System.out.print(s.pop()+"   ");
	}

}
