package _section02Exercises;

import java.util.Scanner;

public class exercise03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		//ordem crescente ou decrescente.
		
		System.out.print("Write a number: ");
		num1 = sc.nextInt();
		
		System.out.print("Write another number: " );
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.printf("Number %d and Number %d are multiples", num1, num2);
		}
		else {

			System.out.printf("Number %d and Number %d are not multiples", num1, num2);
		}
		
		sc.close();
		
	}

}
