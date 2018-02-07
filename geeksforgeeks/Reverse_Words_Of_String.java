package geeksforgeeks;

import java.util.Scanner;

public class Reverse_Words_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- >= 0) {
			String S = in.nextLine();
			System.out.println(Reverse_String(S));
		}
		in.close();
	}

	static String Reverse_String(String s) {
		String[] str = s.split("\\.");
		s = "";
		int len = str.length;
		for (int i = len - 1; i > 0; i--)
			s += (str[i] + ".");
		return (s + str[0]);
	}

}
