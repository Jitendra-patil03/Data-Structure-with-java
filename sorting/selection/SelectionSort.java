package sorting.selection;

public class SelectionSort {
	public static int[] selectionSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			int min = i;
			for(int j=i+1; j<arr.length;j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static void main(String arg[]){
		int a[] = {2,9,7,1,8,13,2};
		a = selectionSort(a);
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+"   ");
	}

}
