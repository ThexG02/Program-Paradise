package javaimplementation;

public class searching_sorting {
	//searching-> linear search O(n) and binary search O(logn)
	//linear search:
	public static boolean linsearch(int arr[], int itm) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == itm) {
				return true;
			}
		}
		return false;
	}
	
	//Binary search:
	public static boolean binsearch(int arr[], int itm) {
		int s=0;
		int e=arr.length-1;
		int mid;
		while(s<=e) {
			mid =(s+e)/2;
			if(arr[mid]==itm) {
				return true;
			}
			else if(arr[mid]<itm) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
			
		}
		return false;
	}
	
	//sorting -> Selection sort , Bubble sort, Insertion sort, Merge sort , Quick sort
	
	// Bubble sort
	public static void bbsrt(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
	}
	
	// selection sort 
	
	public static void selctionsort(int arr[]) {
		for (int i=0;i<arr.length-1;i++) {
			int  min =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min =j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = { 5,4,1,3,2 };
	    System.out.println(binsearch(arr, 2));
		selctionsort(arr);
		System.out.println();
		bbsrt(arr);
	}
	

}
