// 3.5
import java.util.Scanner;

public class TabuadaValorPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        do {
            System.out.print("Digite um valor positivo: ");
            valor = sc.nextInt();

            if (valor <= 0) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (valor <= 0);

        System.out.println("Tabuada do " + valor + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}

