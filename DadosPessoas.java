// 4.5
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadePessoas = 20;
        String[] nomes = new String[quantidadePessoas];
        char[] sexos = new char[quantidadePessoas];
        int[] idades = new int[quantidadePessoas];

        System.out.println("Digite os dados das pessoas:");

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Sexo (F/M): ");
            sexos[i] = Character.toUpperCase(sc.nextLine().charAt(0));

            // Consiste a entrada para aceitar apenas "F" ou "M" para o sexo
            while (sexos[i] != 'F' && sexos[i] != 'M') {
                System.out.println("Sexo inválido. Digite novamente (F/M): ");
                sexos[i] = Character.toUpperCase(sc.nextLine().charAt(0));
            }

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner

            // Consiste a entrada para aceitar apenas valores positivos para a idade
            while (idades[i] <= 0) {
                System.out.println("Idade inválida. Digite novamente: ");
                idades[i] = sc.nextInt();
                sc.nextLine(); // Limpar o buffer do scanner
            }
        }

        System.out.println("\nDados das pessoas do sexo feminino:");

        for (int i = 0; i < quantidadePessoas; i++) {
            if (sexos[i] == 'F') {
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Sexo: " + sexos[i]);
                System.out.println("Idade: " + idades[i]);
                System.out.println("---------------------------");
            }
        }

        sc.close();
    }
}
