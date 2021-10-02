package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		//Find the factorial of a given no. i/p=5 (5! is 5*4*3*2*1=120) o/p=120
		int i=5;
		int fact=1;
		for (int j = 1; j <= 5; j++) {
			int mul=j*fact;
			fact=mul;
		}
		System.out.println("Factorial of " + i + " is " + fact);
	}

}
