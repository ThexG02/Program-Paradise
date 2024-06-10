package StriverA2ZDSASheet;

public class reversenumber {
public static int revnum(int n) {
	int num1=0;
	while(n>0) {
		int digit=n%10;
		num1=num1*10+digit;
		n=n/10;
	}
	return num1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(revnum(23));
	}

}
