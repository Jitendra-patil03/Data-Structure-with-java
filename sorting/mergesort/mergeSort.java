package sorting.mergesort;

public class mergeSort {

	public static void mergeSort(int a[], int l, int h){
		if(l<h){ 
			int mid = (l+h)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,h);
			merge(a,l,mid,h);
		}
	}
	public static void merge(int a[], int l, int m,int h){
		int n1 = m -l+1;
		int n2 = h-m;
		System.out.println(" n1= "+n1+"n2="+h);
		int low[] = new int[n1];
		int high[] = new int[n2];
		
		for(int i=0;i<n1;i++){
			low[i] = a[i];
		}
		for(int i =0;i<n2;i++)
			high[i] = a[i]; 
		int i=0,j=0;
		int k=l;
		while(n1>i&&n2>j){
			if(low[i] < high[j]) {
				a[k] = low[i];
				i++;
				k++;
			} else {
				a[k] = high[j];
				j++;
				k++;
			}
		}
		while(n1>i){
			a[k] = low[i];
			i++;
			k++;
		}
		while(n2>j){
			a[k] = high[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		int a[] = {2,9,7,1,8,13,2};
		mergeSort(a,0,6);
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+"   ");
	}

}
