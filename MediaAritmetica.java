// 1.6
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<Integer>();
        while (valores.size() < 4) {
            System.out.println("Digite um valor inteiro qualquer: ");
            int valor = sc.nextInt();
            valores.add(valor);
        }
        int soma = 0;
        for (Integer valor : valores){
            soma += valor;
        }
        float media = (float) soma / valores.size();
        System.out.println(String.format("A média aritmética dos números digitados é: %.2f", media));
        sc.close();
    }
}
