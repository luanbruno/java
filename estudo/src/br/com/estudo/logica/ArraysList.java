package br.com.estudo.logica;
import java.util.ArrayList;

public class ArraysList {
	
	public static void main(String[] args) {
	
	ArrayList<String> cores = new ArrayList<>();
	cores.add("Branco");
	cores.add("Verde");
	cores.add(0, "Vermelho");
	cores.add("Amarelo");
	cores.add("Azul");
	cores.add("Preto");

	System.out.println(cores.toString());
	System.out.println("Tamanho = " + cores.size());
	System.out.println("Ementos = " + cores.get(5));
	System.out.println("Indice Verde = " + cores.indexOf("Verde"));
	
	cores.remove("Preto");
	System.out.println("tem roxo ?" + cores.contains("Verde"));
	
	}
}