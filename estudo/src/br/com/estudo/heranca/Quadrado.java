package br.com.estudo.heranca;

public class Quadrado implements AreaCalculavel {

	double
 ado;
	public Quadrado(double lado) {
		this.lado = lado;// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

}
