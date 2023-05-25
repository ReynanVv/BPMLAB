// 1.18
import java.util.Scanner;

public class CompraETroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valoresProdutos = new double[5];
        double totalCompra = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor do produto " + (i + 1) + ": ");
            valoresProdutos[i] = sc.nextDouble();

            totalCompra += valoresProdutos[i];
        }

        System.out.print("Digite o valor do pagamento: ");
        double valorPagamento = sc.nextDouble();

        double troco = valorPagamento - totalCompra;

        System.out.printf("Troco a ser devolvido: R$ %.2f", troco);
        sc.close();
    }
}
