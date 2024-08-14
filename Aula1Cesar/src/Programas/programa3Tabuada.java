package Programas;
import java.util.Scanner;

public class programa3Tabuada {
	
	public static void main(String[] args) {
		
		int valor;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Entre com um número inteiro");
			valor = scan.nextInt();
			System.out.println("Tabuada do: " + valor);
			
			for (int i=1; i<=10; i++) {
				System.out.println(valor+"x" + i + "=" + (valor*i));
			}
			System.out.println("Deseja continuar? S/N");
		}	while ("S".equalsIgnoreCase(scan.next()));
	}
}
