import java.util.*;

public class Algoritmo400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quarto[] quartos = new Quarto[50];
        int count = 0;

        while (true) {
            System.out.println("Menu do Hotel:");
            System.out.println("1. Cadastrar Quartos");
            System.out.println("2. Listar Todos os Quartos");
            System.out.println("3. Listar Quartos Ocupados");
            System.out.println("4. Alugar/Reservar Quarto");
            System.out.println("5. Adicionar Despesas Extras");
            System.out.println("6. Calcular Total a Pagar");
            System.out.println("7. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 7) break;

            switch (opcao) {
                case 1:
                    if (count < 50) {
                        System.out.print("Digite o número de leitos: ");
                        int leitos = scanner.nextInt();
                        System.out.print("Digite o preço por diária: ");
                        double preco = scanner.nextDouble();
                        quartos[count++] = new Quarto(leitos, preco, "Livre");
                    } else {
                        System.out.println("Capacidade máxima atingida.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.printf("Quarto %d - Leitos: %d - Preço: %.2f - Situação: %s%n", i + 1, quartos[i].leitos, quartos[i].preco, quartos[i].situacao);
                    }
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        if (!quartos[i].situacao.equals("Livre")) {
                            System.out.printf("Quarto %d - Situação: %s%n", i + 1, quartos[i].situacao);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o número do quarto para alugar/reservar: ");
                    int numQuarto = scanner.nextInt() - 1;
                    if (numQuarto >= 0 && numQuarto < count) {
                        if (quartos[numQuarto].situacao.equals("Livre")) {
                            System.out.print("Quantos dias deseja ficar? ");
                            int dias = scanner.nextInt();
                            quartos[numQuarto].diasHospedagem = dias;
                            quartos[numQuarto].situacao = "Alugado";
                        } else {
                            System.out.println("Quarto não disponível.");
                        }
                    } else {
                        System.out.println("Número de quarto inválido.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o número do quarto para adicionar despesas: ");
                    int numDesp = scanner.nextInt() - 1;
                    if (numDesp >= 0 && numDesp < count) {
                        System.out.print("Digite o valor das despesas: ");
                        quartos[numDesp].despesasExtras += scanner.nextDouble();
                    } else {
                        System.out.println("Número de quarto inválido.");
                    }
                    break;
                case 6:
                    System.out.print("Digite o número do quarto para calcular o total: ");
                    int numCalc = scanner.nextInt() - 1;
                    if (numCalc >= 0 && numCalc < count) {
                        double total = (quartos[numCalc].preco * quartos[numCalc].diasHospedagem) + quartos[numCalc].despesasExtras;
                        System.out.printf("Total a pagar pelo quarto %d: %.2f%n", numCalc + 1, total);
                    } else {
                        System.out.println("Número de quarto inválido.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
