package simple;

import java.util.Scanner;

public class Prime_Factors_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		System.out.print("Prime factors of given number are: ");
		while (N % 2 == 0) {
			System.out.print(2 + " ");
			N /= 2;
		}
		for (int i = 3; i <= (int) Math.sqrt(N); i += 2) {
			while (N % i == 0) {
				System.out.print(i + " ");
				N /= i;
			}
		}
		if (N >= 2)
			System.out.println(N);
	}
}
