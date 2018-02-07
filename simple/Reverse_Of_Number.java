package simple;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("the given number is : ");
		String N = in.next();
		int n = in.nextInt();
		in.close();
		UsingString(N);
		System.out.print("the reverse of given number is ");
		UsingNumber(n);
	}

	private static void UsingNumber(int a) {
		// TODO Auto-generated method stub
		int digit = 0;
		if (a % 10 != 0) {
			digit = a % 10;
			System.out.print(digit);
			UsingNumber(a / 10);
		}
	}

	private static void UsingString(String x) {
		// TODO Auto-generated method stub
		StringBuffer M = new StringBuffer(x); /*
											 * this converts the String N into
											 * StringBuffer M
											 */
		M.reverse(); /* this method stores the reverse of number M in M */
		System.out.println("the reverse of given number is " + M);
	}

}
