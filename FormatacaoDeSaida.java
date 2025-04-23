import java.util.Scanner;
import java.util.Locale;
public class FormatacaoDeSaida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Informe um valor decimal: ");
        double numeroDecimal = sc.nextDouble();
        System.out.printf("Seu número informado com 2 casas decimais = %.2f%n",numeroDecimal);

        sc.close();
    }
}
