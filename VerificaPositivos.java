import java.util.Scanner;
public class VerificaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        int positivos = 0;
        if (a > 0) positivos++;
        if (b > 0) positivos++;
        if (c > 0) positivos++;

        if (positivos >= 2) {
            System.out.println("Pelo menos dois números são positivos.");
        } else {
            System.out.println("Menos de dois números são positivos.");
        }

        sc.close();
    }
}