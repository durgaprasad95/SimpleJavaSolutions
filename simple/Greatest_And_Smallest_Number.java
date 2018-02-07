package simple;

import java.util.Scanner;

public class Greatest_And_Smallest_Number {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("Enter the total number of numbers to be given ");
		int size = numbers.nextInt();
		int[] N = new int[size];
		int SN = 0, LN = 0;
		System.out.println("The numbers are ");
		for (int i = 0; i < size; i++)
			N[i] = numbers.nextInt();
		for (int i = 0; i < size; i++)
			if (N[0] <= N[i]) {
				LN = N[i];
				N[i] = N[0];
				N[0] = LN;
			}
		System.out.println("the greatest number is " + LN);
		for (int i = 0; i < size; i++)
			if (N[0] >= N[i]) {
				SN = N[i];
				N[i] = N[0];
				N[0] = SN;
			}
		System.out.println("the smallest number is " + SN);
		numbers.close();
	}

}
