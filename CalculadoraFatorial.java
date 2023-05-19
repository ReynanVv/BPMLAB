import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            int valor;
            do {
                System.out.print("Digite um valor inteiro não negativo: ");
                valor = sc.nextInt();
            } while (valor < 0);

            long fatorial = calcularFatorial(valor);
            System.out.println(valor + "! = " + fatorial);

            System.out.print("Deseja calcular o fatorial novamente? (S/N): ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("S"));

        sc.close();
    }

    public static long calcularFatorial(int valor) {
        if (valor == 0 || valor == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = valor; i >= 2; i--) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
