package br.com.calculadora;

import javax.swing.JOptionPane;

import br.com.facaescolha.FacaEscolha;
import br.com.fazconta.FazConta;
import br.com.numeropar.NumeroPar;

public class calcula {

	public static void main(String[] args) {

		FacaEscolha escolheu = new FacaEscolha();

		int fazDenovo = 1;

		while (fazDenovo != 2) {

			String opcao;

			opcao = JOptionPane.showInputDialog("Escolha uma opção:" + "\n1 - Soma;" + "\n2 - Subtração;"
					+ "\n3 - Multiplicação;" + "\n4 - Divisão;" + "\n5 - Porcentagem;" + "\n6 - Numero Par;");

			int opcaoSelecionada = Integer.parseInt(opcao);

			if (opcaoSelecionada != 6) {

				String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero:");
				int num1 = Integer.parseInt(primeiroNumero);

				String segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero:");
				int num2 = Integer.parseInt(segundoNumero);

				FazConta fazConta = new FazConta();
				fazDenovo = fazConta.facaEssaConta(num1, num2, opcaoSelecionada);
			} else {
				NumeroPar numero = new NumeroPar();

				String verificaNum = JOptionPane.showInputDialog("Digite o numero: ");
				boolean ePar = numero.numeroPar(Integer.parseInt(verificaNum));

				if (ePar) {
					JOptionPane.showInputDialog("O numero é Par");
				} else {
					JOptionPane.showInputDialog("O não numero é Par");
				}
				fazDenovo = escolheu.facasuaescolha();
			}
		}

		JOptionPane.showInputDialog("Você e de mais cara, até mais!");
	}

}
