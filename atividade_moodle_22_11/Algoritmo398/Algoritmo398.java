
import java.util.*;

public class Algoritmo398 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] codigo = new int[50];
        int[] estoque = new int[50];
        double[] preco = new double[50];
        int count = 0;

        // Cadastro de produtos
        while (true) {
            System.out.print("Digite o código do produto (-1 para encerrar): ");
            int cod = scanner.nextInt();
            if (cod == -1) break;
            System.out.print("Digite a quantidade em estoque: ");
            int qtd = scanner.nextInt();
            System.out.print("Digite o preço de venda: ");
            double precoVenda = scanner.nextDouble();

            codigo[count] = cod;
            estoque[count] = qtd;
            preco[count] = precoVenda;
            count++;
        }

        double totalVendido = 0;

        // Venda de produtos
        while (true) {
            System.out.print("Digite o código do produto para venda (0 para encerrar): ");
            int codVenda = scanner.nextInt();
            if (codVenda == 0) break;

            int index = -1;
            for (int i = 0; i < count; i++) {
                if (codigo[i] == codVenda) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Produto não cadastrado.");
            } else {
                System.out.print("Digite a quantidade requerida: ");
                int qtdVenda = scanner.nextInt();
                if (estoque[index] >= qtdVenda) {
                    estoque[index] -= qtdVenda;
                    totalVendido += qtdVenda * preco[index];
                    System.out.println("Venda realizada com sucesso.");
                } else {
                    System.out.println("Estoque insuficiente.");
                }
            }
        }

        // Listagem final
        System.out.println("Total vendido no dia: " + totalVendido);
        System.out.println("Estoque final:");
        for (int i = 0; i < count; i++) {
            System.out.printf("Código: %d - Estoque: %d - Preço: %.2f%n", codigo[i], estoque[i], preco[i]);
        }
        scanner.close();
    }
}
