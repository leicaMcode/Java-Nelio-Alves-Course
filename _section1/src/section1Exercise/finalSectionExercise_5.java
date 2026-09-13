package section1Exercise;

import java.util.Scanner;

public class finalSectionExercise_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int piece_code, piece_quantity = 0;
		double piece_value = 0, total = 0;
		
		
		System.out.print("Piece code: ");
		piece_code = sc.nextInt();
		System.out.print("Piece quantity: ");
		piece_quantity = sc.nextInt();		
		System.out.print("Piece value: ");
		piece_value = sc.nextDouble();
		
		total = piece_value*piece_quantity;
	
		System.out.print("\nPiece code: ");
		piece_code = sc.nextInt();
		System.out.print("Piece quantity: ");
		piece_quantity = sc.nextInt();
		System.out.print("Piece value: ");
		piece_value = sc.nextDouble();
		
		total = total + piece_value*piece_quantity;
	
		System.out.printf("\nValue to pay: US$ %.2f",  total);
		sc.close();
	}

}
