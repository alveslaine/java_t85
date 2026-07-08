package exercicios_switch_case;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int produto, quantidade = 0;
		float valor = 0, total;

		System.out.println("--- LISTA DE PRODUTOS --- ");
		System.out.println("1. Cachorro Quente");
		System.out.println("2. X-Salada");
		System.out.println("3. X-Bacon");
		System.out.println("4. Bauru");
		System.out.println("5. Refrigerante");
		System.out.println("6. Suco de laranja");
		System.out.print("\nDIGITE O CÓDIGO DO PRODUTO COMPRADO: ");
		
		produto = leia.nextInt();
		
		switch(produto) {
		case 1:
			System.out.println("1. Cachorro Quente");
			valor = 10;
			break;
		case 2:
			System.out.println("2. X-Salada");
			valor = 15;
			break;
		case 3:
			System.out.println("3. X-Bacon");
			valor = 18;
			break;
		case 4:
			System.out.println("4. Bauru");
			valor = 12;
			break;
		case 5:
			System.out.println("5. Refrigerante");
			valor = 8;
			break;
		case 6:
			System.out.println("6. Suco de laranja");
			valor = 13;
			break;
			
		default:
         System.out.println("Código inválido!");
		}
		
		System.out.print("\nDIGITE A QUANTIDADE DO PRODUTO COMPRADO: ");
		quantidade = leia.nextInt();
		
		total = valor * quantidade;
		System.out.printf("O valor total da compra é de R$ %.2f", total);
		
		leia.close();
		}
	}


