package _section1Lecture;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		
		System.out.println("You wrote the name  " + x);
		
		int a = sc.nextInt();
		
		System.out.println("\nThe value you wrote was " + a);
		
		double d = sc.nextDouble();
		
		System.out.println("\nThe double value you wrote was " + d);

		char c = sc.next().charAt(0);
		
		System.out.println("\nThe first character you wrote was '" + c + "'");
		
		sc.close();
	}

}
