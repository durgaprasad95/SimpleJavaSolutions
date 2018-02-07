package geeksforgeeks;

import java.util.Scanner;

public class Permutes {

	static int no = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		in.close();
		printPermutations("", word);

	}

	private static void printPermutations(String prefix, String word) {
		if (word.length() <= 1) {
			System.out.println((++no) + ": " + prefix + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				String cur = word.substring(i, i + 1);
				String after = word.substring(i + 1);
				String before = word.substring(0, i);
				printPermutations(prefix + cur, before + after);
			}
		}

	}

}
