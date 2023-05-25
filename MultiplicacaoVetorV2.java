// 4.3
import java.util.Scanner;

public class MultiplicacaoVetorV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorOriginal = new int[20];
        int[] vetorMultiplicado = new int[20];

        System.out.println("Digite 20 valores:");

        // Armazena os valores no vetorOriginal
        for (int i = 0; i < 20; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorOriginal[i] = sc.nextInt();
        }

        System.out.print("Digite uma constante multiplicativa: ");
        int constante = sc.nextInt();

        // Multiplica cada valor do vetorOriginal pela constante e armazena no vetorMultiplicado
        for (int i = 0; i < 20; i++) {
            vetorMultiplicado[i] = vetorOriginal[i] * constante;
        }

        System.out.println("Valores do vetorOriginal:");
        exibirVetor(vetorOriginal);

        System.out.println("Valores do vetorMultiplicado:");
        exibirVetor(vetorMultiplicado);

        sc.close();
    }

    // Função auxiliar para exibir os valores de um vetor
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

