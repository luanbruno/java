package br.com.estudo.logica;
public class BreCom {

	public static void main(String[] args){
	
	 oolean[][] matrix = 
		{
			{false, true, false, false, false},
			{false, false, false, false, false}
		};
	busca:
	for(int a=0; a <matrix.length; a++){
		System.out.print("A ");
		for(int b=0; b <matrix[a].length; b++){
			if(matrix[a][b]) {
				System.out.print("True ");
				continue busca;
			}
			System.out.print("B ");
		}		
	}
	
	}
}