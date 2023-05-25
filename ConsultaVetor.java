// 4.4
import java.util.Scanner;

public class ConsultaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem armazenados (até 20): ");
        int quantidadeValores = sc.nextInt();

        // Verifica se a quantidade de valores está dentro da faixa possível
        while (quantidadeValores < 1 || quantidadeValores > 20) {
            System.out.println("Quantidade inválida. Digite novamente:");
            quantidadeValores = sc.nextInt();
        }

        int[] vetor = new int[quantidadeValores];

        System.out.println("Digite os valores:");

        // Armazena os valores no vetor
        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        boolean continuarConsulta = true;

        while (continuarConsulta) {
            System.out.print("Digite um número para consulta (-1 para sair): ");
            int numero = sc.nextInt();

            if (numero == -1) {
                continuarConsulta = false;
            } else {
                int posicao = buscarValor(vetor, numero);

                if (posicao != -1) {
                    System.out.println("O número " + numero + " está na posição " + posicao + " do vetor.");
                } else {
                    System.out.println("Valor não encontrado!");
                }
            }
        }

        sc.close();
    }

    // Função auxiliar para buscar um valor no vetor e retornar sua posição (ou -1 se não encontrado)
    public static int buscarValor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
