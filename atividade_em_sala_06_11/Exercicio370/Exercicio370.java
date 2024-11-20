import java.util.HashMap;
import java.util.Scanner;

public class Exercicio370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> voos = new HashMap<>();
        
        System.out.print("Digite o número de voos disponíveis: ");
        int numeroVoos = scanner.nextInt();
        for (int i = 0; i < numeroVoos; i++) {
            System.out.print("Número do voo: ");
            int numeroVoo = scanner.nextInt();
            System.out.print("Quantidade de lugares disponíveis: ");
            int lugares = scanner.nextInt();
            voos.put(numeroVoo, lugares);
        }
        
        System.out.println("Digite os pedidos de reserva (999 para encerrar):");
        while (true) {
            System.out.print("Número de identidade do cliente: ");
            int identidade = scanner.nextInt();
            if (identidade == 999) break;

            System.out.print("Número do voo desejado: ");
            int numeroVoo = scanner.nextInt();

            if (voos.containsKey(numeroVoo)) {
                int lugaresDisponiveis = voos.get(numeroVoo);
                if (lugaresDisponiveis > 0) {
                    voos.put(numeroVoo, lugaresDisponiveis - 1);
                    System.out.println("Reserva confirmada para identidade " + identidade + " no voo " + numeroVoo);
                } else {
                    System.out.println("Voo " + numeroVoo + " sem lugares disponíveis.");
                }
            } else {
                System.out.println("Voo " + numeroVoo + " não encontrado.");
            }
        }

        scanner.close();
    }
}