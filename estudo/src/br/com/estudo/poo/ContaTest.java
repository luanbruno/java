package br.com.estudo.poo;

public class ContaTest {

	public static void main(String[] ar ) {
		// TODO Auto-generated method stub

		Conta conta = new Conta();
		conta.cliente = "Ricardo";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente="Lawrence";
		destino.saldo= 8_000.00;
		destino.exibeSaldo();
		
		
		conta.transferePara(destino, 1550.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
//		conta.saca(1000);
//		conta.exibeSaldo();
//		conta.deposita(6000);
//		conta.exibeSaldo();
	}

}
