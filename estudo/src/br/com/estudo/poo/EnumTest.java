package br.com.estudo.poo;

public class EnumTest {

	public static final double PI = 3.14 
	
	public static void andar(Medida medida, int total){
		if(medida == Medida.M){
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pe�asXadres.BISPO);
		System.out.println(Medida.M.titulo);
		
		for(Medida m : Medida.values()){
			
			System.out.println(m+" : "+m.titulo);
		}
		
		andar(Medida.M,100);
	}

}
