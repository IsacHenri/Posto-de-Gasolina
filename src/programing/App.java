package programing;

public class App {

	public static void main(String[] args) {
	    //TIREI A CLASSE POSTO E COLOQUEI SEU METODOS EM ABASTECIMENTO
		Abastecimento abastecimento = new Abastecimento();
		Bomba bomba1 = new Bomba();
		bomba1.num = 1;
	    Bomba bomba2 = new Bomba();
	    bomba2.num = 2;

	    abastecimento.bombas.add(bomba1); 
	    abastecimento.bombas.add(bomba2);
	    
	    Cliente cliente1 = new Cliente("Joaozinho", "122335h"); 

	    Abastecimento abastecimento1 = new Abastecimento(cliente1, Tanque.Etanol, 30, 3.50);
	    Abastecimento abastecimento2 = new Abastecimento(cliente1, Tanque.Gasolina, 40, 5.00);
	    Abastecimento abastecimento3 = new Abastecimento(cliente1, Tanque.Diesel, 20, 3.50);

	    bomba1.adicionarAbastecimento(abastecimento1);
	    bomba2.adicionarAbastecimento(abastecimento2);
	    bomba2.adicionarAbastecimento(abastecimento3);

	    System.out.println("Combustivel mais abastecido na bomba 1: " + bomba1.obterCombustivelMaisAbastecido());
	    System.out.println("Combustivel mais abastecido na bomba 2: " + bomba2.obterCombustivelMaisAbastecido());

	    System.out.println("Bomba mais usada do posto: " + abastecimento.obterBombaMaisUsada());
	}
	}


