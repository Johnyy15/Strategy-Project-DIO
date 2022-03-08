package StrategyProject;

public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}

	public void falar() {
		comportamento.falar();
		
	}
	
	public void atirar() {
		comportamento.atirar();
	}

	public void lavar() {
		comportamento.lavar();
		
	}
	
	public void passar() {
		comportamento.passar();
		
	}
	public void dobrar() {
		comportamento.dobrar();
		
	}
	public void guardar() {
		comportamento.guardar();
		
	}
	
}