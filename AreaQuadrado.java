// 1.2
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area do Quadrado");
        System.out.println("Digite o Valor da aresta: ");
        float L = sc.nextFloat();
        sc.nextLine();
        float area = L * L;
        System.out.println(String.format("Area do Quadrado: %.2f",area));
        sc.close();
    }
}
