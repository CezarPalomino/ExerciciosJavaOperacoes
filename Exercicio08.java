package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double custoCarro, x1, x2, x3,
		porcentoDistribuidora = 0.28, porcentoImposto = 0.45;
		
		System.out.println("Custo do carro: ");
		custoCarro = leia.nextDouble();
		
		x1 = custoCarro * porcentoDistribuidora;
		x2 = custoCarro * porcentoImposto;
		x3 = custoCarro + x1 + x2;
		
		System.out.println("Custo para o consumidor será de R$ " + x3);
		leia.close();
	}
}
