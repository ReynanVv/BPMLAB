// 1.16
import java.util.Scanner;

public class FuncoesTrigonometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo em graus: ");
        double anguloGraus = sc.nextDouble();
        double anguloRadianos = Math.toRadians(anguloGraus);
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1 / Math.cos(anguloRadianos);

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        sc.close();
    }
}
