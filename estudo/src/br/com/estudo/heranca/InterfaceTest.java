package br.com.estudo.heranca;

public class InterfaceTest {
	
	public static void
 rea(AreaCalculavel o){
		System.out.println(o.calculaArea());
	}
	public static void volume(VolumeCalculavel o){
		System.out.println(o.calculaVolume());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area(new Quadrado(2));
		volume(new Cubo(2));
		
	}

}
