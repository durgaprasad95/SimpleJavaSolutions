package simple;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_Calculation {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number ");
		BigInteger N = number.nextBigInteger();
		BigInteger output = BigInteger.ONE;
		if (N.compareTo(BigInteger.ZERO) == 1)
			output = fact(N);
		else
			output = BigInteger.ONE;
		System.out.println("the factorial of given number is "+output);
		number.close();
	}

	private static BigInteger fact(BigInteger n) {
		BigInteger output = BigInteger.ONE;
		if (n.compareTo(BigInteger.ZERO) == 0)
			output = BigInteger.ONE;
		else
			output = n.multiply(fact(n.subtract(BigInteger.ONE)));
		return output;
	}

}
