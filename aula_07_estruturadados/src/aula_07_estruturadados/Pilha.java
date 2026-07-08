package aula_07_estruturadados;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		 Deque<String> pilha = new ArrayDeque<>();
	        int contador = 0;
	        
	        pilha.push("Prato Verde");
	        pilha.push("Prato Azul");
	        pilha.push("Prato Branco");
	        pilha.push("Prato Amarelo");
	        pilha.push("Prato Vermelho");

	        System.out.println("\nElementos da Pilha (topo → base):");
	        contador = pilha.size();
	        
	        for (String prato : pilha) {
	        	System.out.printf("[%d] %s%n", contador, prato);
	        	contador --;
	        }
	        System.out.println("\nRetirar elemento: " + pilha.pop());
	        System.out.println("\nElementos da Pilha (topo → base):");
	        contador = pilha.size();
	        
	        for (String prato : pilha) {
	        	System.out.printf("[%d] %s%n", contador, prato);
	        	contador --;
	        }
	        System.out.println("\nRetirar elemento: " + pilha.pop());
	        System.out.println("\nElementos da Pilha (topo → base):");
	        contador = pilha.size();
	        
	        for (String prato : pilha) {
	        	System.out.printf("[%d] %s%n", contador, prato);
	        	contador --;
	        }
	        System.out.println("\nElemento no topo da Pilha: " + pilha.peek());
	        pilha.push("Prato Roxo");
	        System.out.println("\nAdicionar Elemento Prato Roxo");
	        System.out.println("\nPilha Atualizada (topo → base):");
	        contador = pilha.size();
	        
	        for (String prato : pilha) {
	        	System.out.printf("[%d] %s%n", contador, prato);
	        	contador --;
	        }
	        System.out.println("\nTamanho da Pilha: " + pilha.size());
	        System.out.println("\nO Elemento Prato Verde existe na Pilha? " + pilha.contains("Prato Verde"));
	        System.out.println("\nExibir todos os Elementos da Pilha por Iteração (topo → base):");
	        contador = pilha.size();
	        
	        for (String prato : pilha) {
	        	System.out.printf("[%d] %s%n", contador, prato);
	        	contador --;
	        }
	        pilha.clear();
	        System.out.println("\nA Pilha está vazia? " + pilha.isEmpty());
	}

}
