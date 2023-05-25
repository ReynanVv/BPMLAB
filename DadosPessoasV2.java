// 4.6
import java.util.Scanner;

public class DadosPessoasV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nomes = new String[20];
        char[] sexos = new char[20];
        int[] idades = new int[20];
        
        System.out.println("Digite os dados das pessoas:");
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Pessoa " + (i + 1));
            
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            
            System.out.print("Sexo (F/M): ");
            sexos[i] = sc.nextLine().toUpperCase().charAt(0);
            while (sexos[i] != 'F' && sexos[i] != 'M') {
                System.out.print("Sexo inválido. Digite novamente (F/M): ");
                sexos[i] = sc.nextLine().toUpperCase().charAt(0);
            }
            
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            while (idades[i] <= 0) {
                System.out.print("Idade inválida. Digite novamente: ");
                idades[i] = sc.nextInt();
            }
            
            sc.nextLine(); // Limpar o buffer do scanner
        }
        
        System.out.println("\nDados das pessoas com idade superior a 18 anos:");
        
        int quantidadePessoas = 0;
        
        for (int i = 0; i < 20; i++) {
            if (idades[i] > 18) {
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Sexo: " + sexos[i]);
                System.out.println("Idade: " + idades[i]);
                System.out.println();
                
                quantidadePessoas++;
            }
        }
        
        System.out.println("Quantidade de pessoas listadas: " + quantidadePessoas);
        sc.close();
    }
}

