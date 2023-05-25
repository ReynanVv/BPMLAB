// 2.5
import java.util.Scanner;

public class TerrenoGrandeOuPequeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("Área do retângulo: " + area);

        if (area > 100) {
            System.out.println("Terreno grande");
        } else {
            System.out.println("Terreno pequeno");
        }

        sc.close();
    }
}

