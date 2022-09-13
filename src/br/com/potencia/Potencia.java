package br.com.potencia;

import javax.swing.JOptionPane;

public class Potencia {
	
	public float potencia(int numA, int numB ) {
		
		int resp = 0;
		int cont = 0;
		
		for(int i = 1; i <= numB-2; i++) {		
			if(cont < 1 ) {
				resp = numA * numA;
				cont ++;
			}
			resp = resp * numA;
		}
		
		JOptionPane.showInputDialog(null, "O Resultado é: " + resp);
		
		return numA;
		
	}
}
