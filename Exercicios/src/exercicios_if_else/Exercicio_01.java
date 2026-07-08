package exercicios_if_else;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int A, B, C;
		
		System.out.print("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		C = leia.nextInt();
		
		if (A + B > C) {
			System.out.printf("%d + %d = %d > %d", A , B, A+B, C);
			System.out.println("\na Soma de A + B é Maior do que C.");
		}else if (A + B < C) {
			System.out.printf("%d + %d = %d < %d", A , B, A+B, C);
			System.out.println("\na Soma de A + B é Menor do que C.");
		}else {
			System.out.printf("%d + %d = %d = %d", A , B, A+B, C);
			System.out.println("\na Soma de A + B é igual a C.");}
			
		leia.close();
	}
}
