package exercicios_entrada_saida_operadores;

import java.util.Scanner;

public class Ex_04_Diferenca {

	public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);
				float n1, n2, n3, n4;
				
				System.out.println("--CALCULO DA DIFERENÇA--" );
				System.out.print("Digite o valor do primeiro produto: " );
				n1 = leia.nextFloat();
				
				System.out.print("Digite o valor do segundo produto: " );
				n2 = leia.nextFloat();
				
				System.out.print("Digite o valor do terceiro produto: " );
				n3 = leia.nextFloat();
				
				System.out.print("Digite o valor do quarto produto: " );
				n4 = leia.nextFloat();
				
				System.out.printf("A soma dos produtos 1 e 2 é: %.2f", n1 + n2);
				System.out.printf("\nA soma dos produtos 3 e 4 é: %.2f", n3 + n4);
				System.out.printf("\nA diferença entre eles é: %.2f", (n1* n2) - (n3 * n4));
				
						leia.close();
	}

}
