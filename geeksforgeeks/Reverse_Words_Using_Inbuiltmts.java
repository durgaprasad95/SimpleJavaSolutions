package geeksforgeeks;

import java.util.Scanner;

public class Reverse_Words_Using_Inbuiltmts {

	private static String res = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		in.close();
		String[] words = x.split("\\.");
		int len = words.length;

		for (int i = len - 1; i >= 0; i--) {
			res += words[i];
			if (i != 0)
				res += ".";
		}
		System.out.println(res);
	}

}
