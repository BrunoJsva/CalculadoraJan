package br.com.calculadora;

import javax.swing.JOptionPane;

import br.com.fazconta.FazConta;

public class calcula {

	public static void main(String[] args) {
		
		int fazDenovo = 1;
		
		while (fazDenovo != 2) {
			
			String opcao;

			opcao = JOptionPane.showInputDialog("Escolha uma opção:" + "\n1 - Soma;" + "\n2 - Subtração;"
					+ "\n3 - Multiplicação;" + "\n4 - Divisão;" + "\n5 - Porcentagem;" + "\n6 - Numero Par;");

			int opcaoSelecionada = Integer.parseInt(opcao);

			String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero:");
			int num1 = Integer.parseInt(primeiroNumero);

			String segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero:");
			int num2 = Integer.parseInt(segundoNumero);

			FazConta fazConta = new FazConta();
			fazDenovo = fazConta.facaEssaConta(num1, num2, opcaoSelecionada);
		}

		JOptionPane.showInputDialog("Você e de mais cara, até mais!");
	}

}
