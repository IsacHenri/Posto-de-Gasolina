package programing;

public class Cliente {
	String nome;
	String placa;
	public Cliente(String nome, String placa) {
		super();
		this.nome = nome;
		this.placa = placa;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", placa=" + placa + "]";
	}
	
	
	
}
