package br.com.estudo.logica;
/**
  * apresentar conseitos de variavel
  * @author Luan bruno
  */


public class Variavel {
	
	public static void main(String[] args) {
	
		int idade = 31;
		double preco = 21.45;
		char sexo = 'M';
		boolean casado = true;
	
		
		byte b = 127; //cem
		short s = 32767;//32mil
		int i = 2_000_000_000;//2 bilhões
		long l = 9_000_000_000_000_000_000L;//9 quintilhão
		//IEEE 754
		double d = 1.7976931348623157E+308;
		float f = 123F;
		
		i = s; // cast implicito
		System.out.println(s);
		System.out.println(i);
		
		i =(int) l; // cast explicito
		System.out.println(l);
		System.out.println(i);
		//sistema em binario
		byte bb = 0b01010101; // 8bits / 1 byte
		short ss = 0b0101010101010101;//16 bits / 2 byte
		int ii = 0b01010101010101010101010101010101;//32bits / 4 byte
		
		System.out.println(ii);
	}
}