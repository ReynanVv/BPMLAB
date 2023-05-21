import java.util.Scanner;

public class MultiplicacaoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Digite 20 valores:");

        // Armazena os valores no vetor
        for (int i = 0; i < 20; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite uma constante multiplicativa: ");
        int constante = sc.nextInt();

        // Multiplica cada valor do vetor pela constante
        for (int i = 0; i < 20; i++) {
            vetor[i] *= constante;
        }

        System.out.println("Valores do vetor após a multiplicação:");

        // Exibe os valores do vetor após a multiplicação
        for (int i = 0; i < 20; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
