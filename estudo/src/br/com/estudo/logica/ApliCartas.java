package br.com.estudo.logica;
import java.util.Random;

public class ApliCartas {
	
	public static void main(String[] args) {
	
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();
		
		/* int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];		
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe]; */
		
		//ou dessa forma
		
		String face = faces[r.nextInt(faces.length)];
		String nipe = nipes[r.nextInt(nipes.length)];
		
		String carta = face + " " + nipe;
		System.out.println(carta);
	}

}