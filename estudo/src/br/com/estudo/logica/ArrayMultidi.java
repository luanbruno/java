package br.com.estudo.logica;
public class ArrayMultidi {

	public static void main(String[] args) {
	
		String[] uma = {"Ricardo", "Sandra"};// array com uma dimenção
		System.out.println(uma[0]); //recupera o array
		
		String[][] duas = {
		{"Ricardo", "M", "DF"}, 
		{"Sandra", "F", "MG"}}; // array com dua dimenção
		System.out.println(duas[0][0]); //recuperar ricardo
		System.out.println(duas[1][0]); //recuperar sandra
		as
		duas[1][0] = "SANDRA";
		
		System.out.println(duas[1][0]);
		System.out.println(duas.length); // quantos elementos tem no array
		System.out.println(duas[0].length); //quantos elementos tem dentro do array interno
		
		
	}

}
