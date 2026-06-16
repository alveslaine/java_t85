package atividade_repeticoes;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade = 0, menor21 = 0, maior50 = 0, menor50 = 0;
		
		System.out.println("******************** Separador de Idade ********************");
		System.out.println("--- Para finalizar o separador digite um número negativo ---\n");
		System.out.printf("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			if(idade < 21) {
				menor21++;
			}else if(idade < 50) {
				menor50++;
			}else if(idade > 50){
				maior50++;
		}
			System.out.printf("Digite uma idade: ");
			idade = leia.nextInt();
	}
		System.out.println("\n--- O total de pessoas com menos de 21 anos é " + menor21 + ". ---");
		System.out.println("--- O total de pessoas com menos de 50 anos é " + menor50 + ". ---");
		System.out.println("--- O total de pessoas com mais  de 50 anos é " + maior50 + ". ---");
		System.out.println("**************************************************************");
		leia.close();
	}
}
