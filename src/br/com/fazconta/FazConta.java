package br.com.fazconta;

import javax.swing.JOptionPane;

import br.com.divisao.Divisao;
import br.com.facaescolha.FacaEscolha;
import br.com.multiplica.Multiplica;
import br.com.porcentagem.Porcetagem;
import br.com.soma.Soma;
import br.com.subtrai.Subtrai;

public class FazConta {

	public int facaEssaConta(int num1, int num2, int opcaoSelecionada) {
		
		FacaEscolha escolheu = new FacaEscolha();

		switch (opcaoSelecionada) {
		case 1:
			Soma soma = new Soma();
			String converteR1 = Double.toString(soma.soma(num1, num2));
			JOptionPane.showInputDialog(null,"O Resultado é: " + converteR1);
			return escolheu.facasuaescolha();
		case 2:
			Subtrai subtrai = new Subtrai();
			String converteR2 = Double.toString(subtrai.subtrai(num1, num2));
			JOptionPane.showInputDialog(null,"O Resultado é: " + converteR2);
			return escolheu.facasuaescolha();
		case 3:
			Multiplica multiplica = new Multiplica();
			String converteR3 = Double.toString(multiplica.multiplica(num1, num2));
			JOptionPane.showInputDialog(null,"O Resultado é: " + converteR3);
			return escolheu.facasuaescolha();
		case 4:
			Divisao divisao = new Divisao();
			String converteR4 = Double.toString(divisao.divisao(num1, num2));
			JOptionPane.showInputDialog(null,"O Resultado é: " + converteR4);
			return escolheu.facasuaescolha();
		case 5:
			Porcetagem porcentagem = new Porcetagem();
			String converteR5 = Double.toString(porcentagem.porcentagem(num1, num2));
			JOptionPane.showInputDialog(null,"O Resultado é: " + converteR5);
			return escolheu.facasuaescolha();
		default:
			return opcaoSelecionada;
		}

	}
}
