// F = (°C x 1,8) + 32
// 1.10
import java.util.Scanner;

public class GrausVsFahrenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor em °C para ser convertido em Farenheit: ");
        double celsios = sc.nextDouble();
        double converte = (celsios * 1.8) + 32;
        System.out.printf("O resultado em Farenheit é: ", converte); 
        sc.close();
    }
}