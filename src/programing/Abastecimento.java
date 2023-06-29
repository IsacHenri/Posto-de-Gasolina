package programing;

import java.util.ArrayList;

public class Abastecimento {
	Cliente cliente;
	int litro;
	Tanque combustivel;
	Double preco;
	ArrayList<Bomba> bombas;

	public Abastecimento(Cliente cliente, Tanque combustivel, int d, double i) {
		super();
		this.cliente = cliente;
		this.combustivel = combustivel;
		this.litro = d;
		this.preco = i;
	}
	
	// Retornando o valor total gasto
	public double ValorTotal() {
        return litro * preco;
    }
	

	//Adicionando bombas em Abastecimento
    public Abastecimento() {
        bombas = new ArrayList<Bomba>();
    }


    public Bomba obterBombaMaisUsada() {
        Bomba bombaMaisUsada = null;
        int maiorNumeroDeAbastecimentos = 0;

        // Verificando qual é a bomba que tem o maior abastecimento
        for (Bomba bomba : bombas) {
        	// criando uma variavel pra armazernar os abastecimentos de cada bomba, primeiro a n1,n2..
            int numeroDeAbastecimentos = bomba.obterNumeroDeAbastecimentos();
            if (numeroDeAbastecimentos > maiorNumeroDeAbastecimentos) {
                maiorNumeroDeAbastecimentos = numeroDeAbastecimentos; // ele armazena o primeiro valor inserido por ser maior q 0 mas dai ele percorre todo o array pra saber o maior
                bombaMaisUsada = bomba; // Retornara a bomba que teve o maior numero de abastecimentos
            }
        }
        return bombaMaisUsada;
    }


	@Override
	public String toString() {
		return "[Abastecimento [cliente=" + cliente + ", litro=" + litro + ", combustivel=" + combustivel + ", preco="
				+ preco + "]\n";
	}
    
	
	
}
