import java.util.Scanner;

public class ValoresInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int primeiroValor, segundoValor;
        
        do {
            System.out.print("Digite o primeiro valor: ");
            primeiroValor = sc.nextInt();
            
            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            segundoValor = sc.nextInt();
            
            if (segundoValor <= primeiroValor) {
                System.out.println("O segundo valor deve ser maior que o primeiro. Digite novamente.");
            }
        } while (segundoValor <= primeiroValor);
        
        System.out.println("Valores digitados: " + primeiroValor + " e " + segundoValor);
        
        sc.close();
    }
}
