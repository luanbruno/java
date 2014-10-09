package br.com.estudo.heranca;

public abstract class Animal {
	
	
	protected int serial;
	doubl peso;
	String comida;
	
	public Animal(double peso, String comida){
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormi(){System.out.println("Dormiu");}
	//usando class abstrata
	abstract void fazerBarulho();
}
