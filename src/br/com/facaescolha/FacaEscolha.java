package br.com.facaescolha;

import javax.swing.JOptionPane;

public class FacaEscolha {

	public int facasuaescolha() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja fazer outra Conta ?" + "\n1 - Sim" + "\n2 - Não"));
	}
}
