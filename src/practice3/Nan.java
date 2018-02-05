package practice3;

public class Nan {
	public static void isNan(double x) {
		if(Double.isNaN(x))
			System.out.println("not a number");
		else
			System.out.println("is a number");
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
		isNan(a);
		isNan(b);
		isNan(c);
		isNan(d);
		isNan(e);
		isNan(f);
		isNan(g);
		isNan(h);
		isNan(i);
	}
}
