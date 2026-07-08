package exercicios_entrada_saida_operadores;

import java.util.Scanner;

public class Ex_01_Salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario, abono;
		
		System.out.print("Digite o salário: " );
		salario = leia.nextFloat();
				
		System.out.print("Digite o abono: " );
		abono = leia.nextFloat();
		
		System.out.printf("Novo salário: %.2f" , salario + abono );
		
				leia.close();
	}

}
