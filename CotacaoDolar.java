import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da cotação do dólar: ");
        double cotacao = sc.nextDouble();
        System.out.println("Informe uma quantia em dólar");
        double qtnDolar = sc.nextDouble();
        double valorReais = cotacao * qtnDolar;
        System.out.printf("O valor convertido em Reais é R$ %.2f", valorReais);
        sc.close();
    }
}
