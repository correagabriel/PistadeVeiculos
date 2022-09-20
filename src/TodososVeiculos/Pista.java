package TodososVeiculos;

public class Pista {
	
public static void main(String[] args) {
		
		Carro corsa = new Carro();
			corsa.setChassi("4532567");
		
		Moto shineray = new Moto();
			shineray.setChassi("6754358");
		
		Veiculo geral = corsa;
			geral.ligar();
			
			
		System.out.println(shineray.getChassi());
		System.out.println(corsa.getChassi());
	}

}
