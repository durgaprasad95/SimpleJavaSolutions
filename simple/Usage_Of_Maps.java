package simple;

import java.util.TreeMap;

public class Usage_Of_Maps {
	public static void main(String args[]) {
		TreeMap<Integer, String> arr = new TreeMap<Integer, String>();
		arr.put(100, "100");
		arr.put(1000, "1000");
		arr.put(500, "500");
		arr.put(1, "1");
		arr.put(0, "0");
		arr.put(10, "10000");

		System.out.println((arr.keySet()));
		System.out.println((arr.values()));
	}
}