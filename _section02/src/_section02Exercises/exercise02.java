package _section02Exercises;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;  
		
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		System.out.print("Write a number: ");
		num = sc.nextInt();
		
		if (num%2 == 0) {
			System.out.printf("The number %d is even", num);
		}
		else {
			System.out.printf("The number %d is odd",num);
		}
		
		sc.close();
	}
}
