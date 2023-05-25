// 4.10
import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[20];

        System.out.println("Digite os nomes das 20 pessoas:");

        for (int i = 0; i < 20; i++) {
            nomes[i] = sc.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");

        for (int i = 0; i < 20; i++) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
