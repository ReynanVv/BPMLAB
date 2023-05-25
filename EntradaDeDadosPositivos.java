// 3.1
import java.util.Scanner;

public class EntradaDeDadosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = lerValorPositivo(sc);

        System.out.println("Valor positivo digitado: " + valor);

        sc.close();
    }

    private static int lerValorPositivo(Scanner sc) {
        int valor;

        do {
            System.out.print("Digite um valor positivo (>0): ");
            valor = sc.nextInt();

            if (valor <= 0) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (valor <= 0);

        return valor;
    }
}
