package atividade_repeticoes;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numeros = 0, contador, totalPar = 0, totalImpar = 0;
		
		System.out.println("******* Contagem de números pares e ímpares *******");
		for(contador = 1; contador <= 10; contador ++) {
			System.out.printf("-- Digite o %dº número (de 10): ", contador);
			numeros = leia.nextInt();
			
			if(numeros %2 == 0) {
				totalPar++;
			}else {
				totalImpar++;
		}
	}
		System.out.printf("\n******* O total de números pares é %d *******", totalPar);
		System.out.printf("\n******* O total de números ímpares é %d *******", totalImpar);
		leia.close();
	}
}
