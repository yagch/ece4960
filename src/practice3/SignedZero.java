package practice3;

public class SignedZero {
	public static void isPositiveZero(double x) {
		if(Math.log(x) < 0 && x == 0)
			System.out.println("is positive zero");
		else
			System.out.println("not positive zero");
	}
	public static void isNegativeZero(double x) {
		if(x == 0 && Double.isNaN(Math.log(x)))
			System.out.println("is negative zero");
		else
			System.out.println("not negative zero");
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
		isPositiveZero(a);
		isPositiveZero(b);
		isPositiveZero(c);
		isPositiveZero(d);
		isPositiveZero(e);
		isPositiveZero(f);
		isPositiveZero(g);
		isPositiveZero(h);
		isPositiveZero(i);
		isNegativeZero(a);
		isNegativeZero(b);
		isNegativeZero(c);
		isNegativeZero(d);
		isNegativeZero(e);
		isNegativeZero(f);
		isNegativeZero(g);
		isNegativeZero(h);
		isNegativeZero(i);
	}
}
