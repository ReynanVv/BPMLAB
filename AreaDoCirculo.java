// A = π r²
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Pi = 3.1415;
        System.out.println("Digite o valor do diametro do círculo: ");
        double D = sc.nextDouble();
        double r = D / 2;
        double area = Pi * Math.pow(r, 2);
        System.out.printf("A área do círculo é: ", area);
        sc.close();
    }
}
