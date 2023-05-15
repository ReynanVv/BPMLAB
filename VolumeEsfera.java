import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        double PI = 3.14F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Volume da Esfera");
        System.out.println("Digite o valor do Diâmetro: ");
        double D = sc.nextDouble();
        sc.nextLine();
        double Raio = D / 2;
        System.out.println(String.format("valor do Raio: %.2f", Raio));
        double Volume = ((4*PI) * Math.pow(Raio,3)) / 3;
        System.out.println(String.format("Volume da Esfera: %.3f", Volume));
        sc.close();
    }
}
