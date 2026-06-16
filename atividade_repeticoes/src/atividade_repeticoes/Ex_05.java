package atividade_repeticoes;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero = 0, somaPositivos = 0;
		String positivos = "", negativos = "";
		
		System.out.println("********** Contador de números positivos **********");
		System.out.println("----- Se quiser para parar o contador digite 0 ----\n");
		do {
			System.out.printf("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				somaPositivos += numero;
				positivos += numero + ", ";
			 } else if (numero < 0) {
			    negativos += numero + ", ";
			 }
		}while(numero != 0);
			
		System.out.println("\nA soma dos números positivos é: " + somaPositivos);
		System.out.println("\nNúmeros positivos digitados: " + positivos);
		System.out.println("Números negativos digitados: " + negativos);
		System.out.println("\n***************************************************");
		
		leia.close();
	}
}
