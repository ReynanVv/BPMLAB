import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área do Triângulo");
        System.out.println("Digite o valor da base: ");
        float base = sc.nextFloat();
        sc.nextLine();
        System.out.println("Digite o valor da altura: ");
        float altura = sc.nextFloat();
        sc.nextLine();
        float area = (base * altura) / 2;
        System.out.println(String.format("Área do Triângulo: %.2f", area));
    }
}
