// 1.19
import java.util.Scanner;

public class CalculoNotaSegundaAvaliacao {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor da primeira nota (P1): ");
        double p1 = sc.nextDouble();
        
        double mediaDesejada = 5.00;
        
        double p2 = (3 * mediaDesejada - p1) / 2;
        
        System.out.printf("O aluno precisa tirar %.2f na segunda nota (P2) para ser aprovado.%n", p2);
        Thread.sleep(3000);

        sc.close();
    }
}