// 2.6
import java.util.Scanner;

public class MaiorEntreTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();
        
        double maiorValor;
        
        if (valor1 > valor2 && valor1 > valor3) {
            maiorValor = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maiorValor = valor2;
        } else {
            maiorValor = valor3;
        }
        
        System.out.println("O maior valor digitado é: " + maiorValor);
        sc.close();
    }
}
