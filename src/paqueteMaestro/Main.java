package paqueteMaestro;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Buenos días Ceinmark, soy Angel Trueba");
		
		System.out.println("Introduce un número para averiguar si es primo o no:");
		
		int p = Integer.parseInt(sc.nextLine());
		
		if ((p%2) == 0) {
			System.out.println("El numero es prime");
		} else {
			System.out.println("El numero no es primo");
		}
		
	}
}
