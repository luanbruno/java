package br.com.estudo.logica;
import java.util.ArrayList;
import java.util.Scanner;

public class While {
	///fluxo de repetição while
	public static void main(String[] args){
	
		/* int i = 2;
		int x = 3;		
		while(i<2){ /// 0-n  zero ou n vezes
			System.out.println(i);
			i++;
		};		
		do{ //xecutado 1-n  uma ou amsi vezes
			System.out.println(x);
			x++;
		} while(x<2);		
		for(int i=0; i< 2; i++){ mesma coisa q o exemplo de while
			System.out.println(i);
		}  */
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos : Para sair digite FIM");
		
		String produto;
		
		
		while(!"FIM".equals(produto = s.nextLine())){
			produtos.add(produto);
			
		}
		
		System.out.println(produtos.toString());
	}
}