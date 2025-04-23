import java.util.Scanner;
import java.util.Locale;

public class AreaDoRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Informe a largura do retângulo: ");
        double largura = sc.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = largura * altura;

        System.out.println("A área do retângulo é = " + area + " metros quadrados");

        sc.close();
    }
}
