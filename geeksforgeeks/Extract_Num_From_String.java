package geeksforgeeks;

import java.util.Scanner;

public class Extract_Num_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		while (in.hasNextLine()) {
			while (T-- > 0) {
				String S = in.nextLine();
				int max = ExtractLargest(S);
				if (max == -1) {
					System.out.println("-1");
				} else {
					System.out.println(max);
				}
			}
		}
		in.close();
	}

	private static boolean checkNum(int num) {
		boolean flag = true;
		while (num > 0) {
			int digit = num % 10;
			if (digit == 9) {
				return false;
			}
			num /= 10;
		}
		return flag;
	}

	private static int ExtractLargest(String S) {
		int max = -1;
		String words[] = S.split(" ");
		for (int i = 0; i < words.length; i++) {
			try {
				int num = Integer.parseInt(words[i]);
				if (checkNum(num)) {
					if (max < num) {
						max = num;
					}
				}
			} catch (Exception e) {
			}
		}
		return max;
	}
}
