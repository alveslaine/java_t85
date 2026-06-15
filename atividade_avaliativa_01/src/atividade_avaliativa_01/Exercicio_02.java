package atividade_avaliativa_01;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	String nome;
	float notaFinal;
	
	System.out.println("***** LISTA DE APROVAÇÃO *****");
	System.out.println("*** Qual o nome do aluno?  ***");
	nome = leia.nextLine();
	
	System.out.println("* Qual a nota final do(a) " + nome + "? *");
	notaFinal = leia.nextFloat();
	
	if(notaFinal >=7 && notaFinal <=10) {
		System.out.println("** " + nome +" está Aprovado(a) com a nota final " + notaFinal + "! **");
	}else if(notaFinal>=5 && notaFinal <7) {
		System.out.println("** " + nome +" está de Recuperação com a nota final " + notaFinal + "! **");
	}else if(notaFinal <5){
		System.out.println("** " + nome +" está Reprovado(a) com a nota final " + notaFinal + "! **");
	}else {
		System.out.println("❌❌❌ Nota inválida ❌❌❌");
	}
	
	leia.close();
	}

}
