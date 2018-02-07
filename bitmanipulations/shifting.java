package bitmanipulations;

public class shifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, y, v, w, z, x = 8, u = -8;
		y = x << 4;// left shifts and replaces right digits with 0
		z = x >> 4;// right shifts and replaces left digits with 0
		v = u << 4;// left shifts and replaces right digits with 0
		w = u >> 4;// right shifts and replaces left digits with 1
		m = u >>> 4;
		System.out.println(x + " " + y + " " + z);
		System.out.println(u + " " + v + " " + w);
		System.out.println(m);
	}

}
