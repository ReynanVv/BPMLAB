import java.util.Scanner;

public class ExibirMenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        
        double menorValor;
        
        if (valor1 < valor2) {
            menorValor = valor1;
        } else {
            menorValor = valor2;
        }
        
        System.out.println("O menor valor digitado é: " + menorValor);
        sc.close();
    }
}

