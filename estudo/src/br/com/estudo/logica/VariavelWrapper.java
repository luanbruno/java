package br.com.estudo.logica;
public class VariavelWrapper {
	
	public stat  void main(String[] args) {
		
		//Integer idade = new Integer(31);
		Double preco = new Double("12.45");
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();		
		Boolean casado = new Boolean("true");
		
		// conversao estatica
		double d1 = Double.parseDouble("12.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		int i2 = Integer.valueOf("101011", 2);
		System.out.println(i2);
		
		
		
	}
}