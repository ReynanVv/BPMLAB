// 4.1
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");

        // Armazena os números na memória
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Valores digitados na ordem inversa:");

        // Exibe os valores na ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}
