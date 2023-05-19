public class Fibonacci {
    public static void main(String[] args) {
        int n = 30; // Quantidade de valores da série a serem exibidos
        int[] fibonacci = new int[n];

        // Inicialização dos primeiros dois valores da série
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Cálculo dos valores subsequentes da série
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Exibição dos valores da série
        System.out.println("Os trinta primeiros valores da série de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
