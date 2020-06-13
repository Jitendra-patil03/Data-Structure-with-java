package sorting.insertionSort;

public class InsertionSort {

public static int[] insertionSort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i; j>0; j--) {
				
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else 
					break;
			}
			
		}
		return arr;
	}
	
	public static void main(String arg[]){
		int a[] = {2,9,7,1,8,13,2};
		a = insertionSort(a);
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+"   ");
	}


}
