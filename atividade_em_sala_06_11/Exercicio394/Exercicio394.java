import java.util.Scanner;

public class Exercicio394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[50];
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] medias = new double[50];

        System.out.println("Digite os nomes e as notas dos alunos:");
        for (int i = 0; i < 50; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Nota 1 (peso 3): ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Nota 2 (peso 7): ");
            nota2[i] = scanner.nextDouble();
            medias[i] = (nota1[i] * 3 + nota2[i] * 7) / 10;
        }

        System.out.println("Listagem dos alunos:");
        for (int i = 0; i < 50; i++) {
            System.out.printf("%s - Nota 1: %.2f, Nota 2: %.2f, Média: %.2f%n", nomes[i], nota1[i], nota2[i], medias[i]);
        }

        scanner.close();
    }
}