package aula_11_abstracao;

public class TesteTriatleta {

    public static void main(String[] args) {

        Triatleta triatleta = new Triatleta("Kelvyn");
        triatleta.aquecer();
        triatleta.nadar();
        triatleta.pedalar();
        triatleta.correr();
        triatleta.cansou();
	}
}
