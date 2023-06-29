package programing;
import java.util.*;




public class Bomba {
	int num;
	ArrayList<Abastecimento> abastecimentos = new ArrayList<>();
	private int totalEtanol;
    private int totalGasolina;
    private int totalDiesel;
    
    // Adicioanndo ao abastecimentos e aproveitando pra armazenar no total de cada
	public void adicionarAbastecimento(Abastecimento abastecimento) {
        abastecimentos.add(abastecimento);
        
        // switch pra verificar o combustivel abastecido
        switch (abastecimento.combustivel) {
            case Etanol:
                totalEtanol += abastecimento.litro; // adicionando ao totalEtanol o quanto de litro foi comprado desse tipo
                break;
            case Gasolina:
                totalGasolina += abastecimento.litro; // se abastecimento foi de gasolina ele armazenara a quantidade de litros em total Gasolina
                break;
            case Diesel:
                totalDiesel += abastecimento.litro;
                break;
        }
    }
	
	public String obterCombustivelMaisAbastecido() { // Fazendo um if pra verificar qual tem a maior quantidade de litros abastecidos
        if (totalEtanol > totalGasolina && totalEtanol > totalDiesel) {
            return "ETANOL";
        } else if (totalGasolina > totalDiesel) {
            return "GASOLINA";
        } else {
            return "DIESEL";
        }
    }
	 public int obterNumeroDeAbastecimentos() { // obtendo o numero de abastecimentos por metodo inteiro e podendo ter retorno como inteiro
	        return abastecimentos.size();
	    }
	
	@Override
	public String toString() {
		return "Bomba [num=" + num + ", abastecimentos:\n" + abastecimentos + ", totalEtanol=" + totalEtanol
				+ ", totalGasolina=" + totalGasolina + ", totalDiesel=" + totalDiesel + "]";
	}
	
	
	

    
}
	
    

