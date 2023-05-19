import java.util.Scanner;

public class SomaSequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um valor para N (positivo e menor que 100): ");
            n = sc.nextInt();
        } while (n <= 0 || n >= 100);

        int soma = calcularSomaSequencia(n);

        System.out.println("A soma dos " + n + " primeiros valores da sequência é: " + soma);

        sc.close();
    }

    public static int calcularSomaSequencia(int n) {
        int soma = 0;
        int valor = 2;

        for (int i = 0; i < n; i++) {
            soma += valor;
            valor += (i + 1) * 2;
        }

        return soma;
    }
}

