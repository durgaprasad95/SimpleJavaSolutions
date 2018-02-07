package sorting;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("For ascending order");
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();
		int numberOfSwaps = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if (a[j] > a[j + 1]) {
					int z;
					z = a[j];
					a[j] = a[j + 1];
					a[j + 1] = z;
					numberOfSwaps++;
				}
			}
		}
		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}

}
