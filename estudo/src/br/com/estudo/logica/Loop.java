package br.com.estudo.logica;
import java.util.ArrayList;

public class Loop {
	//fluxo de repetição
	public static void main(String[] args){
	
		String texto= "";
		for(int i=0; i<20; i++) {
			if(i % 2 == 0){
			texto += i + ",";
			}		
		}
		System.out.println(texto);
		int tamanho = 12;
		for(int x = 0; x<tamanho; x++){
			for(int y = 0; y<tamanho; y++){
				System.out.print("* ");
			}
			System.out.println();
		}
		//foreach for aprimorado
		//antiga
		int[] pares = {2,4,6,8};
		for(int i=0; i<pares.length; i++){
			int par = pares[i];
			System.out.println(par);		
		}
		//aprimorado
		for(int par : pares){
			System.out.println(par);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int w= 0; w<10; w++){
			list.add(w);
		}
		
		for(Integer numero : list){
			System.out.println(numero);
		}
		
		
	}
}