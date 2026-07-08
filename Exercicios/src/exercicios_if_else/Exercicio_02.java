package exercicios_if_else;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero %2 == 0 && numero > 0) {
			System.out.println("Esse número é par e positivo!");
		}else if (numero %2 == 0 && numero < 0) {
			System.out.println("Esse número é par e negativo!");
		}else if (numero %2 == 1 && numero > 0) {
			System.out.println("Esse número é ímpar e positivo!");
		}else{
			System.out.println("Esse número é ímpar e negativo!");
		}

		leia.close();
	}
}
	

	
