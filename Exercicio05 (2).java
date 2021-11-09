package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	double notaFinal, nota1, nota2, nota3;
	int p1 = 2, p2 = 3, p3 = 5;
	
		System.out.println("Nota 2: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Nota 3: ");
		nota3 = leia.nextDouble();
		
		notaFinal = ((p1 * nota1) + (p2 * nota2) + (p3 * nota3)) / (p1 + p2 + p3);
		System.out.println("Nota Final: " + notaFinal);
		
		leia.close();
	}
}