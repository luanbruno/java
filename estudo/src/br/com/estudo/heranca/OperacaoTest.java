package br.com.estudo.heranca;


public class OperacaoTest {
	
	//com plimofismo
	public static void calcule(OperacaoMatematica o, double x, double y){
		System.out.println(o.calcular(x, y));		
	}
	//sem polimofismo
	public static void calculeSem(String o, double x, double y){
		if(o.equals("Soma")){
			System.out.println(x+y);
		} else if(o.equals("Mutiplicacao")){
			System.out.println(x*y);
		}				
	}
	//como subtistui expressoes  codicionais por polimofismo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcule(new Soma(), 5, 5);
		calcule(new Mutiplicacao(), 5,5);
		calculeSem("Soma", 5, 4);
		calculeSem("Mutiplicacao", 5, 4);
	}

}
