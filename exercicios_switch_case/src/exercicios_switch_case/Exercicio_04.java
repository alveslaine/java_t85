package exercicios_switch_case;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario, percentual = 0, total;

		System.out.print("--- REAJUSTE SALARIAL --- ");
		System.out.print("\nDigite o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.printf("\nDigite o cargo do(a) " + nome);
		System.out.println("\n1. Gerente");
		System.out.println("2. Vendedor");
		System.out.println("3. Supervisor");
		System.out.println("4. Motorista");
		System.out.println("5. Estoquista");
		System.out.println("6. Técnico de TI");
		cargo = leia.nextInt();
		
		switch(cargo) {
		case 1:
			System.out.println("1. Gerente");
			percentual = 0.10f;
			break;
		case 2:
			System.out.println("2. Vendedor");
			percentual = 0.07f;
			break;
		case 3:
			System.out.println("3. Supervisor");
			percentual = 0.09f;
			break;
		case 4:
			System.out.println("4. Motorista");
			percentual = 0.06f;
			break;
		case 5:
			System.out.println("5. Estoquista");
			percentual = 0.05f;
			break;
		case 6:
			System.out.println("6. Técnico de TI");
			percentual = 0.08f;
			break;
			
		default:
         System.out.println("Código inválido!");
		}
		
		System.out.print("\nDIGITE O SÁLARIO DO COLABORADOR: ");
		salario = leia.nextFloat();
		
		total = salario + (percentual * salario);
		System.out.printf("O valor reajustado do colaborador é de R$ %.2f", total);
		
		leia.close();
		}
	}


