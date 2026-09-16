package _section02Exercises;

import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
	
		int start, end, duration = 0;
	
		System.out.print("What time did the game start? ");
		start = sc.nextInt();
		
		System.out.print("What time did the game finsish? ");
		end = sc.nextInt();
		
		if (start < end) {
			duration = start - end;
		}
		else if (start > duration) {
			duration = end + (24 - start);
		}
		else {
			duration = 24;
		}
		
		System.out.printf("The game took %d hours", Math.abs(duration) );
	
		sc.close();
	}
	

}
