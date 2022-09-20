package TodososVeiculos;

public class Moto extends Veiculo{
	
	public void ligar () {
		conferirCambio();
		conferirCombustivel();
		System.out.println("Moto Ligado");
	}
	
	private void conferirCambio () {
		System.out.println("1 2 3 - Conferindo o Cambio");
	}
	
	private void conferirCombustivel() {
		System.out.println("1 2 3 - Conferidno o Combustivel");
	}
	
}
