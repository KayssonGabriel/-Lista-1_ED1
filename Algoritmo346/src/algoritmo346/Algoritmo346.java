package algoritmo346;

import java.util.Scanner;

public class Algoritmo346 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("MENU");
		System.out.println("1 - Imprime o comprimento da frase ");
		System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
		System.out.println("3 - Imprime a frase espelhada");
		System.out.println("4 - Termina o algoritmo");
		System.out.println("OPCAO: ");

		byte op = sc.nextByte();
		sc.nextLine();
		if (op == 1) {
			System.out.println("Digite uma frase: ");
			String frase = sc.nextLine();
			System.out.println("numero de caracteres da frase: " + frase.length());
		} else if (op == 2) {
			System.out.println("Digite uma frase: ");
			String frase = sc.nextLine();
			System.out.println("os dois primeiros caracteres: " + frase.substring(0, 2));
			System.out.println("os dois últimos caracteres: " + frase.substring(frase.length() - 2));
		} else if (op == 3) {
			System.out.println("Digite uma frase: ");
			String frase = sc.nextLine();
			String reverso = new StringBuilder(frase).reverse().toString();
			System.out.println("Frase espelhada: " + reverso);
		} else if (op == 4) {
			System.out.println("Fim do algoritmo");
		} else {
			System.out.println("opção não disponivel");
		}

		System.out.println("\n");

		sc.close();

	}

}
