package Polimorfismo;

public class Transporte {

	private int capacidade;

	public Transporte(int capacidade) {
		this.capacidade = capacidade;
	}

    public Transporte() {	
    	
    }
	public void visualizar() {
		System.out.println("\n\n************************************************************");
		System.out.println("Dados do Meio de Transporte:");
		System.out.println("****************************************************************");
		System.out.println("Capacidade (número de passageiros: " + this.capacidade);	
	}
}