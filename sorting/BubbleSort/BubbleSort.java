package sorting.BubbleSort;

public class BubbleSort {
	
	public static int[] bubbleSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0; j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String arg[]){
		int a[] = {10,9,7,11,8,13,12};
		a = bubbleSort(a);
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+"   ");
	}

}
