package br.com.estudo.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematica m = new Matematica();
		int raiz = m.raiz(276);
		System.out.println(raiz);
		
		System.out.println(Math.sqrt(276)); 
		
		
		/*
		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		double so = m.soma(par,impar );
		System.out.println(so);		
		 * int ma = m.maior(10, 20); System.out.println(ma); double so =
		 * m.soma(10,20); System.out.println(so);
		 */
		System.out.println(m.media(5));
		System.out.println(m.media(5,3));
		System.out.println(m.media("50","30"));
		System.out.println(m.media(5,4,8,7,9,5,1,2,3,5));
	}
}
