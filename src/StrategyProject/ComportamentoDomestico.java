package StrategyProject;

public class ComportamentoDomestico implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}

	@Override
	public void falar() {
		System.out.println("falando normalmente...");
	}

	@Override
	public void atirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lavar() {
		System.out.println("lavando Roupas...");
		
	}

	@Override
	public void passar() {
		System.out.println("passando roupas...");
		
	}

	@Override
	public void dobrar() {
		System.out.println("dobrando roupas...");
		
	}

	@Override
	public void guardar() {
		System.out.println("guardando roupas...");
		
	}
	
	
	

}
