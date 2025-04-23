import java.util.Scanner;
import java.util.Locale;
public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        System.out.println("====== CONVERTENDO GRAUS CELSIUS PARA FAHRENHEIT ====== ");
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double F = (celsius * 9/5) + 32;

        System.out.printf("Graus celsius = %.1f%n",celsius);
        System.out.printf("Graus fahrenheit = %.1f%n", F);

        sc.close();
    }
}
