import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        Set<Integer> comuns = new HashSet<>();

        System.out.println("Digite 10 números para o primeiro conjunto:");
        for (int i = 0; i < 10; i++) {
            conjunto1.add(scanner.nextInt());
        }

        System.out.println("Digite 20 números para o segundo conjunto:");
        for (int i = 0; i < 20; i++) {
            conjunto2.add(scanner.nextInt());
        }

        for (int num : conjunto1) {
            if (conjunto2.contains(num)) {
                comuns.add(num);
            }
        }

        System.out.println("Elementos comuns entre os conjuntos:");
        for (int num : comuns) {
            System.out.println(num);
        }

        scanner.close();
    }
}