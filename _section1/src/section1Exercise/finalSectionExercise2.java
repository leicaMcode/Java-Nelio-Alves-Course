package section1Exercise;

import java.util.Scanner;

public class finalSectionExercise2 {

	public static void main(String[] args) {
		
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159

		Scanner sc = new Scanner(System.in);
		
		double radius;
		double pi = 3.14159;
		
		System.out.print("Write the radius of the circle: ");
		radius = sc.nextDouble();
		
		System.out.printf("A = %.4f", Math.pow(radius, 2) * pi );
		
		sc.close();
		
	}

}
