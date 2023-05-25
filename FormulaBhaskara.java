// 2.10
import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();
        
        double delta = calcularDelta(a, b, c);
        
        if (delta > 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Duas raízes: " + raiz1 + " e " + raiz2);
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Duas raízes iguais: " + raiz);
        } else {
            System.out.println("Delta negativo - Nenhuma raiz real");
        }
        
        sc.close();
    }
    
    private static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
