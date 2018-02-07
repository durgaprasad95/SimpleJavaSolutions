package simple;

import java.util.Scanner;

public class Gcd_of_2_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		in.close();
		Gcd(a,b);
	}

	private static void Gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(a==b)
			System.out.println("GCD of given numbers is "+a);
		else{
			if(a>b){
				a=a-b;
				Gcd(a,b);
			}
			else{
				b=b-a;
				Gcd(a,b);
			}
		}
	}

}
