package br.com.estudo.poo;

public class Matematica {
	/** @return raiz quadrada no numero segundo equação pell */
	int raiz(int numero) {
		int raiz = 0, impar = 1;
		while(numero >=impar){
			numero -= impar;
			impar += 2;//priximo numero impar
			++raiz;			
		}
		return raiz;
	}

	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}

	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}
	
	
	double soma(double ... numeros){
		double total = 0;
		for(double n : numeros){
			total += n;
		}
		return total;
	}
	
	
	//sobrecarga
	double media(int x){
		System.out.print("media(int x)");
		return x;
	}
	
	double media(int x, int y){
		System.out.print("media(int x, int y)");
		return (x + y) / 2;
	}
	double media(String x, String y){
		System.out.print("media(String x, String y)");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
	double media(double ... numeros){
		System.out.print("media(int ... numeros)");
		return this.soma(numeros)/numeros.length;
	}
	
}
