// U = R * I
// 1.9
import java.util.Scanner;

public class LeiDeOhm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da resistência elétrica: ");
        double R = sc.nextDouble();
        System.out.println("Digite o valor da corrente elétrica: ");
        double I = sc.nextDouble();
        double U = R * I;
        System.out.println(String.format("Tensão do circuito eletrônico: %.2f", U));
        sc.close();
    }
}
