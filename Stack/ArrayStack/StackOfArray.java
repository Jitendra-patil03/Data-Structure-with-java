package Stack.ArrayStack;

public class StackOfArray {
	private int arr[];
	private short top=-1;
	public StackOfArray(){
		System.out.println("before push element first you have to call createStack(int sizeofArray) ");
	}
	public StackOfArray(int size){
		arr = new int[size];
	}
	
	public void createStack(int size){
		if(arr == null){
			System.out.println("stack already created with size="+arr.length);
		}
		else{
			arr = new int[size];
		}
	}
	public boolean isFull(){
		if(top == arr.length-1){
			return true;
		}
		else
			return false;
	}
	public void push(int data){
		if(isFull()){
			System.out.println("Stack overflow");
		} else
		arr[++top] = data;
	}
	public boolean isEmpty(){
		if(top == -1)
			return true ;
		else 
			return false;
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return 0;
		} else 
			return arr[top--];
	}
}
