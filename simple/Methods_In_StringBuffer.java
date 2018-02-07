package simple;

public class Methods_In_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java language");
		// StringBuffer sb2 = new
		// StringBuffer("This is all about StringBuffer");
		StringBuffer sb3 = new StringBuffer("StringBuffer is a ");
		StringBuffer sb5 = new StringBuffer("Pawn");
		String s1 = "Programming", s4 = "type of String";
		char ch1 = 'D';
		System.out.println("this tells the length of a StringBuffer sb1 :"
				+ sb1.length());
		System.out.println("this tells the capacity of a StringBuffer sb1 :"
				+ sb1.capacity());
		System.out.println("this tells about substring of a StringBuffer sb1 :"
				+ sb1.substring(0, 5));
		System.out
				.println("this tells to delete substring in range of StringBuffer sb1 :"
						+ sb1.delete(0, 4));
		sb5.setCharAt(0, ch1);
		System.out
				.println("this tells to set a character at position of StringBuffer sb5 :"
						+ sb5);
		System.out
				.println("this tells to delete a character at position of StringBuffer sb1 :"
						+ sb1.deleteCharAt(4));
		System.out
				.println("this tells to replace a substring in range of StringBuffer sb1 with another substring sb5 :"
						+ sb1.replace(0, 4, s1));
		System.out.println("this tells to reverse a StringBuffer sb1 :"
				+ sb1.reverse());
		StringBuffer sb4 = sb3.append(s4);
		System.out
				.println("this tells to append  a string s4 or integer or char or other StringBuffer to StringBuffer sb3 :"
						+ sb4);
		System.out
				.println("this tells to insert a string s1 given a starting position in StringBuffer sb1 :"
						+ sb1.insert(4, s1));

	}

}
