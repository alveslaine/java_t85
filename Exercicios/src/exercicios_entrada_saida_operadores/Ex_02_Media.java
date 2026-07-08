package exercicios_entrada_saida_operadores;

import java.util.Scanner;

public class Ex_02_Media {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, nota4;

		System.out.println("--CALCULADOR DE MÉDIA--");
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		nota4= leia.nextFloat();
		
		System.out.printf("Média final: %.1f" , (nota1 + nota2 + nota3 + nota4) / 4);
		
		leia.close();
	}

}
