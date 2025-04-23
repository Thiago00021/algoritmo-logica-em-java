import java.util.Scanner;
public class VerificacaoDeMaioria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        System.out.print("Digite a idade da terceira pessoa: ");
        int idade3 = sc.nextInt();

        int maiores = 0;
        if (idade1 >= 18) maiores++;
        if (idade2 >= 18) maiores++;
        if (idade3 >= 18) maiores++;

        if (maiores >= 2) {
            System.out.println("Pelo menos duas pessoas são maiores de idade.");
        } else {
            System.out.println("Menos de duas pessoas são maiores de idade.");
        }
        sc.close();
    }
}
