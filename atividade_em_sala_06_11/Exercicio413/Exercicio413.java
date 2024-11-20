import java.util.Scanner;

public class Exercicio413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somaQuadradosImpares = 0;

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (j > 4 - i && matriz[i][j] % 2 != 0) {
                    somaQuadradosImpares += Math.pow(matriz[i][j], 2);
                }
            }
        }

        System.out.println("Matriz completa:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "	");
            }
            System.out.println();
        }

        double resultado = Math.sqrt(somaQuadradosImpares);
        System.out.println("Raiz quadrada da soma dos quadrados dos números ímpares abaixo da diagonal secundária: " + resultado);

        scanner.close();
    }
}