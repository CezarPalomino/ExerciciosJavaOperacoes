package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int anos, meses, dias, diasTotal, mesesTotal;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite os anos: ");
		anos = leia.nextInt();

		System.out.println("Digite os meses: ");
		meses = leia.nextInt();

		mesesTotal = (anos * 12) + meses;

		System.out.println("Digite os dias: ");
		dias = leia.nextInt();
		 
		System.out.println("meses: " + meses);
		
		diasTotal = mesesTotal*31 + dias;

		System.out.println("\nVocê tem: " + diasTotal + " dias de vida.");
		
		leia.close();
	}
  }

