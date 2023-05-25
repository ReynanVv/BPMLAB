// 3.6
import java.util.Scanner;

public class TabuadaValorIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, intervaloA, intervaloB;
        do {
            System.out.print("Digite um valor positivo: ");
            valor = sc.nextInt();

            if (valor <= 0) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (valor <= 0);

        do {
            System.out.print("Digite o intervalo (A e B, onde B > A): ");
            intervaloA = sc.nextInt();
            intervaloB = sc.nextInt();

            if (intervaloB <= intervaloA) {
                System.out.println("Valores de intervalo inválidos. Digite novamente.");
            }
        } while (intervaloB <= intervaloA);

        System.out.println("Tabuada do " + valor + " no intervalo de " + intervaloB + " para " + intervaloA + ":");

        for (int i = intervaloB; i >= intervaloA; i--) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}
