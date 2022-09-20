package TodososVeiculos;

public class Carro extends Veiculo{

	public void ligar () {
		conferirCambio();
		conferirCombustivel();
		System.out.println("Carro Ligado");
	}
	
	private void conferirCambio () {
		System.out.println("1 2 3 - Conferindo o Cambio");
	}
	
	private void conferirCombustivel() {
		System.out.println("1 2 3 - Conferidno o Combustivel");
	}
}
