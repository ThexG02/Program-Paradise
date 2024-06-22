package javaimplementation;
import java.util.*;;
public class array {
	
//Binary search using array : ONLY APPLICABLE IF THE ARRAY IS SORTED
public static boolean binsearch(int arr[], int itm) {
	int s=0;
	int e=arr.length-1;
	while(s<=e) {
		int mid =(s+e)/2;
		if(arr[mid]==itm) {
			return true;
		}
		if(arr[mid]<itm) {
			s=mid+1;
		}
		else {
			e=mid-1;
		}	
	}
	return false;
}

//PROGRAM to revervse an array using two pointer approach O(n)

public static void arrrev(int [] arr){
	int i=0;
	int j=arr.length-1;
	while(i<=j){
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;j--;
	}
	
}

// program to print the  all the subarray of an array
public static void subarray(int arr[]){
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){
			for(int k=i;k<=j;k++){
				System.out.print(arr[k]);
			}
			System.out.println();
		}
	}
		
}

// program to find the Mximum sum saubarray : KADAN'S ALGORITHM ->O(n) "Maximum sum from a sub array"
public static int KADAN(int arr[]){
	int ms=Integer.MIN_VALUE;
	int cs=0;
	for(int i=0;i<arr.length;i++){
		cs+=arr[i];
		if(cs<0){
			cs=0;
		}
		ms=Math.max(cs, ms);
	}
	return ms;
}

// program to implement spriral matrix traversal in a 2D array
public static void spiralmatrix(int[][] arr){
	int startrow=0;
	int startcol=0;
	int endrow=arr.length-1;
	int endcol=arr[0].length-1;
	while((startcol<=endcol)&&(startrow<=endrow)){
		
		for(int j=startcol;j<=endcol;j++){
			System.out.print(arr[startrow][j]);
		}
		for(int i=startrow+1;i<=endrow;i++){
			System.out.print(arr[i][endrow]);
		}
		for(int j=endrow-1;j>=startcol;j--){
			System.out.print(arr[endrow][j]);
		}
		for(int i= endrow-1;i>=startrow+1;i--){
			System.out.print(arr[i][startcol]);
		}
		startcol++;
        startrow++;
        endcol--;
        endrow--;
	}
}

//program to diagonal sum  in a 2D array: primary diagonal +secondary diagonal
//note : the time comlexity for this code is to O(n)
public static int diasum(int[][] arr){
	int sum=0;
	for(int  i=0;i<arr.length;i++){
		sum+=arr[i][i];
	
	if(i!=arr.length-i-1){
		sum+=arr[i][arr.length-i-1];
	}}
	return sum;
}

	public static void main(String[] args) {
		int[] arr ={1,-2,3,-4,-5,6};
		int key =14;
		//System.out.println(binsearch(arr, key));
		// arrrev(arr);
		// for(int i=0;i<arr.length;i++){
		// 	System.out.print(arr[i]+" ");
		// }
		//subarray(arr);
		//System.err.println(KADAN(arr));
		int [][] arrl={{1,2,3},
					   {8,9,4},
				       {7,6,5}
						};
		//spiralmatrix(arrl);
		System.out.println(diasum(arrl));
	}

}
