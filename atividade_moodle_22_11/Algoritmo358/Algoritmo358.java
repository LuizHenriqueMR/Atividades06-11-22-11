
import java.util.Scanner;

public class Algoritmo358 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];

        int menos10 = 0, entre10e20 = 0, mais20 = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o preço de compra da mercadoria " + (i + 1) + ": ");
            precoCompra[i] = scanner.nextDouble();
            System.out.print("Digite o preço de venda da mercadoria " + (i + 1) + ": ");
            precoVenda[i] = scanner.nextDouble();

            double lucro = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;

            if (lucro < 10) {
                menos10++;
            } else if (lucro <= 20) {
                entre10e20++;
            } else {
                mais20++;
            }
        }

        System.out.println("Mercadorias com lucro < 10%: " + menos10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + mais20);

        scanner.close();
    }
}
