import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = sc.nextDouble();
        
        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = sc.nextDouble();
        
        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = sc.nextDouble();
        
        if (verificarTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        
        sc.close();
    }
    
    private static boolean verificarTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
