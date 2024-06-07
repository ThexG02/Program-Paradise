package javaimplementation;

public class practiceforjob2 {

	public static int fibbo(int n) {
		//indexing of the resultant series starts from 0
		if(n==0||n==1) {
			return n;
		}
		int fn1=fibbo(n-1);
		int fn2=fibbo(n-2);
		int fn =fn1+fn2;
		return fn;
	}
	public static boolean issrtd(int arr[], int i) {
		if(i==arr.length-1) {
			return true ;
		}
		if(arr[i]>arr[i+1]) {
			return false ;
		}
		return issrtd(arr,i+1);
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(fibbo(5));
int a[]= {3,2,0,4,1};
//System.out.println(issrtd(a,0));
modifiedbbsrt(a);

	}

}
