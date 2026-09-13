package section1Exercise;

import java.util.Scanner;

public class finalSectionExercise_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, d = 0;
		
		System.out.println("Type 4 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.printf("Difference: %d", a*b - c*d );
		
		sc.close();
		

	}

}
