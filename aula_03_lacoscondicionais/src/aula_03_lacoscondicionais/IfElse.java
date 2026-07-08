package aula_03_lacoscondicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
	
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
	
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovado!");
		}else if(media == 5){
			System.out.println("Aluno de exame!");
		}else {
			System.out.println("Infelizmente você foi reprovado...");
		}
		leia.close();
	}

}
