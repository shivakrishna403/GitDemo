package javaProgram;

public class Ifstatement1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		if (a+b > 10) {
			System.out.println("a+b is greater than 10");
		} else if(a+b == 10) {
			System.out.println("a+b is less than 10");
		}
		
		else if(a+b < 1) {
		System.out.println("a+b is less than 1");
		}
		else {
			System.out.println("a+b is less than 2");
		}
		System.out.println("Success");
	}

}
