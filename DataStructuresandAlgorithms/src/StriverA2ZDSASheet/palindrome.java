
package StriverA2ZDSASheet;
import java.util.*;
public class palindrome {
	public static boolean palindrome(int num) {
		int num1 = 0;
		int a=num;
		while (num > 0) {
			int dig = num % 10;
			num1 = num1* 10 + dig;
			num /= 10;
		}
		if (num1 == a) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(palindrome(n));
	}

}
