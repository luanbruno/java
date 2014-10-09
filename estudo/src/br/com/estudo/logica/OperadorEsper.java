package br.com.estudo.logica;
import java.util.Scanner;

public class OperadorEsper {
	public static void main(String[] args) {
		
		/* int idade = 26;
		String x;
		x = idade >= 18 ? "Maior de Idade" : "Menor de idade";
		
		String sexo = "M", pais = "Brasil";
				
		System.out.println(x); */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o raio");
		
		double raio = s.nextDouble();
		
		
		
		//Diametro : 2r
		//double raio = 10;
		double diametro = 2 * raio;
		System.out.println("Dianmetro = "+diametro);
		
		//circuferencia : 2 PI r
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;		
		System.out.println("Circuferencia = "+circuferencia);
		
		//area : PI r2
		double area = pi * (raio * raio);		
		System.out.println("Area = "+area);
		
	}

}