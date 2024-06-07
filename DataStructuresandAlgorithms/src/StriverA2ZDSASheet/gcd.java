package StriverA2ZDSASheet;

public class gcd {
	public static int gcd(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
			if (a == 0) {
				return b;
			}

		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(gcd(52,10));
	}

}
