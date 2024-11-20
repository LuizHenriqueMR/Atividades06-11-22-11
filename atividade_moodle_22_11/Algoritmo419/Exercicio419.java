import java.util.Scanner;

public class Exercicio419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];
        int[][] diferenca = new int[5][5];

        System.out.println("Digite os elementos da primeira matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                diferenca[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        System.out.println("Matriz diferença:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diferenca[i][j] + "	");
            }
            System.out.println();
        }

        scanner.close();
    }
}