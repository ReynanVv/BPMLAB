/* Sabendo que uma milha marítima equivale a um mil, oitocentos e
cinqüenta e dois metros e que um quilômetro possui mil metros, fazer um
programa para converter milhas marítimas em quilômetros.
1 Milha náutica é igual a 1,85 km
*/
// 1.8

import java.util.Scanner;

public class MilhasVsKm{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        double milhaMaritmaEmKm = 1.85;
        System.out.println("Digite o valor da milha marítima: ");
        double valor = sc.nextDouble();
        double conversor = valor * milhaMaritmaEmKm;
        System.out.println(String.format("Valor convertido em quilômetros: %.2f", conversor));
        Thread.sleep(3000); 
        sc.close();
        
    }
}