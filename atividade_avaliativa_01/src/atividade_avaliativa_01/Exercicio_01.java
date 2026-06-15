package atividade_avaliativa_01;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean autorizacao;
		
		System.out.println("***** LISTA DE AUTORIZAÇÃO *****");
		System.out.println("** Qual o nome do(a) cliente? **");
		nome = leia.next();
		
		System.out.println("** Qual a idade do(a) " + nome + "?");
		idade = leia.nextInt();
		
		if (idade >= 18) {
			System.out.println("✅ Acesso Liberado ✅ para " + nome + "!");
		}else{
			System.out.println("** O cliente tem autorização dos responsáveis?");
		    autorizacao = leia.nextBoolean();
		 if (autorizacao) {
			System.out.println("✅ Acesso Liberado ✅ com autorização dos responsáveis para " + nome + "!");
		 }else{
			System.out.println("❌ Acesso barrado ❌ para " + nome + "!");
		 }
		
		leia.close();
	}
}}
