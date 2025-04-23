import java.util.Scanner;
import java.util.Locale;
public class EntradaDeDados {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      Locale.setDefault(Locale.US);

        System.out.print("Informe um número inteiro: ");
        int numero1 = sc.nextInt();

        System.out.print("Informe um número decimal: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        System.out.printf("A soma entre %d e %.2f = %.2f ", numero1, numero2, soma);

        sc.close();
    }
}
