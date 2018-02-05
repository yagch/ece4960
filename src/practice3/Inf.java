package practice3;

public class Inf {
	public static void isInf(double x) {
		if(x > 0 && 1 / x == 0)
			System.out.println("is infinit");
		else
			System.out.println("not infinit");
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
		isInf(a);
		isInf(b);
		isInf(c);
		isInf(d);
		isInf(e);
		isInf(f);
		isInf(g);
		isInf(h);
		isInf(i);
	}
}
