// 2.3
import java.util.Scanner;

public class MaiorValorOuIdentico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        
        if (valor1 > valor2) {
            System.out.println("O maior valor digitado é: " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maior valor digitado é: " + valor2);
        } else {
            System.out.println("Os números são idênticos.");
        }
        sc.close();
    }
}
