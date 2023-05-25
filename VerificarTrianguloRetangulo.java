// 2.9
import java.util.Scanner;

public class VerificarTrianguloRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();
        
        if (verificarTrianguloRetangulo(a, b, c)) {
            System.out.println("Os valores formam um triângulo retângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo retângulo.");
        }
        
        sc.close();
    }
    
    private static boolean verificarTrianguloRetangulo(double a, double b, double c) {
        double hipotenusa;
        double cateto1;
        double cateto2;
        
        if (a >= b && a >= c) {
            hipotenusa = a;
            cateto1 = b;
            cateto2 = c;
        } else if (b >= a && b >= c) {
            hipotenusa = b;
            cateto1 = a;
            cateto2 = c;
        } else {
            hipotenusa = c;
            cateto1 = a;
            cateto2 = b;
        }
        
        return Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
    }
}
