
import java.util.Scanner;

public class VelocidadeDoAutomovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial (em m/s): ");
        double vi = sc.nextDouble();
        System.out.print("Digite a aceleração (em m/s²): ");
        double a = sc.nextDouble();
        System.out.print("Digite o tempo de percurso (em s): ");
        double t = sc.nextDouble();
        double vf = vi + a * t;
        vf *= 3.6;
        System.out.printf("A velocidade final é %.2f km/h", vf);
        sc.close();
    }
}