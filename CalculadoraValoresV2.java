// 3.15
import java.util.Scanner;

public class CalculadoraValoresV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            int N;
            do {
                System.out.print("Digite a quantidade de valores (N): ");
                N = sc.nextInt();
            } while (N <= 0 || N >= 20);

            double maiorValor = Double.NEGATIVE_INFINITY;
            double menorValor = Double.POSITIVE_INFINITY;
            double soma = 0;
            int positivos = 0;
            int negativos = 0;

            for (int i = 1; i <= N; i++) {
                System.out.print("Digite o " + i + "º valor: ");
                double valor = sc.nextDouble();

                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                if (valor < menorValor) {
                    menorValor = valor;
                }

                soma += valor;

                if (valor > 0) {
                    positivos++;
                } else if (valor < 0) {
                    negativos++;
                }
            }

            double media = soma / N;
            double porcentagemPositivos = (positivos / (double) N) * 100;
            double porcentagemNegativos = (negativos / (double) N) * 100;

            System.out.println("O maior valor digitado é: " + maiorValor);
            System.out.println("O menor valor digitado é: " + menorValor);
            System.out.println("A soma dos valores é: " + soma);
            System.out.println("A média aritmética dos valores é: " + media);
            System.out.println("A porcentagem de valores positivos é: " + porcentagemPositivos + "%");
            System.out.println("A porcentagem de valores negativos é: " + porcentagemNegativos + "%");

            System.out.print("Deseja executar novamente? (S/N): ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("S"));

        sc.close();
    }
}
