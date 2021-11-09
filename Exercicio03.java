package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int evento, horas, minutos, segundos;
		
		System.out.println("Qual o tempo de duração do seu evento em Segundos: ");
		evento = leia.nextInt();
		
		horas = evento / 3600;
		minutos = (evento % 3600) / 60;
		segundos = (minutos % 60);
		
		System.out.println("O evento teve" + horas + " horas, " + minutos + " minutos e " + segundos + " segundos de durção");
		
		leia.close();
		
	}	
}

