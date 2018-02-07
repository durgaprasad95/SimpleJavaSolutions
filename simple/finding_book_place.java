package simple;

import java.util.Scanner;

public class finding_book_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int num=in.nextInt();
		System.out.println();
		String[] books=new String[num];
		for(int i=0;i<num;i++){
			books[i]=in.next();
		}
		System.out.println();
		String book=in.next();
		in.close();
		int cnt=0;
		for(int i=0;i<num;i++){
			if(books[i].matches(book)){
				System.out.println(i+1);
				cnt=1;
				break;
			}
		}
		if(cnt==0){
			System.out.println("book is not available");
		}
	}

}
