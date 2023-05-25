// 3.11
import java.util.Scanner;

public class SomaSequenciaV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um valor para N (positivo e menor que 50): ");
            n = sc.nextInt();
        } while (n <= 0 || n >= 50);

        double soma = calcularSomaSequencia(n);

        System.out.println("A soma dos " + n + " primeiros valores da sequência é: " + soma);

        sc.close();
    }

    public static double calcularSomaSequencia(int n) {
        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += (double) i / (i + 1);
        }

        return soma;
    }
}
