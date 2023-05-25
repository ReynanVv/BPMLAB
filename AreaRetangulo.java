// 1.1
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area do retângulo");
        System.out.println("Digite o valor da base: ");
        float base = sc.nextFloat();
        sc.nextLine();
        System.out.println("Digite o valor da altura: ");
        float altura = sc.nextFloat();
        sc.nextLine();
        float area = base * altura;
        System.out.println(String.format("Area do retângulo: %.2f",area));
        sc.close();
    }
}
