package br.com.estudo.logica;
public class Desafio{ // fibronacci

	public static void main tring[] args){
		
		int anterior = 0;
		int proximo = 1;
		System.out.println(anterior);
		
		while(proximo < 50){
		System.out.println(proximo);		
		proximo = proximo + anterior; // proximo numero fibonacci
		anterior = proximo - anterior; // atualizando o numero anterior
		}
	}
}