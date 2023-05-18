import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = sc.nextDouble();

        double potencia = Math.exp(y * Math.log(x));
        System.out.println("O resultado de X elevado a Y é: " + potencia);
        sc.close();
    }
}
