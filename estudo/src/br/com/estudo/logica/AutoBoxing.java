package br.com.estudo.logica;
public class AutoBoxing {

	public static void main(String[]  gs){
		
		Integer x = 555;
		x++;
		System.out.println(x);
		
		//x.intValue();
		
		Boolean v = new Boolean("True");
		if(v){
			System.out.println(v);
		}

	}
}