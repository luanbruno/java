package br.com.estudo.logica;
import java.util.Scanner;

public class Entrada {

	@Suppre Warnings("resource")
	public static void main(String[] args) {
		// recuperação dos danos na chamada do programa
		// System.out.println(args[0]);

		// interagindo com o usuario
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu Nome");
		String nome = s.nextLine();
		System.out.println("Bem vindo" + nome);

	}
}