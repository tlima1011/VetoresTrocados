package br.com.tlmtech.teste;

import javax.swing.JOptionPane;

public class Vetores_Trocados {

	public static void main(String[] args) {

		// Crie um algoritmo lendo dois vetores (A e B) com cinco elementos cada
		// listando
		// os dois vetores
		// Faça com que os elementos do vetor A passem para o Vetor B, e os elementos
		// do vetor B passe para o A.
		// Mostre os dois vetores atualizados
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		int i, j = 0;

		for (i = 0; i < 5; i++) {
			j++;
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + j + "º numero para A.:"));
		}
		j = 0;
		for (i = 0; i < 5; i++) {
			j++;
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + j + "º numero para B.:"));
		}
		StringBuilder mensagem = new StringBuilder("Valores de A e B - antes da troca:\n");
		for (i = 0; i < 5; i++) {
			mensagem.append("A[" + i + "] = " + a[i] + "   -   B[" + i + "] = " + b[i] + "\n");
		}
		for (i = 0; i < 5; i++) {
			c[i] = a[i];
			a[i] = b[i];
			b[i] = c[i];
		}
		mensagem.append("Valores de A e B - atualizados:\n");
		for (i = 0; i < 5; i++) {
			mensagem.append("A[" + i + "] = " + a[i] + "   -   B[" + i + "] = " + b[i] + "\n");
		}
		JOptionPane.showMessageDialog(null, mensagem);
		System.out.println(mensagem);
	}

}
