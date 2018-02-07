package bitmanipulations;

import java.util.Scanner;

public class subsets_of_given_set {

	private static int s = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		char[] ch = str.toCharArray();
		int len = str.length();
		for (int i = 0; i < (1 << len); ++i) {
			System.out.print((++s) + "nd subset: ");
			for (int j = 0; j < len; ++j) {
				if ((i & (1 << j)) != 0)
					System.out.print(ch[j] + " ");
			}
			System.out.println("");
		}
	}

}
