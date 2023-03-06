package algoritmo358;

import java.util.Scanner;

public class Algoritmo358 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] precocompra = new double[100];
		double[] precovenda = new double[100];

		int totlucromenor10 = 0;
		int totlucromenor20 = 0;
		int totlucromaior20 = 0;

		for (int a = 0; a < 100; a++) {
			System.out.println("Preço de compra: ");
			precocompra[a] = sc.nextDouble();
			System.out.println("Preço de venda: ");
			precovenda[a] = sc.nextDouble();
		}
		for (int a = 0; a < 100; a++) {
			double lucro = precovenda[a] - precocompra[a];
			if (lucro < 10.0) {
				totlucromenor10++;
			} else {
				if (lucro <= 20.0) {
					totlucromenor20++;
				} else {
					totlucromaior20++;
				}
			}
		}
		System.out.println("total de mercadorias com lucro < 10%: " + totlucromenor10);
		System.out.println("total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
		System.out.println("ntotal de mercadorias com lucro > 20%: " + totlucromaior20);

		sc.close();
	}

}
