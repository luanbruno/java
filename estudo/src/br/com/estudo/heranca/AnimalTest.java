package br.com.estudo.heranca;

	
public class AnimalTest {
 //com polimofismo
	public static void barulho(Animal animal){
		animal.fazerBarulho();
	}
	//sem polimofismo
	public static void barulhoSem(String animal){
		if(animal.equals("Cachorro")){
			System.out.println("Au, AU!!");
			} else if(animal.equals("Galinha")){
				System.out.println("Có, Có!!");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Animal generico = new Animal(0, null);
	Animal toto = new Cachorro();
	toto.comida = "Carne";
	toto.dormi();
	
	Animal carijo = new Galinha();
	carijo.dormi();
	
	
	System.out.println(toto instanceof Cachorro);
	System.out.println(toto instanceof Animal);
	//sem polimofismo
	//generico.fazerBarulho();
	toto.fazerBarulho();
	carijo.fazerBarulho();
			//com polimofismo
	barulho(toto);
	barulho(carijo);
	//polimofismo
	barulhoSem("Cachorro");
	barulhoSem("Galinha");

	}
	
	

}
