// 3.12
import java.util.Scanner;

public class SomaSequenciaV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite um valor positivo menor que 50 (N): ");
            n = sc.nextInt();

            if (n <= 0 || n >= 50) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (n <= 0 || n >= 50);

        double soma = 0.0;
        double numerador = 2.0;
        double incremento = 3;
        double denominador = 1;

        System.out.println("Os " + n + " primeiros termos da sequência são:");
        for (int i = 1; i <= n; i++) {
            
            double denominadorPow = Math.pow(denominador, 3);
            double termo = numerador / denominadorPow;
            System.out.println(termo);
            soma += termo;
            numerador += incremento;
            denominador += 1;
            incremento += 2;
        }

        System.out.println("A soma dos " + n + " primeiros termos da sequência é: " + soma);

        sc.close();
    }
}
