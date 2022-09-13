package br.com.raizquadrada;

import javax.swing.JOptionPane;

public class RaizQuadrada {
	
	public double raizQuadrada(int num) {
		double resultado = Math.sqrt(num);
		JOptionPane.showInputDialog(null, "O Resultado é: " + String.format("%.2f", resultado));
		return resultado;
	}
}
