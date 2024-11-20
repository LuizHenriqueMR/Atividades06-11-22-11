
import java.util.Scanner;

public class Algoritmo351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um número (1 a 5) para buscar o nome correspondente: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 5) {
            System.out.println("Nome correspondente: " + nomes[numero - 1]);
        } else {
            System.out.println("Número inválido.");
        }
        scanner.close();
    }
}
