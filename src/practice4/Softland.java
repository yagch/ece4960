package practice4;

public class Softland {
	public static void main(String[] arg) {
		double x = 1.121312212313414;
		x *= 10^(-309);
		for (int i = 1; i < 20; i++) {
			x /= 10.0;
			System.out.println(x);
		}
	}
}
