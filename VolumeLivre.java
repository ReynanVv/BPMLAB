// V = 4/3 π r³ esfera
// V = a³ cubo
// 1.14

import java.util.Scanner;

public class VolumeLivre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Pi = 3.1415;
        System.out.println("Informe o valor das arestas do cubo: ");
        double aresta = sc.nextDouble();
        System.out.println("Informe o raio da esfera: ");
        double raio = sc.nextDouble();
        double volumeLivre =  (((4/3) * Pi) * Math.pow(raio, 3)) - Math.pow(aresta, 3);
        System.out.printf("O Volume livre do ambiente é: %.3f", volumeLivre);
        sc.close();
    }
}
