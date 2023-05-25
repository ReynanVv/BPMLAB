// 4.11
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenacaoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[20];
        char[] sexos = new char[20];
        int[] idades = new int[20];

        System.out.println("Digite os dados das 20 pessoas:");

        for (int i = 0; i < 20; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Sexo (M/F): ");
            sexos[i] = sc.nextLine().charAt(0);
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do teclado
        }

        // Ordenar os dados em ordem decrescente de idade
        Pessoa[] pessoas = new Pessoa[20];
        for (int i = 0; i < 20; i++) {
            pessoas[i] = new Pessoa(nomes[i], sexos[i], idades[i]);
        }

        Arrays.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return Integer.compare(pessoa2.getIdade(), pessoa1.getIdade());
            }
        });

        System.out.println("Dados em ordem decrescente de idade:");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        sc.close();
    }

    static class Pessoa {
        private String nome;
        private char sexo;
        private int idade;

        public Pessoa(String nome, char sexo, int idade) {
            this.nome = nome;
            this.sexo = sexo;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Sexo: " + sexo + ", Idade: " + idade;
        }
    }
}

