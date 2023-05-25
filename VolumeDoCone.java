// V= 1/3 h π r²
// 1.12
import java.util.Scanner;

public class VolumeDoCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Pi = 3.1415;
        System.out.println("Informe a altura do cone: ");
        double altura = sc.nextDouble();
        System.out.println("Informe o raio da base do cone: ");
        double raio = sc.nextDouble();
        double volume = (((1/3) * altura) * Pi) * Math.pow(raio, 2);
        System.out.printf("O Volume do cone é: ", volume);
        sc.close();
    }
}
