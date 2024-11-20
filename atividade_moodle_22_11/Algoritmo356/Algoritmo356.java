import java.util.Scanner;

public class Algoritmo356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[15];
        double[] nota1 = new double[15];
        double[] nota2 = new double[15];
        double[] medias = new double[15];
        String[] situacao = new String[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota da PR1: ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Digite a nota da PR2: ");
            nota2[i] = scanner.nextDouble();
            scanner.nextLine(); 
            medias[i] = Math.round((nota1[i] + nota2[i]) / 2);
            situacao[i] = medias[i] >= 6 ? "AP" : "RP";
        }

        System.out.println("Listagem de alunos:");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s%n", "Nome", "Nota PR1", "Nota PR2", "Média", "Situação");
        for (int i = 0; i < 2; i++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-10s%n", nomes[i], nota1[i], nota2[i], medias[i], situacao[i]);
        }
        scanner.close();
    }
}
