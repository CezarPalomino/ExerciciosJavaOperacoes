package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double x1, x2, y1, y2;
		double a, b, total;
		
		System.out.println("Digite o primeiro valor de X: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o primeiro valor de Y: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor de X: ");
		x2 = leia.nextDouble(); 
		
		System.out.println("Digite o segundo valor de Y: ");
		y2 = leia.nextDouble();
		
		a = Math.pow((x2 - x1), 2);
		b = Math.pow((y2 - y1), 2);
		
		total = Math.sqrt((a + b));
		
		System.out.println("O resultado é: " + total);
		
		leia.close();
	}
}
