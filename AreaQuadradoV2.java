// 1.3
import java.util.Scanner;

public class AreaQuadradoV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal do quadrado: ");
        double diagonal = sc.nextDouble();

        double lado = diagonal / Math.sqrt(2); // Calcula o valor do lado do quadrado
        double area = lado * lado; // Calcula a área do quadrado

        System.out.println("A área do quadrado é: " + area);

        sc.close();
    }
}
