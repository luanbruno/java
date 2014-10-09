package br.com.estudo.logica;
public class FluxoSwi {
	
	public static void main(String[] args) {
	
		char sexo = 'M';
		String tecnologia= "c++";
		
		switch(sexo) {
			case 'M':
				System.out.println("Macho");
				break;
			case 'F':
				System.out.println("Femea");
				break;			
			default:
				System.out.println("outro");
			}
		switch(tecnologia) {
			case "java":
			case "c++":
			case "cobol":
				System.out.println("linguagem d eprogramação");
				break;
			case "oracle":
			case "sqlserve":
			case "postgresql":
				System.out.println("banco de dados");
				break;			
			default:
				System.out.println("tecnologia desconhecida");
			}
	}
}