package practice1;

public class method1 {
   public static void main(String[] args){
	   double mid;
	   double a = 1;
	   double b = 1000;
	   double c = 1000;
	   for(int i = 0; i < 20; i++) {
		   a /= 10;
	   }
	   double x1;
	   double x2;
	   mid = Math.sqrt(b * b - 4 * a * c);
	   x1 = - b + mid;
	   x2 = - b - mid;
	   x1 /= 2 * a;
	   x2 /= 2 * a;
	   System.out.println(x1);
	   System.out.println(x2);
   }
}
