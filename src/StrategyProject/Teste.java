package StrategyProject;

public class Teste {

	public static void main(String[] args) {
		
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento militar = new ComportamentoMilitar();
		Comportamento domestico = new ComportamentoDomestico();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.falar();
		robo.atirar();
		robo.lavar();
		robo.passar();
		robo.dobrar();
		robo.guardar();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.falar();
		robo.atirar();
		robo.lavar();
		robo.passar();
		robo.dobrar();
		robo.guardar();
		robo.setComportamento(militar);
		robo.mover();
		robo.falar();
		robo.atirar();
		robo.lavar();
		robo.passar();
		robo.dobrar();
		robo.guardar();
		robo.setComportamento(domestico);
		robo.mover();
		robo.falar();
		robo.atirar();
		robo.lavar();
		robo.passar();
		robo.dobrar();
		robo.guardar();
	}

}
