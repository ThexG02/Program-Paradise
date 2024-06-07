package javaimplementation;
import java.util.*;
public class practiceforjob {
public static void arrayrv(int arr[]) {
	int i=0,temp=0;
	int n= arr.length-1;
	while(i<n) {
		temp=arr[i];
		arr[i]=arr[n];
		arr[n]=temp;
		i++;
		n--;
	}
}
	public static void subarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++){
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
			System.out.println();
		}					
	}
	public static int kadan(int num[]) {
		int ms=Integer.MIN_VALUE;
		int cs=0;
		for(int i=0;i<num.length;i++) {
			cs+=num[i];
			if(cs<0) {
				cs=0;
			}
			ms= Math.max(cs, ms);
		}
		return ms;
	}
	public static int focc(int arr[],int key ,int i) {
		if(i==arr.length-1) {
			return -1;
		}
		if(arr[i]==key) {
			return i ;
		}
		return focc(arr,key,i+1);
	}
	public static int pow(int x, int n) {
		if(n==0) {
			return 1;
		}
		int hp=pow(x,n/2);
		int hpsq=hp*hp;
		if(n%2!=0) {
			return x*hpsq;
		}
		return hpsq;
	}
	public static void removedup( String str, int idx, StringBuilder newstr,boolean map[]) {
		if(idx==str.length()) {
			System.out.println(newstr);
		}
		char currchar=str.charAt(idx);
		if(map[currchar-'a']==true) {
			//dup
			removedup(str,idx+1,newstr,map);
		}
		else {
			map[currchar-'a']=true;
			removedup(str,idx+1,newstr.append(currchar),map);
		}
	}
	public static int frnds(int n) {
		if(n==1||n==2) {
			return n;
		}
		return frnds(n-1)+(n-1)*frnds(n-2);
	}
	public static void bstringcon1(int n, int lp,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		bstringcon1(n-1,0,str+"0");
		if(lp==0) {
			bstringcon1(n-1,1,str+"1");
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,8,2};
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]);}
//		arrayrv(arr);
//		System.out.println();
//		for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[j]);}
		
		//subarray(arr);
		int num[]= {-2,-3,4,-1,-2,1,5,-3};
		//System.out.println(pow(2,0));
		String str="harshbhardwaj";
		//removedup(str,0,new StringBuilder ("") ,new boolean [26]);
		//System.out.println(frnds(4));
		//bstringcon1(3,0,"");
		
	}

}
