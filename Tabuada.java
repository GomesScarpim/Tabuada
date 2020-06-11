import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int numero;
		int continuar;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Informe o número da tabuada: ");
			numero = sc.nextInt();

			for (int i = 0; i <= 10; i++)
				System.out.println(numero + " x " + i + " = " + (numero * i));
			System.out.println("");
			System.out.println("Deseja continuar com sistema?(1)Sim ou (0)Não: ");
			continuar = sc.nextInt();

		} while (continuar > 0);
		sc.close();

	}
}
