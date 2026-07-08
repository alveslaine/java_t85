package exercicios_entrada_saida_operadores;

import java.util.Scanner;

public class Ex_03_Salario2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario, adicionalNoturno, horaExtra, desconto;
		
		System.out.println("--CONTABILIDADE SALÁRIO LÍQUIDO--" );
		System.out.print("Digite o valor do salário bruto: " );
		salario = leia.nextFloat();
		
		System.out.print("Digite o valor do adicional noturno: " );
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite o valor das horas extras: " );
		horaExtra = leia.nextFloat();
		
		System.out.print("Digite o valor dos descontos do colaborador: " );
		desconto = leia.nextFloat();
		
		System.out.printf("Salário Líquido: %.2f" , salario + adicionalNoturno + (horaExtra *5)- desconto );
		
				leia.close();
	}

}
