package practice2;

public class overflow {
	public static void main(String[] args) {
		long intFactorial = 1;
		int i = 2;
		for(i = 2; i < 30; i++) {
			intFactorial *= i;
		}
		System.out.println(i);
		System.out.println(intFactorial);
	}
}
