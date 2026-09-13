package section1Exercise;

import java.util.Scanner;

public class finalSectionExercise1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b, result = 0;
		
		System.out.print("Write a number: ");
		a = sc.nextInt();
		
		System.out.print("Write another number: ");
		b = sc.nextInt();
		
		result = a + b;
				
		System.out.printf("%d + %d =  %d", a, b, result);
		
		sc.close();

	}

}
