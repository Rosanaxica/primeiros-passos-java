package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Olá mundo");

		int idade = 18;
		String nome = "Rosana";
		double nota = 2.0;
		char letra = 'a';

		// if e condicional

		if (idade >= 18) {
			System.out.println(nome + " é maior de idade");

		} else {
			System.out.println(nome + " não é maior");
		}
		// if e condicional &&
		if ((idade >= 16) && (idade < 18)) {
			System.out.println(nome + " pode votar mas não é obrigatório");

		} else {
			System.out.println(nome + " é menor de idade");
		}
		// if e condicional ! negado
		if (!(idade >= 16) && (idade < 18)) {
			System.out.println(nome + " pode votar mas não é obrigatório");

		} else {
			System.out.println(nome + " é menor de idade");
		}
		// For

		for (int i = 0; i < 11; i++) {
			System.out.println("8 * " + i + " = " + 8 * i);

		}
		// While
		int numero = 0;
		while (numero <= 10) {
			System.out.println("8 * " + numero + " = " + 8 * numero);
			numero++;

		}
		int op = 0;
		Scanner scn = new Scanner(System.in);

		do {
			menu();

			op = scn.nextInt();
			if (op > 0 && op < 5) {
				int numeros[] = pegarValorDigitado(scn);
				switch (op) {

				case 1:
					somar(numeros[0], numeros[1]);
					break;
				case 2:
					subtrair(numeros[0], numeros[1]);
					break;
				case 3:
					multiplicar(numeros[0], numeros[1]);
					break;
				case 4:
					dividir(numeros[0], numeros[1]);
					break;

				default:
					System.out.println("Operação Inválida");
					break;
				}
			} else {
				System.out.println("Obrigado, volte sempre");
			}

		} while (op != 5);

	}

	public static void somar(int num1, int num2) {
		System.out.println("O resultado da operação " + num1 + "+" + num2 + "=" + (num1 + num2));

	}

	public static void subtrair(int num1, int num2) {
		System.out.println("O resultado da operação " + num1 + "-" + num2 + "=" + (num1 - num2));

	}

	public static void multiplicar(int num1, int num2) {
		System.out.println("O resultado da operação " + num1 + "*" + num2 + "=" + (num1 * num2));

	}

	public static void dividir(int num1, int num2) {
		System.out.println("O resultado da operação " + num1 + "/" + num2 + "=" + (num1 / num2));

	}

	public static void menu() {
		System.out.println("                                                                  ");
		System.out.println("*************** ******************************** *****************");
		System.out.println("                * Qual opção deseja fazer ???? *                  ");
		System.out.println("*************** ******************************** *****************");
		System.out.println("1  - Somar");
		System.out.println("2  - Subtrair");
		System.out.println("3  - Multiplcar");
		System.out.println("4  - Dividir");
		System.out.println("5  - Sair");

	}

	public static int[] pegarValorDigitado(Scanner scn) {
		int num1, num2;
		System.out.println("Digite um primero numero");
		num1 = scn.nextInt();
		System.out.println("Digite um segundo numero");
		num2 = scn.nextInt();
		return new int[] { num1, num2 };

	}

	public static void matriz(){
		
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int [2][2];		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		/* 00 = 1
		 * 01 = 2
		 * 10 = 3
		 * 11 = 4
		 */
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
}
	
	



