import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Digite os 20 valores:");

        for (int i = 0; i < 20; i++) {
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Valores em ordem crescente:");

        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}

