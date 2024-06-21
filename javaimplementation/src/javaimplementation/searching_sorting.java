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

	// modified Bubble sort
	public static void modifiedbbsrt(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			boolean swap = false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				//swap 
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swap =true;
				}			}
			if(swap==false) {
				break ;
			}
			
		}
		for(int k =0;k<arr.length;k++) {
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
	//program to print array
	public static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	// Program for the merge sort of an array : concept -> divide and conqure
	public static void mergesort(int arr[], int si, int ei){
		if(si>=ei){
			return ;
		}
		int mid= si+(ei-si)/2;
		mergesort(arr, si, mid);
		mergesort(arr, mid+1, ei);
		merge(arr, si, ei, mid);
	
	}
	public static int[] merge(int arr[], int si , int ei , int mid){
	int temp[]= new int[ei-si+1];
	int i= si;// itterator for the left reccursive part
	int j=mid+1;//itterator for right recurrsive part
	int k =0; // itterator for the tempersry array
	while(i<=mid && j<=ei){
		if(arr[i]<arr[j]){
			temp[k]=arr[i];
			i++;
			k++;
		}
		else{
			temp[k]=arr[j];
			j++;
			k++;
		}
	} 
	while(i<=mid){
		temp[k++]=arr[i++];
	}
	while (j<=ei){
		temp[k++]=arr[j++];
	}
	for(k=0,i=si;k<temp.length;k++,i++){
		arr[i]=temp[k];
	}
	return(arr);

	}
	public static void main(String[] args) {
		int arr[] = { 5,4,1,3,2 };
		printarr(arr);
	    // System.out.println(binsearch(arr, 2));
		// selctionsort(arr);
		// System.out.println();
		// bbsrt(arr);
		// int a[]= {3,2,0,4,1};
		// modifiedbbsrt(a);
		mergesort(arr, 0, arr.length-1);
		printarr(arr);

	}
	

}
