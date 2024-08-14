package Programas;
import java.util.Scanner;

public class programa2Scanner {
	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner (System.in);
		System.out.println("Entre com a idade:");
		idade = scan.nextInt();
		if (idade>=18) {
			System.out.println("Maior de idade!");
		}else {
			System.out.println("Menor de idade!");
		}
	}
}
