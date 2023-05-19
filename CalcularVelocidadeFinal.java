import java.util.Scanner;

public class CalcularVelocidadeFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a aceleração (m/s²): ");
        double aceleracao = sc.nextDouble();
        
        System.out.print("Digite a velocidade inicial (m/s): ");
        double velocidadeInicial = sc.nextDouble();
        
        System.out.print("Digite o tempo de percurso (s): ");
        double tempo = sc.nextDouble();
        
        double velocidadeFinal = calcularVelocidadeFinal(aceleracao, velocidadeInicial, tempo);
        
        double velocidadeFinalKmH = converterMetrosPorSegundoParaKmPorHora(velocidadeFinal);
        
        System.out.println("Velocidade Final: " + velocidadeFinalKmH + " km/h");
        
        if (velocidadeFinalKmH <= 40) {
            System.out.println("Veículo muito lento");
        } else if (velocidadeFinalKmH <= 60) {
            System.out.println("Velocidade permitida");
        } else if (velocidadeFinalKmH <= 80) {
            System.out.println("Velocidade de cruzeiro");
        } else if (velocidadeFinalKmH <= 120) {
            System.out.println("Veículo rápido");
        } else {
            System.out.println("Veículo muito rápido");
        }
        
        sc.close();
    }
    
    private static double calcularVelocidadeFinal(double aceleracao, double velocidadeInicial, double tempo) {
        return velocidadeInicial + aceleracao * tempo;
    }
    
    private static double converterMetrosPorSegundoParaKmPorHora(double velocidadeMetrosPorSegundo) {
        return velocidadeMetrosPorSegundo * 3.6;
    }
}

