// 4.7
import java.util.Scanner;

public class DadosPessoasV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[20];
        char[] genders = new char[20];
        int[] ages = new int[20];
        int count = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (F ou M):");
            char gender = sc.next().charAt(0);

            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int age = sc.nextInt();

            sc.nextLine(); // Limpar o buffer do teclado

            if (gender == 'F' || gender == 'M') {
                if (age > 0) {
                    names[count] = name;
                    genders[count] = gender;
                    ages[count] = age;
                    count++;
                } else {
                    System.out.println("Idade inválida. Digite um valor positivo.");
                }
            } else {
                System.out.println("Sexo inválido. Digite F para feminino ou M para masculino.");
            }

            if (count == 20) {
                System.out.println("Limite máximo de pessoas atingido.");
                break;
            }
        }

        System.out.println("Pessoas com idade superior a 18 anos:");

        for (int i = 0; i < count; i++) {
            if (ages[i] > 18) {
                System.out.println("Nome: " + names[i]);
                System.out.println("Sexo: " + genders[i]);
                System.out.println("Idade: " + ages[i]);
                System.out.println("------------------------");
            }
        }

        double percentage = (double) count / 20 * 100;
        System.out.println("Total de pessoas listadas: " + count);
        System.out.println("Porcentagem em relação ao total: " + percentage + "%");

        sc.close();
    }
}

