// 2.1
import java.util.Scanner;

public class ExibirMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        
        double maiorValor;
        
        if (valor1 > valor2) {
            maiorValor = valor1;
        } else {
            maiorValor = valor2;
        }
        
        System.out.println("O maior valor digitado é: " + maiorValor);
        sc.close();
    }
}

