package iniciante;

import java.util.Scanner;

public class Exercicio1001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("X = " + soma);

	}

}
