package br.com.estudo.logica;
import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {
		
		//"Brasil", "Russia", "India", "China"; lista de paises		
		//1, 3, 5, 7, 9 lista d enumeros inpas
		
		/* int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9; */
		
		String[] paises = {"Brasil", "Russia", "India", "China"};
		//indice = valor
		
		System.out.println(paises[0]);
		paises[0] = "Brazil";
		System.out.println(paises[0]);
		System.out.println(paises.length);
		System.out.println(Arrays.toString(paises));
		
		//pesquisa
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		//ordenar
		
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue());
	}
}