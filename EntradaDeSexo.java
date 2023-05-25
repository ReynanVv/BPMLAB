// 3.3
import java.util.Scanner;

public class EntradaDeSexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sexo = lerSexo(sc);

        System.out.println("Sexo digitado: " + sexo);

        sc.close();
    }

    private static String lerSexo(Scanner sc) {
        String sexo;

        do {
            System.out.print("Digite o sexo (F/M): ");
            sexo = sc.nextLine().toUpperCase();

            if (!sexo.equals("F") && !sexo.equals("M")) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (!sexo.equals("F") && !sexo.equals("M"));

        return sexo;
    }
}
