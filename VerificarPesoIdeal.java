// 2.7
import java.util.Scanner;

public class VerificarPesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        
        double indice = peso / (altura * altura);
        
        System.out.println("Relação Peso/Altura²: " + indice);
        
        if (indice < 20) {
            System.out.println("Abaixo do Peso");
        } else if (indice < 25) {
            System.out.println("Peso Ideal");
        } else {
            System.out.println("Acima do Peso");
        }
        
        sc.close();
    }
}
