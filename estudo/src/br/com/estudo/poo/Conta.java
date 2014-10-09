package br.com.estudo.poo;

public class Conta {

	String cliente;
	double saldo;

	void exibeSaldo() { 		System.out.println(cliente + "seu saldo � " + saldo);
	}

	void saca(double valor) {
		// ver se tem autoriza��o
		// se o limite do dia n�o foi ultrapassado
		// se tem saldo na conta
		// deduzir do saldo o valor do saque
		// atualizar registros do banco
		saldo -= valor;
	}

	void deposita(double valor) {
		saldo += valor;
	}
	void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
}
