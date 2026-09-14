package _section02Exercises;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.//

		
		int num;
		
		System.out.print("Writer a number: ");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.printf("The number %d is positive", num);	
		}
		
		else {	
			System.out.printf("The number %d is negative", num);
		}
		
		
		
		sc.close();
	}

}
