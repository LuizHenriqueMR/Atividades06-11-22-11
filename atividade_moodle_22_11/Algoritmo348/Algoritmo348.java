
import java.util.Scanner;

public class Algoritmo348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a primeira nota: ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        System.out.println("Listagem de alunos:");
        for (int i = 0; i < 5; i++) {
            double media = (nota1[i] + nota2[i]) / 2;
            System.out.printf("Nome: %s - Nota 1: %.2f - Nota 2: %.2f - Média: %.2f%n", nomes[i], nota1[i], nota2[i], media);
        }
        scanner.close();
    }
}
