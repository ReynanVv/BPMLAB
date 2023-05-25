// 3.13
import java.util.Scanner;

public class CalculadoraValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maiorValor = 0;
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            double valor;
            do {
                System.out.print("Digite o " + i + "º valor positivo: ");
                valor = sc.nextDouble();
            } while (valor <= 0);

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            soma += valor;
        }

        double media = soma / 10;

        System.out.println("O maior valor digitado é: " + maiorValor);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média aritmética dos valores é: " + media);

        sc.close();
    }
}
