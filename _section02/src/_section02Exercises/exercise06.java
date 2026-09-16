package _section02Exercises;

import java.util.Scanner;

public class exercise06 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		
		double num;
		
		// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
		//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

		System.out.print("Write a number: ");
		num = sc.nextDouble();
		
		if(num > 0 && num <= 25) {
			System.out.println("Your number is the range [0,25]");
		}
		else if(num > 25 && num <= 50) {
			System.out.println("Your number is the range [25,50]");
		}
		else if(num > 50 && num <= 75) {
			System.out.println("Your number is the range [50, 75]");
		}
		else if(num > 75 && num <= 100) {
			System.out.println("Your number is the range [75, 100]");
		}
		else {
			System.out.println("This number is outta the range");
			
		}
		
		sc.close();
	}

}
