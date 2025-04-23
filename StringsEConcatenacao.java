import java.util.Scanner;
public class StringsEConcatenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu primeiro nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.printf("Seja bem vindo %s %s!", nome, sobrenome);

        sc.close();
    }
}
