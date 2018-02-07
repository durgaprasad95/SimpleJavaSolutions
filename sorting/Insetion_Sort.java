package sorting;

import java.util.Scanner;

public class Insetion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Elemens to be arranged : ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("The elemnents are : ");
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();
		// this is the method that sorts elements in array
		a = Sort(a);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	private static int[] Sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int pre = arr[i];
			int index = i;
			while (index > 0 && arr[index - 1] > pre) {
				arr[index] = arr[index-1];
				index--;
			}
				if (index != i)
					arr[index] = pre;
		}
		return arr;
	}
}
