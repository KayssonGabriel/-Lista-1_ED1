package algoritmo360;

import java.util.Scanner;

public class Algoritmo360 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ultdia = new int[4];
		String[] signo = new String[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("digite signo: ");
			signo[i] = sc.nextLine();
			System.out.println("digite ultimo dia: ");
			ultdia[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("digite data no formato ddmm ou 9999 para terminar: ");
		int data = sc.nextInt();
		sc.nextLine();

		while (data != 9999) {
			int dia = data / 100;
			int mes = data % 100;
			mes--;
			if (dia > ultdia[mes]) {
				mes = (mes + 1) % 12;
			}
			System.out.println("signo: " + signo[mes] + "\n");
			System.out.println("digite data no formato ddmm ou 9999 para terminar: ");
			data = sc.nextInt();
		}

		sc.close();

	}

}
