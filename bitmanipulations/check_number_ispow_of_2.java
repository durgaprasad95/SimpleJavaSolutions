package bitmanipulations;

import java.util.Scanner;

public class check_number_ispow_of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		if ((N != 0) && (N & (N - 1)) == 0)
			System.out.println("Entered number is power of two");
		else
			System.out.println("Entered number is not power of two");
	}

}
