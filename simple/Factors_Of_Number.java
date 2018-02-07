package simple;

import java.util.Scanner;

public class Factors_Of_Number {

	private static long i = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		in.close();
		long sqrt = (long) Math.sqrt(N);
		System.out.println("The factors of given number are");
		facto(N, sqrt, i);
	}

	private static void facto(long n, long sqrt, long i) {
		// TODO Auto-generated method stub
		if (i <= sqrt) {
			if (n % i == 0) {
				System.out.println(i);
				long a = n / i;
				facto(n, sqrt, ++i);
				if (a != n / a)
					System.out.println(a);
			} else
				facto(n, sqrt, ++i);

		}
	}

}
