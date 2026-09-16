package _section02Exercises;

import java.util.Scanner;


public class exercise08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salary, taxes = 0;
		
		//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
		//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
		//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
		//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		
		System.out.print("What's your salary: US$");
		salary = sc.nextDouble();
		
		
		if(salary <= 2000) {
			System.out.println("You don't need to pay taxes");
		}
		else if(salary <= 3000) {
			taxes = (salary - 2000)*0.08; 
		}
		else if (salary <= 4500) {
			taxes = (salary-3000)*0.18 + 1000*0.08 ;
		}
		else {
			taxes = (salary - 4500) * 0.28 + 1500 * 0.18 + 1000 *0.08;
		}
		
		System.out.printf("US$%.2f",taxes);
		sc.close();
		
	}

}
