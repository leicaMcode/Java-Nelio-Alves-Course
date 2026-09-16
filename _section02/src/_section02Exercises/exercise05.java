package _section02Exercises;

import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		//seguir, calcule e mostre o valor da conta a pagar.
		
		int code, quantity;
		double total = 0;
		
		System.out.print("What's the code of the product? " );
		code = sc.nextInt();
		System.out.print("How many units do you want? ");
		quantity = sc.nextInt();
		
		if(code == 1) {
			total = quantity * 4.00;
		}
		
		else if(code == 2 ){
			total = quantity * 4.50;
			
		}
		else if(code == 3){
			total = quantity * 5.00;
			
		}
		else if(code == 4) {
			total = quantity * 2.00;
			
		}
		else if(code == 5) {
			total = quantity * 1.50;
			
		}
		else {
			System.out.println("This Code Doesn't exist");
		}
		
		System.out.printf("Total: US$%.2f", total);
		
		sc.close();
	}
	

}
