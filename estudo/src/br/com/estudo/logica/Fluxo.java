package br.com.estudo.logica;
public class Fluxo {
	
	public static void main(String[] args){
	
	int idade = 15;
	if(idade <= 11) {
		System.out.println("Criança");
	} else if (idade > 11 && idade <=18){
		System.out.println("adolecente");	
	} else if (idade > 18 && idade <=60){
		System.out.println("adulto");	
	} else {
		System.out.println("Melhor idade");	
	}
	
	int nota = 4;
	
	if (nota >= 7){
		System.out.println("passou");	
	} else {
		System.out.println("Reprovou");
		if(nota >=6) {
				System.out.println("mais pode fazer recuperação");
			} else {
				System.out.println("nao pode fazer recuperação");
			}
		}
	
	
	
	int numero = 21;
	if((numero % 2) == 0){
		System.out.println("par");
	} else {
		System.out.println("impar");
	}
	}
}