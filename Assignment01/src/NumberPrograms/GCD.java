package NumberPrograms;

public class GCD {

	public static void main(String[] args) {
		// greatest common divisor

		int num1 = 4;
		int num2 = 6;
		int gcd = 0;
		for (int i = 1; i < num1 && i < num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("greatest common divisor " + gcd);

	}

}
