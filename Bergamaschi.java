public class Bergamaschi {
    public static void main(String[] args) {
        int n = 20; // Quantidade de valores da série a serem exibidos
        int[] bergamaschi = new int[n];

        // Inicialização dos primeiros três valores da série
        bergamaschi[0] = 1;
        bergamaschi[1] = 1;
        bergamaschi[2] = 1;

        // Cálculo dos valores subsequentes da série
        for (int i = 3; i < n; i++) {
            bergamaschi[i] = bergamaschi[i - 1] + bergamaschi[i - 2] + bergamaschi[i - 3];
        }

        // Exibição dos valores da série
        System.out.println("Os vinte primeiros valores da série de Bergamaschi são:");
        for (int i = 0; i < n; i++) {
            System.out.print(bergamaschi[i] + " ");
        }
    }
}

