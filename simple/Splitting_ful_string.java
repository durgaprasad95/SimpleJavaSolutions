package simple;

import java.util.Scanner;

public class Splitting_ful_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Big = in.nextLine();
		in.close();
		String[] words = Big.split(" ");
		int len = words.length;
		for (int i = 0; i < len; i++)
			System.out.println(words[i]);
	}

}
