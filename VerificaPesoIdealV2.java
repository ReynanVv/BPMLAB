// 2.11
import java.util.Scanner;

public class VerificaPesoIdealV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        String sexo = sc.next();
        
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        
        double relacao = calcularRelacaoPesoAltura(peso, altura);
        
        if (sexo.equalsIgnoreCase("M")) {
            if (relacao < 20) {
                System.out.println("Abaixo do Peso");
            } else if (relacao < 25) {
                System.out.println("Peso Ideal");
            } else {
                System.out.println("Acima do Peso");
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (relacao < 19) {
                System.out.println("Abaixo do Peso");
            } else if (relacao < 24) {
                System.out.println("Peso Ideal");
            } else {
                System.out.println("Acima do Peso");
            }
        } else {
            System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
        }
        
        sc.close();
    }
    
    private static double calcularRelacaoPesoAltura(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }
}
