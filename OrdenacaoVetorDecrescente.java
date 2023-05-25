// 4.9
import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoVetorDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Digite os 20 valores:");

        for (int i = 0; i < 20; i++) {
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);
        int[] vetorDecrescente = new int[20];

        for (int i = 0; i < 20; i++) {
            vetorDecrescente[i] = vetor[19 - i];
        }

        System.out.println("Valores em ordem decrescente:");

        for (int i = 0; i < 20; i++) {
            System.out.print(vetorDecrescente[i] + " ");
        }

        sc.close();
    }
}
