package br.com.estudo.logica;
import javax.swing.JOptionPane;

/** 
	* Calcular o indicer de massa corporal
	* IMC  = presoEMQuilogramas / (alturarEmMetros * alturarEmMetros)
 */

public class IMC {
	
	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Digite seu peso em Quilograma?");
		String altura = JOptionPane.showInputDialog("Digite sua altura em metros?");

		double pesoEmQuilograma = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilograma / (alturaEmMetros *alturaEmMetros);
		
		String msg = (imc >= 20 && imc < 25) ? "Peso Ideal" : "Fora do peso Ideal";
					/*  (imc >= 25 && imc < 30) ? "Sobrepeso" ||
					 (imc >= 30 && imc < 35) ? "Obesidade Moderada" ||
					 (imc >= 35 && imc < 40) ? "Obseidade Severa" ||
					 (imc >= 40 && imc < 50) ? "Obesidade Morbida" ||
					 (imc >= 50) ? "Super-Obesidade" ||
					 (imc < 20) ? "Abaixo do peso"; */
		
		msg = "IMC = " + imc + "\n" + msg; 
		
		JOptionPane.showMessageDialog(null, msg);
		System.out.println("IMC = " + imc);
		System.out.println(msg);
	}

}