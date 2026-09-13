package section1Exercise;

import java.util.Scanner;

public class finalSectionExercise_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//		decimais.
	
		
		int employee_num, value_per_hour;
		double hours_worked, salary;
		
		System.out.print("Employee number: ");
		employee_num = sc.nextInt();
		System.out.print("Value per Hour: ");
		value_per_hour = sc.nextInt();
		System.out.print("Hours worked: ");
		hours_worked = sc.nextDouble();
		
		salary = value_per_hour * hours_worked;
		
		System.out.printf("\nEmployee number: %d \nsalary is: US$ %.2f", employee_num, salary);
		
		
		sc.close();
	}
}
