package br.com.calculadora;

import javax.swing.JOptionPane;

import br.com.facaescolha.FacaEscolha;
import br.com.fazconta.FazConta;
import br.com.numeropar.NumeroPar;
import br.com.potencia.Potencia;
import br.com.raizquadrada.RaizQuadrada;

public class calcula {

	public static void main(String[] args) {

		FacaEscolha escolheu = new FacaEscolha();

		int fazDenovo = 1;

		while (fazDenovo != 2) {

			String opcao;

			opcao = JOptionPane.showInputDialog("Escolha uma opção:" + "\n1 - Soma;" + "\n2 - Subtração;"
					+ "\n3 - Multiplicação;" + "\n4 - Divisão;" + "\n5 - Porcentagem;" + "\n6 - Numero Par;"
					+ "\n7 - Raiz Quadrada;" + "\n8 - Potencia;");

			int opcaoSelecionada = Integer.parseInt(opcao);

			if (opcaoSelecionada != 6 && opcaoSelecionada != 7) {

				String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero:");
				int num1 = Integer.parseInt(primeiroNumero);

				String segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero:");
				int num2 = Integer.parseInt(segundoNumero);

				FazConta fazConta = new FazConta();
				fazDenovo = fazConta.facaEssaConta(num1, num2, opcaoSelecionada);
			}

			switch (opcaoSelecionada) {
			case 6:
				NumeroPar numero = new NumeroPar();
				String verificaNum = JOptionPane.showInputDialog("Digite o numero: ");
				boolean ePar = numero.numeroPar(Integer.parseInt(verificaNum));

				if (ePar) {
					JOptionPane.showInputDialog("O numero é Par");
				} else {
					JOptionPane.showInputDialog("O não numero é Par");
				}
				fazDenovo = escolheu.facasuaescolha();
				break;

			case 7:
				RaizQuadrada raizQuadrada = new RaizQuadrada();
				String raiz = JOptionPane.showInputDialog("Digite o numero: ");
				int calculaRaiz = Integer.parseInt(raiz);
				raizQuadrada.raizQuadrada(calculaRaiz);
				fazDenovo = escolheu.facasuaescolha();
				break;

			}
		}

		JOptionPane.showInputDialog("Você e de mais cara, até mais!");
	}

}
