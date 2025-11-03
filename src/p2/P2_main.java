package p2;

public class P2_main {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 50;
		b = 50;
		c = 100;
		d = 1;
		int e = 0;

		if (a == b) {
			e++;
		}
		if ((a == b) || (a == c)) {
			e++;
		}
		if ((a + b) >= c) {
			e++;
		}
		if ((a + b + c) >= 100) {
			e++;
		}
		d = e;
		System.out.println(e);
	}

}
