import java.util.Scanner;

public class Cedula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor que quer retirar: ");
        int dinheiro = sc.nextInt();

        int nota100 = dinheiro / 100;
        dinheiro %= 100;

        int nota50 = dinheiro / 50;
        dinheiro %= 50;

        int nota20 = dinheiro / 20;
        dinheiro %= 20;

        int nota10 = dinheiro / 10;
        dinheiro %= 10;

        int nota5 = dinheiro / 5;
        dinheiro %= 5;

        int nota2 = dinheiro / 2;
        dinheiro %= 2;

        System.out.println("Cédulas:");
        System.out.println("Nota(s) de 100: " + nota100);
        System.out.println("Nota(s) de 50: " + nota50);
        System.out.println("Nota(s) de 20: " + nota20);
        System.out.println("Nota(s) de 10: " + nota10);
        System.out.println("Nota(s) de 5: " + nota5);
        System.out.println("Nota(s) de 2: " + nota2);

        if (dinheiro != 0) {
            System.out.println("Valor restante que não pode ser sacado: " + dinheiro);
        }

        sc.close();
    }
}
