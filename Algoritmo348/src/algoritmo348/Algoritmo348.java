package algoritmo348;

import java.util.Scanner;

public class Algoritmo348 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[5];
		double[] pr1 = new double[5];
		double[] pr2 = new double[5];
		double[] media = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "º aluno: ");
			nomes[i] = sc.nextLine();
			System.out.println("Digite a primeira nota: ");
			pr1[i] = sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			pr2[i] = sc.nextDouble();
			media[i] = (pr1[i] + pr2[i]) / 2;
			sc.nextLine();
		}

		System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + " - " + nomes[i] + ": " + pr1[i] + ", " + pr2[i] + ", " + media[i]);
		}

		sc.close();

	}

}
