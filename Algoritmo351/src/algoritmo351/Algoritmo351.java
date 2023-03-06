package algoritmo351;

import java.util.Scanner;

public class Algoritmo351 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[5];

		for (int l = 0; l < 5; l++) {
			System.out.println("nome " + (l + 1 )+ " : ");
			nomes[l] = sc.nextLine();

		}

		System.out.println("Digite o numero da pessoa: ");
		int num = sc.nextInt();

		while (num < 1 || num > 5) {
			System.out.println("Numero fora do intervalo");
			System.out.println("Digite o nome da pessoa");
			num = sc.nextInt();
		}
		System.out.println(nomes[num - 1]);

		sc.close();
	}

}
