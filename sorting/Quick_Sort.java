package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Elemens to be arranged : ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("The elemnents are : ");
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();
		System.out.println("the sorted array is :");
		Arrays.sort(a);
		for (int i = 0; i < n; i++)
			System.out.print(a[i]+" ");
	}

}
