// 2.13
import java.util.Scanner;

public class CalcularMediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota da P1: ");
        double p1 = sc.nextDouble();
        
        System.out.print("Digite a nota da P2: ");
        double p2 = sc.nextDouble();
        
        double media = calcularMedia(p1, p2);
        
        System.out.println("Média: " + media);
        
        if (media >= 5.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        sc.close();
    }
    
    private static double calcularMedia(double p1, double p2) {
        return (p1 + 2 * p2) / 3;
    }
}
