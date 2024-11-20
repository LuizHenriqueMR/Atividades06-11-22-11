import java.util.Scanner;

public class Exercicio354 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Listagem dos números:");
        for (int i = 0; i < 15; i++) {
            String tipo = (numeros[i] % 2 == 0) ? "par" : "ímpar";
            System.out.println((i + 1) + ": " + numeros[i] + " - " + tipo);
        }

        scanner.close();
    }
}