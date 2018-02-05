package practice3;

public class Ninf {
	public static void isNInf(double x) {
		if(x < 0 && 1 / x == 0)
			System.out.println("is negative infinit");
		else
			System.out.println("not negative infinit");
	}
	public static void main(String[] args) {
		double a = 1.0;
		double b = -1.0;
		double c = Double.MAX_VALUE;
		double d = b * c;
		double e = +0;
		double f = -0;
		double g = Double.POSITIVE_INFINITY;
		double h = Double.NEGATIVE_INFINITY;
		double i = Double.NaN;
		isNInf(a);
		isNInf(b);
		isNInf(c);
		isNInf(d);
		isNInf(e);
		isNInf(f);
		isNInf(g);
		isNInf(h);
		isNInf(i);
	}
}
