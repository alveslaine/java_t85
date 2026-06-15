package atividade_avaliativa_01;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero1, numero2, total = 0;
		int operacao =0;
		
		System.out.println("*** CALCULADORA BÁSICA ***");
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("\nDigite o código da operação: \n1. Soma | 2. Subtração | 3. Multiplicação | 4. Divisão | 5. Potência");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			total = numero1 + numero2;
			System.out.println("1.Soma");
			break;
		case 2:
			total = numero1 - numero2;
			System.out.println("2. Subtração");
			break;
		case 3:
			total = numero1 * numero2;
			System.out.println("3. Multiplicação");
			break;
		case 4:
			total = numero1 / numero2;
			System.out.println("4. Divisão");
			break;
		case 5:
			total = Math.pow(numero1, numero2);
			System.out.println("5. Potência");
			break;
			
		default: 
		System.out.println("Operador inválido.");
			
		}
		System.out.printf("*** O RESULTADO DA OPERAÇÃO É %.2f ***", total);
		
		leia.close();
	}

}
