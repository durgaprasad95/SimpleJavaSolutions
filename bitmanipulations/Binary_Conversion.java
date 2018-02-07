package bitmanipulations;

import java.util.Scanner;

public class Binary_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		in.close();
		System.out.print("The binary conversion of " + N + " is: ");
		Conversion(N);
		System.out.println("");
	}

	private static void Conversion(long N) {
		// TODO Auto-generated method stub
		if (N != 0) {
			Conversion(N >> 1);
			if ((N & (1 << 0)) != 0)
				System.out.print(1);
			else
				System.out.print(0);
		}
	}

}
