package br.com.estudo.logica;
import java.util.Scanner;
import java.util.Random;

public class Dado {

	 ivate static Scanner s;

	public static void main(String[] args){
		
		s = new Scanner(System.in);
		System.out.println("Qual o seu palpite??");
		int palpite = s.nextInt();
		
		Random n = new Random();
		int dado = n.nextInt(6)+1;//0 ate 5
		
		System.out.println("Palpite = " + palpite);
		System.out.println("Dado = " + dado);
		
		if(palpite == dado) {
			System.out.println("Acertou");
		} else {
			System.out.println("Errou");
		}
	}
}