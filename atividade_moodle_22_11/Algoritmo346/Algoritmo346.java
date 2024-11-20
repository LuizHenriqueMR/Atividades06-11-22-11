import java.util.Scanner;

public class Algoritmo346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        
        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();
        
        int opcao;
        do {
            System.out.println("MENU:");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Encerrar");
            System.out.print("OPÇÃO: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Comprimento: " + frase.length());
                    break;
                case 2:
                    if (frase.length() >= 2) {
                        System.out.println("Primeiros caracteres: " + frase.substring(0, 2));
                        System.out.println("Últimos caracteres: " + frase.substring(frase.length() - 2));
                    } else {
                        System.out.println("Frase muito curta.");
                    }
                    break;
                case 3:
                    StringBuilder espelhada = new StringBuilder(frase);
                    System.out.println("Frase espelhada: " + espelhada.reverse().toString());
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        scanner.close();
    }
}
