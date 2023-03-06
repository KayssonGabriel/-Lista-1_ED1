package algoritmo356;

import java.util.Scanner;

public class Algoritmo356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] media = new double[15];
		String[] nomes = new String[15];
		String[] sit = new String[15];
		double[] pr1 = new double[15];
		double[] pr2 = new double[15];

		for (int l = 0; l < 15; l++) {
			System.out.println("\n Digite " + (l + 1) + " nome : ");
			nomes[l] = sc.nextLine();
			while (nomes[l].length() > 30) {
				System.out.println("Nomes com ate 30 caracteres");
				System.out.println("\n Digite " + (l + 1) + "nome: ");
				nomes[l] = sc.nextLine();
			}

			System.out.println("digite 1 nota: ");
			pr1[l] = sc.nextDouble();
			System.out.println("digite 2 nota: ");
			pr2[l] = sc.nextDouble();
			media[l] = (pr1[l] + pr2[l]) / 2.0;

			media[l] = Math.round(media[l] * 10.0) / 10.0;

			if (media[l] >= 6.0) {
				sit[l] = "AP";
			} else {
				sit[l] = "RP";
			}

			sc.nextLine();
		}

		System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
		for (int l = 0; l < 15; l++) {
			System.out.println(
					(l + 1) + "- " + nomes[l] + "\t" + pr1[l] + "\t" + pr2[l] + "\t" + media[l] + "\t" + sit[l]);
		}

		sc.close();
	}

}
