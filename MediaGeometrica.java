// 1.7
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> valores = new ArrayList<Double>();
        while (valores.size() < 2) {
            System.out.println("Digite um valor qualquer: ");
            Double valor = sc.nextDouble();
            valores.add(valor);
        }
        double multi = 1;
        for (Double valor : valores){
            multi *= valor;
        }
        float media = (float) Math.sqrt(multi);
        System.out.println(String.format("A média geométrica dos números digitados é: %.2f", media));
        sc.close();
    }
    
}
